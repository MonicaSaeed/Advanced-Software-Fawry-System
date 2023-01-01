package com.Advanced.Software.Fawry.System.FawrySystem.Model.Transactions;

public abstract class Transaction {
	protected String transUserName;
	protected float transPrice;
	protected boolean transStatus;
	protected int transID;
    
    
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
	public int getTransID() {
		return this.transID;
	}
	public void setTransID(int transID)
	{
		this.transID=transID;
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
