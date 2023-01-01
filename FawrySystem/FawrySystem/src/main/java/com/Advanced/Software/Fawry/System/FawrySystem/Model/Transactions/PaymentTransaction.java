package com.Advanced.Software.Fawry.System.FawrySystem.Model.Transactions;

public class PaymentTransaction extends Transaction{
	
	private String paymentMethod;
	private String serviceName;
	
	public PaymentTransaction(String paymentMethod, String serviceName,String transUserName,float transPrice,boolean transStatus) {
		this.paymentMethod=paymentMethod;
		this.serviceName=serviceName;
		this.transUserName=transUserName;
		this. transPrice=transPrice;
		this. transStatus=transStatus;	
	}
	public PaymentTransaction() {
		// TODO Auto-generated constructor stub
	}
	public String getPaymentMethod() {return paymentMethod;}
	public String getserviceName() {return serviceName;}

}
