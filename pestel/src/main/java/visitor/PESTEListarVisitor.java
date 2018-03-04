/*
 * Copyright (c) 2017. All rights reserved. 
 *
 * @autor Mair Eva
 * 12.10.2017
 *
 */
package visitor;

import model.ElementInBoundary;
import model.PESTEListarElementWithBoundary;
import model.PESTEListarElementWithoutBoundary;


/**
 * The Interface PESTEListarVisitor.
 */
public interface PESTEListarVisitor {
	
	/**
	 * Visit.
	 *
	 * @param element
	 *            the element to visit
	 */
	public void visit (ElementInBoundary element);
	
	/**
	 * Visit.
	 *
	 * @param element
	 *            the element  to visit
	 */
	public void visit (PESTEListarElementWithBoundary element);
	
	/**
	 * Visit.
	 *
	 * @param element
	 *            the element  to visit
	 */
	public void visit (PESTEListarElementWithoutBoundary element);

}
