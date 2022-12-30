package com.Advanced.Software.Fawry.System.FawrySystem.Model.Transactions;

public class RefundTransaction extends Transaction {
	private String paymentMethod;
	private String serviceName;
	
	public RefundTransaction(String paymentMethod, String serviceName,String transUserName,float transPrice,boolean trasStatus) {
		this.paymentMethod=paymentMethod;
		this.serviceName=serviceName;
		super.transUserName=transUserName;
		super. transPrice=transPrice;
		super. transStatus=transStatus;	
	}
	public String getPaymentMethod() {return paymentMethod;}
	public String getserviceName() {return serviceName;}

}
