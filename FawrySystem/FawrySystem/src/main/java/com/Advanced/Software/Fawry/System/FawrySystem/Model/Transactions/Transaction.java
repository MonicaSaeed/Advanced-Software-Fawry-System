package com.Advanced.Software.Fawry.System.FawrySystem.Model.Transactions;

public abstract class Transaction {
	private String transUserName;
    private float transPrice;
    private boolean trasStatus;
    
    
    public Transaction() {}
    public Transaction(String serviceUserName, String serviceName, float servicePrice,boolean trasStatus){
		this.transUserName = serviceUserName;
		this.transPrice = servicePrice;
		this.trasStatus=trasStatus;
	}
    
    public String getTransUserName() {
		return this.transUserName;
	}
	public boolean getTrasStatus() {
		return this.trasStatus;
	}
	public float getTransPrice() {
		return this.transPrice;
	}
	
	public void setTransUserName(String serviceUser) {
		this.transUserName = serviceUser;
	}
	public void setTrasStatus(boolean trasStatus) {
		this.trasStatus = trasStatus;
	}
	public void setTransPrice(Float transPrice) {
		this.transPrice = transPrice;
	}

}
