/*
 * Copyright (c) 2017. All rights reserved. 
 *
 * @autor Mair Eva
 * 12.10.2017
 *
 */
package importMain;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.io.FileUtils;
import org.apache.jena.graph.Triple;
import org.apache.jena.riot.RDFParser;
import org.apache.jena.riot.lang.PipedRDFIterator;
import org.apache.jena.riot.lang.PipedRDFStream;
import org.apache.jena.riot.lang.PipedTriplesStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Node;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;
import org.xml.sax.InputSource;

import model.*;
import visitor.*;


/**
 * The Class RDFImport.
 */
public class RDFImport {
	
	private static final Logger logger = LoggerFactory.getLogger(RDFImport.class);
	private static String doc = "";
	private static String relations = "";
	private static String boundaryRelations = "";
	
	

	private static HashMap<String,PESTEListarElement> elementList = new HashMap<String,PESTEListarElement>();
	private static HashMap<PESTEListarElement,PESTEListarElement> subgraphs = new HashMap<PESTEListarElement,PESTEListarElement>();

	/**
	 * The main method.
	 *
	 * @param args
	 *        Requires the file path of the RDF File as argument    	
	 */
	public static void main(String[] args) {
		
		
		try{
			final String filepath = args[0];
			
			logger.info("Filepath: " + filepath);

			logger.info("Import and Iterate over RDF");
			importAndIterateOverRDF(filepath);

			logger.info("Build XML as String");
			generateXMLAsString();	
			
			
			logger.info("Format XML String");
			doc = formatXML(doc);
			
			logger.info("Convert String to XML File");
			convertStringToXMLFile();
			
			System.exit(0);
		}catch(IndexOutOfBoundsException e){
			logger.info("No arguments defined!");
		}
		
	}
	

