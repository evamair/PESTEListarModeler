/*
 * Copyright (c) 2017. All rights reserved. 
 *
 * @autor Mair Eva
 * 12.10.2017
 *
 */
package at.jku.dke.Model;


/**
 * The Class Factor.
 */
public class Factor {
	
	private String name;
	private String classification;
	
	/**
	 * Instantiates a new factor.
	 *
	 * @param name
	 *            the name
	 * @param classification
	 *            the classification
	 */
	public Factor (String name, String classification){
		this.name = name;
		this.classification = classification;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

}
