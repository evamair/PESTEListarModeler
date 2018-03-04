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
 * The Class PESTEListarElementWithoutBoundary.
 */
public abstract class PESTEListarElementWithoutBoundary extends PESTEListarElement {

	/**
	 * Instantiates a new PESTE listar element without boundary.
	 *
	 * @param name
	 *            the name
	 */
	public PESTEListarElementWithoutBoundary(String name) {
		super(name);
	}

	/* (non-Javadoc)
	 * @see model.PESTEListarElement#accept(visitor.PESTEListarVisitor)
	 */
	@Override
	public void accept(PESTEListarVisitor visitor) {
		visitor.visit(this);
		
	}

}
