/*
 * Copyright (c) 2017. All rights reserved. 
 *
 * @autor Mair Eva
 * 12.10.2017
 *
 */
package visitor;

import importMain.RDFImport;
import model.ElementInBoundary;
import model.PESTEListarElementWithBoundary;
import model.PESTEListarElementWithoutBoundary;
import model.Relation;


/**
 * The Class PESTEListarRelationVisitor.
 */
public class PESTEListarRelationVisitor implements PESTEListarVisitor{

	/* (non-Javadoc)
	 * @see visitor.PESTEListarVisitor#visit(model.ElementInBoundary)
	 */
	@Override
	public void visit(ElementInBoundary element) {
		
		for(Relation r : element.getRel()){
				
			String rel = generateXMLRelation(r);
			
			if(r.getPred().equals("dependerOf")){
				RDFImport.setRelations(RDFImport.getRelations() + rel);
			}else{
				RDFImport.setBoundaryRelations(RDFImport.getBoundaryRelations() + rel);
			}
									
		}
				
	}


	/* (non-Javadoc)
	 * @see visitor.PESTEListarVisitor#visit(model.PESTEListarElementWithBoundary)
	 */
	@Override
	public void visit(PESTEListarElementWithBoundary element) {
		for(Relation r : element.getRel()){
						
			RDFImport.setRelations(RDFImport.getRelations() + generateXMLRelation(r));
		}
		
	}
	
	/* (non-Javadoc)
	 * @see visitor.PESTEListarVisitor#visit(model.PESTEListarElementWithoutBoundary)
	 */
	@Override
	public void visit(PESTEListarElementWithoutBoundary element) {
			
		for(Relation r : element.getRel()){
			
			RDFImport.setRelations(RDFImport.getRelations() + generateXMLRelation(r));
		}
		
	}

	
	
	/**
	 * Generate XML relation out of the Java object.
	 *
	 * @param r
	 *            Java object relation to be generated to XML
	 * @return the XML string
	 */
	private String generateXMLRelation(Relation r) {
		
		String sub = r.getSub().getName();
		String pred = r.getPred();
		String obj = r.getObj().getName();
		
		String subport = null;
		if(r.getPortSub() != null){
			subport = r.getPortSub().getName();
		}
		
		String objport = null;
		if(r.getPortObj() != null){
			objport = r.getPortObj().getName();
		}
		
		
		String XMLsPort = "";
		String XMLoPort = "";
						
		if(subport != null){
			XMLsPort = "<port href=\"#" + subport + "\"></port>\r\n";
		}
		
		if(objport != null){
			XMLoPort = "<port href=\"#" + objport + "\"></port>\r\n";
		}
			
		String s = "<binding >\r\n" +
				"<relationship type=\"" + pred + "\" ></relationship>\r\n" +
				"<connection>\r\n" +
				"<role type=\"" + getRole(pred, true) + "\" ></role>\r\n" +
				"<object href=\"#" + sub + "\"></object>\r\n" +
				XMLsPort + 
				"</connection>\r\n" +
				"<connection>\r\n" +
				"<role type=\"" + getRole(pred, false) + "\" ></role>\r\n" +
				"<object href=\"#" + obj + "\"></object>\r\n" +
				XMLoPort +
				"</connection>\r\n" +
				"</binding>\t\r\n";
		
		return s;
	}



	/**
	 * Gets the role depending on the predicate of the relation.
	 *
	 * @param pred
	 *            the predicate of the relation
	 * @param isFrom
	 *            true, if role is domain of relation. 
	 *            false, if role is range of relation.
	 * @return the role
	 */
	private String getRole(String pred, boolean isFrom) {
		
		String from = "";
		String to = "";
		
		switch(pred){
			case "dependerOf" :
				from = "Depender";
				to = "Dependee";
				break;
			case "isA" :			
				from = "Subclass";
				to = "Superclass";
				break;
			case "participatesIn" :
				from = "Member";
				to = "Participation";
				break;
			case "helps" :
				from = "Helper";
				to = "Helpee";
				break;
			case "hurts" :
				from = "Injurer";
				to = "Injuree";
				break;
			case "qualifies" :
				from = "Qualifier";
				to = "Qualifiee";
				break;
			case "refines" :
				from = "Refiner";
				to = "Refinee";
				break;
			default :
				from = "";
				to = "";
		}
		
		if(isFrom){
			return from;
		}else{
			return to;
		}
	}

}
