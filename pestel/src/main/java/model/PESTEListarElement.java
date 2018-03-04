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
 * The Class PESTEListarElement.
 */
public abstract class PESTEListarElement {
	
	private String name;
	private ArrayList<Relation> rel;
	
	
	
	/**
	 * Instantiates a new PESTEL istar element.
	 *
	 * @param name
	 *            the name
	 */
	public PESTEListarElement(String name) {
		this.name = name;
		this.rel = new ArrayList<Relation>();
	}


	public String getName() {
		return name;
	}

	public ArrayList<Relation> getRel() {
		return rel;
	}
	
	/**
	 * Adds the relation.
	 *
	 * @param r
	 *            Relation r can be added to element
	 */
	public void addRelation (Relation r){
		rel.add(r);
	}

	/**
	 * Accept PESTEListarVisitor.
	 *
	 * @param visitor
	 *            the visitor
	 */
	public abstract void accept(PESTEListarVisitor visitor);

}
