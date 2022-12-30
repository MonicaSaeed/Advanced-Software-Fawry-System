package com.Advanced.Software.Fawry.System.FawrySystem.Model.Transactions;

public abstract class Transaction {
	protected String transUserName;
	protected float transPrice;
	protected boolean transStatus;
    
    
    //public Transaction() {}
    
    public String getTransUserName() {
		return this.transUserName;
	}
	public boolean getTrasStatus() {
		return this.transStatus;
	}
	public float getTransPrice() {
		return this.transPrice;
	}
	
	public void setTransUserName(String serviceUser) {
		this.transUserName = serviceUser;
	}
	public void setTrasStatus(boolean trasStatus) {
		this.transStatus = trasStatus;
	}
	public void setTransPrice(Float transPrice) {
		this.transPrice = transPrice;
	}

}
