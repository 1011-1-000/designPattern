package org.design.pattern.chain.responsibility;

/**
 * @desciption: No description
 * @author : »ÆÓ¦Ïè(http://passwarer.github.io/)
 * @date : 2015-9-8ÏÂÎç2:25:05
 */
public abstract class Approver {
	protected Approver successor;
	protected String name;
	public Approver(String name) {
		this.name = name;
	}
	public void setSuccessor(Approver successor) {
		this.successor = successor;
	}
	
	public abstract void processRequest(PurchaseRequest request);
}
