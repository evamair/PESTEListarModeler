/*
 * Copyright (c) 2017. All rights reserved. 
 *
 * @autor Mair Eva
 * 12.10.2017
 *
 */
package model;

import java.util.ArrayList;

import visitor.PESTEListarVisitor;

// TODO: Auto-generated Javadoc
/**
 * The Class PESTEListarElementWithBoundary.
 */
public abstract class PESTEListarElementWithBoundary extends PESTEListarElement{
	
	private ArrayList<ElementInBoundary> subgraph;
	
	/**
	 * Instantiates a new PESTE listar element with boundary.
	 *
	 * @param name
	 *            the name
	 */
	public PESTEListarElementWithBoundary(String name) {
		super(name);
		this.subgraph = new ArrayList<ElementInBoundary>();
	}
	
	/**
	 * Adds the element to subgraph.
	 *
	 * @param e
	 *            the e
	 */
	public void addElementToSubgraph (ElementInBoundary e){
		subgraph.add(e);
	}
	
	public ArrayList<ElementInBoundary> getSubgraph() {
		return subgraph;
	}
	
	/**
	 * Empty subgraph.
	 *
	 * @return true, if successful
	 */
	public boolean emptySubgraph(){
		if(subgraph.isEmpty()){
			return true;
		}else{
			return false;
		}
	}
	
	/* (non-Javadoc)
	 * @see model.PESTEListarElement#accept(visitor.PESTEListarVisitor)
	 */
	public void accept(PESTEListarVisitor visitor){
		visitor.visit(this);
	};


}
