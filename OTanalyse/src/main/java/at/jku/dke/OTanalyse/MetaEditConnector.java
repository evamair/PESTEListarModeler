/*
 * Copyright (c) 2017. All rights reserved. 
 *
 * @autor Mair Eva
 * 12.10.2017
 *
 */
package at.jku.dke.OTanalyse;

import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.metacase.type.*;
import com.metacase.wsdl.*;

import at.jku.dke.Model.Factor;


/**
 * The Class MetaEditConnector.
 */
public class MetaEditConnector {
	
	private static final Logger logger = Logger.getLogger(MetaEditConnector.class);
	
	
	/**
	 * Connect and manipulate MetaEdit+.
	 *
	 * @param deleteOnly
	 *            true, if model should only be reseted
	 */
	public static void connectAndManipulateMetaEdit(boolean deleteOnly){
		
		//Logger.getRootLogger().removeAllAppenders();
		//Logger.getRootLogger().addAppender(new NullAppender());
					
		//System.getProperties().setProperty("org.apache.commons.logging.simplelog.defaultlog", "ERROR");
		MetaEditAPI meServer = null;
        MetaEditAPIPortType port = null;
        
        METype graphPestel = new METype(); 
        METype graphFactorBoundary = new METype();
        MEOop[] boundaryGraphs = null;
        MEOop[] pestelGraphs = null;
        
        
        //Connect to API and get port
        try {
        	logger.info("Connecting to MetaEdit API");
            meServer = new MetaEditAPILocator();
            port = meServer.getMetaEditAPIPort();
        } catch (Exception ex) {
        	logger.info(ex.getMessage(), ex);
        	System.exit(1);
            
        }
        
        graphPestel.setName("PESTEL i-star");       
        graphFactorBoundary.setName("FactorBoundary");
        
        //Load graphs
        try {
        	logger.info("Loading all graphs of type \"FactorBoundary\"");
        	boundaryGraphs = port.allGoodInstances(graphFactorBoundary);
        	
        	logger.info("Loading all graphs of type \"PESTEL i-star\"");
        	pestelGraphs = port.allGoodInstances(graphPestel);
        	
        } catch (Exception ex) {
        	logger.info(ex.getMessage(), ex);
        	System.exit(1);
        }
        
        
        ArrayList<Factor> factors = QueryExecuter.factors;
        //ArrayList<String> elements = new ArrayList<String>();
        //ArrayList<MEAny> responses = new ArrayList<MEAny>();
        //ArrayList<String> log = new ArrayList<String>();
        Factor toRemove = null;
        
        //Manipulate MetaEdit+ graph
        try {
        	
        	//Define or reset actor as analysis element
        	logger.info("Loading actors/agents and manipulate one");        	       	
        	for(int i =0; i < pestelGraphs.length; i++){
        		
        		MEOop[] actors = port.objectSet(pestelGraphs[i]);

        		for(int j=0; j<actors.length; j++){
        			
        			MEAny[] props = port.allPropertiesValues(actors[j]);
        			
        			if(props.length > 1){
        				
        				//check if already defined as analysis-object
        				if(props[1].getMeValue().equals("true")){        					
        					MEAny booleanValue = new MEAny("Boolean", "false");
        					port.setValueAt(actors[j], 2, booleanValue);
        				}
        				
        				//define actual actor as analysis-object           			
            			if(!deleteOnly){
            				String elementName = props[0].getMeValue().replace("'", "");
            				
            				
            				if(elementName.equals(QueryExecuter.actor.substring(1).replace("_", " "))){
            					
            					MEAny booleanValue = new MEAny("Boolean", "true");
            					port.setValueAt(actors[j], 2, booleanValue);
            				}            				
            			}        							
        			}  				
        		}        			
        	}
        	
        	
        	logger.info("Loading intentional elements and manipulating them");
        	for(int i=0; i<boundaryGraphs.length; i++){
        		        		
        		MEOop[] intentionalElements = port.objectSet(boundaryGraphs[i]);
        		

        		for(int j=0; j<intentionalElements.length; j++){
        			
			
        			//Check if already defined as threat or opportunity
        			MEAny propertyOpp = port.valueAt(intentionalElements[j], 2);
        			MEAny propertyThr = port.valueAt(intentionalElements[j], 3);       
        			
        			if(propertyOpp.getMeValue().equals("true")){
        				MEAny booleanValue = new MEAny();
        				booleanValue.setMeType("Boolean");
        				booleanValue.setMeValue("false");
        				port.setValueAt(intentionalElements[j], 2, booleanValue);
        			}
        			if(propertyThr.getMeValue().equals("true")){
        				MEAny booleanValue = new MEAny();
        				booleanValue.setMeType("Boolean");
        				booleanValue.setMeValue("false");
        				port.setValueAt(intentionalElements[j], 3, booleanValue);
        			}        			
        			
        			
        			//Define opportunities and threats for choosen actor
        			if(!deleteOnly) {
	        			MEAny elementAny = port.valueAt(intentionalElements[j], 1);
	        			String elementName = elementAny.getMeValue().replace("'", "");

	        			   		
	        			for(Factor f: factors){
	        				toRemove = null;
		        			if(elementName.equals(f.getName())){
		        				MEAny booleanValue = new MEAny();
		        				booleanValue.setMeType("Boolean");
		        				booleanValue.setMeValue("true");
		        				if(f.getClassification().equals("Opportunity")){
		        					port.setValueAt(intentionalElements[j], 2, booleanValue);
		        				}else{
		        					port.setValueAt(intentionalElements[j], 3, booleanValue);
		        				}
		        				
		        				toRemove = f;
		    					break;
		        						        				        				
		        			}
	        			}
	        				
	        			if(toRemove != null){
	        				factors.remove(toRemove);
	        			}
        			
        			}
        		}
        	}
        	
        } catch (Exception ex) {
        	logger.info(ex.getMessage(), ex);
        	System.exit(1);
        }
        /*
        for(String s: log){
        	System.out.println(s);
        }
        
        for(String s: elements){
        	System.out.println(s);
        }
        
       
        
        for(MEAny m: responses){
        	System.out.println(m.getMeType());
        	System.out.println(m.getMeValue());        	
        }
		*/
	}
	
}
