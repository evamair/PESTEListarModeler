/*
 * Copyright (c) 2017. All rights reserved. 
 *
 * @autor Mair Eva
 * 12.10.2017
 *
 */
package model;

import visitor.PESTEListarVisitor;

// TODO: Auto-generated Javadoc
/**
 * The Class ElementInBoundary.
 */
public abstract class ElementInBoundary extends PESTEListarElement {
	
	private boolean inBoundary;
	
	/**
	 * Instantiates a new element in boundary.
	 *
	 * @param name
	 *            the name
	 */
	public ElementInBoundary(String name) {
		super(name);
		this.inBoundary = false;

	}

	/**
	 * @return true, if element is a element in a boundary
	 */
	public boolean isInBoundary() {
		return inBoundary;
	}

	/**
	 * @param inBoundary
	 */
	public void setInBoundary(boolean inBoundary) {
		this.inBoundary = inBoundary;
	}
	

	/* (non-Javadoc)
	 * @see model.PESTEListarElement#accept(visitor.PESTEListarVisitor)
	 */
	@Override
	public void accept(PESTEListarVisitor visitor) {
		visitor.visit(this);
	}

}

