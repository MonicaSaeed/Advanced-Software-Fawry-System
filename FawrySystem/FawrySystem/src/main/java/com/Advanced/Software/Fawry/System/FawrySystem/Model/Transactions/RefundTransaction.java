package com.Advanced.Software.Fawry.System.FawrySystem.Model.Transactions;

public class RefundTransaction extends Transaction {
	private String paymentMethod;
	private String serviceName;
	private int status;
	
	public RefundTransaction(PaymentTransaction paymentTransaction) {
		this.paymentMethod=paymentTransaction.getPaymentMethod();
		this.serviceName=paymentTransaction.getserviceName();
		super.transUserName=paymentTransaction.getTransUserName();
		super. transPrice=paymentTransaction.getTransPrice();
		super. transStatus=paymentTransaction.getTrasStatus();
		this.status=-1;	
	}
	public String getPaymentMethod() {return paymentMethod;}
	public String getserviceName() {return serviceName;}
	public int getStatus() {
		return status;
	}
	public void setRefundStatus(int status) {
		this.status=status;
	}

}
