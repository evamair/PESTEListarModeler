/*
 * Copyright (c) 2017. All rights reserved. 
 *
 * @autor Mair Eva
 * 12.10.2017
 *
 */
package importMain;

import model.Actor;
import model.ActorWithBoundary;
import model.Agent;
import model.AgentWithBoundary;
import model.Goal;
import model.IntentionalElement;
import model.PESTEListarElement;
import model.PESTEListarElementWithBoundary;
import model.PestelFactor;
import model.Quality;
import model.Ressource;
import model.Task;


/**
 * The Class Helper.
 */
public class Helper {
	
	/**
	 * Generate XML footer.
	 */
	static void generateXMLFooter() {		
		RDFImport.setDoc(RDFImport.getDoc() + "</graph>\r\n" +
				"</gxl>\r\n");		
	}

	/**
	 * Generate XML header.
	 */
	static void generateXMLHeader() {
		RDFImport.setDoc("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
				"<gxl xmlns=\"http://www.metacase.com/gxlGOPRR\">\n" +
				"<graph type=\"PESTEL i-star\">\n" +
				"<slot name=\"Autor\">" +
				"<value>" +
				"<string>RDFImport</string>" +
				"</value>" +
				"</slot>" +
				"<slot name=\"Default Prefix\">" +
				"<value>" +
				"<string>http://example.org/</string>" +
				"</value>" +
				"</slot>" +
				"<slot name=\"Company\">" +
				"<value>" +
				"<string></string>" +
				"</value>" +
				"</slot>");

		
	}
	
	/**
	 * Gets the appropriate boundary element for elements which have subgraphs
	 *
	 * @param s
	 *            elements s, for which the appropriate boundary element has to be found
	 * @return the appropriate boundary element
	 */
	static PESTEListarElementWithBoundary getAppropriateBoundaryElement(PESTEListarElement s) {
		
		String subName = s.getName();
		
		if(subName.equals("Political") || subName.equals("Ecological") || subName.equals("Social") || subName.equals("Technological") || subName.equals("Economical") || subName.equals("Legal")){
			return new PestelFactor(subName);
		}
	
		
		if(s.getClass().getSimpleName().equals("Agent")){
			return new AgentWithBoundary(subName);
		}else{
			return new ActorWithBoundary(subName);
		}
	
	}
	
	
	/**
	 * Produce suitable java element.
	 *
	 * @param obj
	 *            RDF type
	 * @param sub
	 *            name of the RDF resource
	 * @return suitable Java Object with the name of the RDF resource
	 */
	static PESTEListarElement produceSuitableElement(String obj, String sub) {
		
		switch(obj){
			case "Actor" :
				return new Actor(sub);				
			case "Agent" :
				return new Agent(sub);			
			case "ActorWithBoundary" :
				return new ActorWithBoundary(sub);				
			case "AgentWithBoundary" :
				return new AgentWithBoundary(sub);				
			case "Task" :
				return new Task(sub);			
			case "Goal" :
				return new Goal(sub);			
			case "Quality" :
				return new Quality(sub);			
			case "Ressource" :
				return new Ressource(sub);				
			case "PESTELFactor" :
				return new PestelFactor(sub);
			case "IntentionalElement" :
				return new IntentionalElement(sub);
			default :
				return new IntentionalElement(sub);
		}
	}
	
	
	/**
	 * Extract name from URI.
	 *
	 * @param uri
	 *            the URI
	 * @return the extracted name
	 */
	static String extractNameFromURI(String uri){		
		int i = uri.lastIndexOf("/");		
		return uri.substring(i+1, uri.length()).replace('_', ' ');
	}

}
