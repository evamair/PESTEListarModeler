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
import model.PestelFactor;


/**
 * The Class PESTEListarElementVisitor.
 */
public class PESTEListarElementVisitor implements PESTEListarVisitor {
	
	
		
	/* (non-Javadoc)
	 * @see visitor.PESTEListarVisitor#visit(model.ElementInBoundary)
	 */
	@Override
	public void visit(ElementInBoundary element) {
		RDFImport.setDoc(RDFImport.getDoc() + generateXMLObject(element.getName(), element.getClass().getSimpleName(), false));
		PESTEListarVisitor relVis = new PESTEListarRelationVisitor();
		element.accept(relVis);
	}


	/* (non-Javadoc)
	 * @see visitor.PESTEListarVisitor#visit(model.PESTEListarElementWithoutBoundary)
	 */
	@Override
	public void visit(PESTEListarElementWithoutBoundary element) {
		RDFImport.setDoc(RDFImport.getDoc() + generateXMLObject(element.getName(), element.getClass().getSimpleName(), false));
		PESTEListarVisitor relVis = new PESTEListarRelationVisitor();
		element.accept(relVis);
	}

	/* (non-Javadoc)
	 * @see visitor.PESTEListarVisitor#visit(model.PESTEListarElementWithBoundary)
	 */
	@Override
	public void visit(PESTEListarElementWithBoundary element) {
		String type = "";
		if(element instanceof PestelFactor){
			type = element.getName();
		}else{
			type = element.getClass().getSimpleName();
		}
		RDFImport.setDoc(RDFImport.getDoc() + generateXMLObject(element.getName(), type, !element.emptySubgraph()));
		PESTEListarVisitor relVis = new PESTEListarRelationVisitor();
		element.accept(relVis);
		
		doSubgraph(element);
	}

	
	/**
	 * Visit all elements of the subgraph
	 *
	 * @param element
	 *            the element with the subgraph
	 */
	private void doSubgraph(PESTEListarElementWithBoundary element) {
		if(!element.emptySubgraph()){
			RDFImport.setBoundaryRelations("");
			
			if(element instanceof PestelFactor){
				RDFImport.setDoc(RDFImport.getDoc() + generateSubgraphOpenTag(element.getName(), true));
			}else{
				RDFImport.setDoc(RDFImport.getDoc() + generateSubgraphOpenTag(element.getName(), false));
			}
		
			PESTEListarVisitor elemVis = new PESTEListarElementVisitor();
			for (ElementInBoundary e :element.getSubgraph()){
				e.accept(elemVis);
				
			}
			RDFImport.setDoc(RDFImport.getDoc() + RDFImport.getBoundaryRelations());
			RDFImport.setBoundaryRelations("");
			RDFImport.setDoc(RDFImport.getDoc() + generateSubgraphCloseTag());
		}		
	}

	/**
	 * Generate subgraph close tag.
	 *
	 * @return the string
	 */
	private String generateSubgraphCloseTag() {
		return "</graph>\r\n" + "\t\t</object>\r\n";
	}

	/**
	 * Generate subgraph open tag.
	 *
	 * @param boundaryName
	 *            the boundary name
	 * @param isPestel
	 *            true, if it is a pestel factor
	 * @return the subgraph open tag
	 */
	private String generateSubgraphOpenTag(String boundaryName, boolean isPestel) {
		if(isPestel){
			return "<graph id=\"" + boundaryName +"Boundary\" type=\"FactorBoundary\">\r\n";
		}else{
			return "<graph id=\"" + boundaryName +"Boundary\" type=\"ActorBoundary\">\r\n";
		}
		
	}
	
	/**
	 * Generate XML object out of the Java object.
	 *
	 * @param id
	 *            the name of element
	 * @param type
	 *            the type of element
	 * @param hasSubgraph
	 *            true, if element has subgraph
	 * @return the string
	 */
	private String generateXMLObject(String id, String type, boolean hasSubgraph) {
		
		String closingTag = "";
		
		if(!hasSubgraph){
			closingTag = "</object>\r\n";
		}
		
						
		String s = "<object id=\"" + id + "\" type=\"" + type + "\">\r\n" +
				"<slot name=\"Name\">\r\n" +
				"<value>\r\n" +
				"<string>" + id + "</string>\r\n" +
				"</value>\r\n" +
				"</slot>\r\n" +
				closingTag;
		
		return s;
		
	}



}
