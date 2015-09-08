package org.design.pattern.chain.responsibility;

/**
 * @desciption: No description
 * @author : »ÆÓ¦Ïè(http://passwarer.github.io/)
 * @date : 2015-9-8ÏÂÎç2:23:25
 */
public class PurchaseRequest {
	private Double amount;
	private Integer number;
	private String purpose;
	
	public PurchaseRequest(Double amount, Integer number, String purpose) {
		this.amount = amount;
		this.number = number;
		this.purpose = purpose;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
}
