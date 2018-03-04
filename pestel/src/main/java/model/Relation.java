/*
 * Copyright (c) 2017. All rights reserved. 
 *
 * @autor Mair Eva
 * 12.10.2017
 *
 */
package model;

// TODO: Auto-generated Javadoc
/**
 * The Class Relation.
 */
public class Relation {
	
	private PESTEListarElement sub;
	private PESTEListarElement portSub;
	private String pred;
	private PESTEListarElement obj;	
	private PESTEListarElement portObj;
	
		
	/**
	 * Instantiates a new relation.
	 *
	 * @param sub
	 *            subject of relation
	 * @param portSub
	 *            subject port of relation
	 * @param pred
	 *            predicate of relation
	 * @param obj
	 *            object of relation
	 * @param portObj
	 *            object port of relation
	 */
	public Relation(PESTEListarElement sub, PESTEListarElement portSub, String pred, PESTEListarElement obj,
			PESTEListarElement portObj) {
		this.sub = sub;
		this.portSub = portSub;
		this.pred = pred;
		this.obj = obj;
		this.portObj = portObj;
	}

	public PESTEListarElement getSub() {
		return sub;
	}

	public void setSub(PESTEListarElement sub) {
		this.sub = sub;
	}

	public PESTEListarElement getPortSub() {
		return portSub;
	}

	public void setPortSub(PESTEListarElement portSub) {
		this.portSub = portSub;
	}

	public String getPred() {
		return pred;
	}

	public void setPred(String pred) {
		this.pred = pred;
	}

	public PESTEListarElement getObj() {
		return obj;
	}

	public void setObj(PESTEListarElement obj) {
		this.obj = obj;
	}

	public PESTEListarElement getPortObj() {
		return portObj;
	}
	
	public void setPortObj(PESTEListarElement portObj) {
		this.portObj = portObj;
	}

}