	/**
	 * Converts generated XML string to XML file.
	 */
	private static void convertStringToXMLFile() {
		
		File file = new File("C:/temp/output.mxm");		
		Charset charset = Charset.forName("UTF-8");	
							
		try {
			FileUtils.writeStringToFile(file, doc, charset);
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}



	/**
	 * Builds a XML string by using the visitor pattern.
	 */
	private static void generateXMLAsString() {
		
		//Generate XML Header
		Helper.generateXMLHeader();
				
		PESTEListarVisitor visitor = new PESTEListarElementVisitor();
		for(PESTEListarElement e: elementList.values()){						
			if(!(e instanceof ElementInBoundary)){
				e.accept(visitor);				
			}			
		}
		doc = doc + relations;
				
		//Generate XML Footer
		Helper.generateXMLFooter();
	}


	/**
	 * Imports RDF and iterates over RDF Elements and generates Java elements.
	 *
	 * @param filepath
	 *            the path of the RDF file
	 */
	public static void importAndIterateOverRDF(String filepath){
		
				
		// Create a PipedRDFStream to accept input and a PipedRDFIterator to
	    // consume it
	    PipedRDFIterator<Triple> iter = new PipedRDFIterator<>();
	    final PipedRDFStream<Triple> inputStream = new PipedTriplesStream(iter);
	    ArrayList<Triple>  cache = new ArrayList<Triple>();

	    // PipedRDFStream and PipedRDFIterator need to be on different threads
	    ExecutorService executor = Executors.newSingleThreadExecutor();

	    // Create a runnable for our parser thread
	    Runnable parser = new Runnable() {

	        @Override
	        public void run() {
	            RDFParser.source(filepath).parse(inputStream);
	        }
	    }; 
	    
	    // Start the parser on another thread
	    executor.submit(parser);
	  

	    // We will consume the input on the main thread here
	    	    
   	   //Iterate over all Elements in order to add all elements to the elementList + add infos to cache
	    while (iter.hasNext()) {
	        Triple next = iter.next();
	        	        
	        String sub = Helper.extractNameFromURI(next.getMatchSubject().getURI());
	        String pred = Helper.extractNameFromURI(next.getMatchPredicate().getURI());
	        String obj = Helper.extractNameFromURI(next.getMatchObject().getURI());
	        
	        //Generate Java elements	        
	        if(pred.contains("#type")){	        	
	        	if(Helper.produceSuitableElement(obj,sub) != null){
	        		elementList.put(sub, Helper.produceSuitableElement(obj,sub));
	        	}
	        }else{
	        	cache.add(next);
	        }
	    }
	    iter.close();

	
	    
	  //Iterate again over elements to add all sub-elements to the subgraph
	    for (Triple t : cache) {
	    	      
	        String sub = Helper.extractNameFromURI(t.getMatchSubject().getURI());
	        String pred = Helper.extractNameFromURI(t.getMatchPredicate().getURI());
	        String obj = Helper.extractNameFromURI(t.getMatchObject().getURI());
	        
	        //Add subgraphs to pestel elements with boundary
	    	if (pred.contains("wants")){
	    		PESTEListarElement s = elementList.get(sub);
	    		//PESTEListarElement o = elementList.get(obj);
	    		//cache.remove(t);
	    		
	    		//Converts element without boundary to element with boundary
	    		if(!(s instanceof PESTEListarElementWithBoundary)){
	    			PESTEListarElementWithBoundary newSub = Helper.getAppropriateBoundaryElement(s);
		    		elementList.put(newSub.getName(), newSub);
	    		}
	    		
	        	//Add element to subgraph
	        	if(elementList.containsKey(sub)){
	        		subgraphs.put(elementList.get(obj),elementList.get(sub));
	        		
	        		PESTEListarElementWithBoundary eb = (PESTEListarElementWithBoundary) elementList.get(sub);
	        		ElementInBoundary intElem = (ElementInBoundary) elementList.get(obj);
	        		intElem.setInBoundary(true);
	        		eb.addElementToSubgraph(intElem);
	        	}
	        }
	    }
	    
	    
	    for (Triple t : cache) {
	    	String sub = Helper.extractNameFromURI(t.getMatchSubject().getURI());
	        String pred = Helper.extractNameFromURI(t.getMatchPredicate().getURI());
	        String obj = Helper.extractNameFromURI(t.getMatchObject().getURI());
	        
	        PESTEListarElement s = elementList.get(sub);
    		PESTEListarElement o = elementList.get(obj);
    		
    		
    		//Checks if there are intentional elements (goal, ressource, task, quality) outside the boundaries to connect intentional elements within boundaries.
    		//If so, these elements will be replaced by "intentional element"
    		if(s instanceof ElementInBoundary){
    			if(!((ElementInBoundary)s).isInBoundary()){
    				IntentionalElement e = new IntentionalElement(s.getName());
    				elementList.put(s.getName(), e);
    				s = e;
    				
    			}
    		}
    		if(o instanceof ElementInBoundary){	
    			if(!((ElementInBoundary)o).isInBoundary()){
    				IntentionalElement e = new IntentionalElement(o.getName());
    				elementList.put(o.getName(), e);
    				o = e;
    				
    			}
    		}

    		//Add relations to elements
	        if(!pred.contains("dependeeOf") && !pred.contains("wants")){
	        	if(!pred.contains("dependerOf")){
	        		
	        		s.addRelation(new Relation(s, null, pred, o, null));	        		
	        	}else{
	        		if(subgraphs.containsKey(s) || subgraphs.containsKey(o)){
		        		if(subgraphs.containsKey(s)){
		        			s.addRelation(new Relation(subgraphs.get(s), s, pred, o, null));
		        		}
		        		
		        		if(subgraphs.containsKey(o)){
		        			s.addRelation(new Relation(s, null, pred, subgraphs.get(o), o));
		        		}
	        		} else{
	        			s.addRelation(new Relation(s, null, pred, o, null));
	        		}
	        		
	        	}	        	
	        }	    	
	    }
	  		
	}
	
	
	/**
	 * Format XML.
	 *
	 * @param input
	 *            XML file as string
	 * @return the formatted string 
	 */
	public static String formatXML(String input){
	
	    try{
	    
	        final InputSource src = new InputSource(new StringReader(input));
	        final Node document = DocumentBuilderFactory.newInstance()
	                .newDocumentBuilder().parse(src).getDocumentElement();

	        final DOMImplementationRegistry registry = DOMImplementationRegistry
	                .newInstance();
	        final DOMImplementationLS impl = (DOMImplementationLS) registry
	                .getDOMImplementation("LS");
	        final LSSerializer writer = impl.createLSSerializer();
	        
	        writer.getDomConfig().setParameter("format-pretty-print",
	                Boolean.TRUE);
	        writer.getDomConfig().setParameter("xml-declaration", true);

	        return (writer.writeToString(document)).replace("UTF-16", "UTF-8");
	    } catch (Exception e){
	    
	        e.printStackTrace();
	        return input;
	    }
	}



	public static String getDoc() {
		return doc;
	}

	public static void setDoc(String string) {
		doc = string;		
	}

	public static String getRelations() {
		return relations;
	}

	public static void setRelations(String relations) {
		RDFImport.relations = relations;
	}
	
	public static String getBoundaryRelations() {
		return boundaryRelations;
	}

	public static void setBoundaryRelations(String boundaryRelations) {
		RDFImport.boundaryRelations = boundaryRelations;
	}

}
