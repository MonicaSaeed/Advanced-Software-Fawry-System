package com.Advanced.Software.Fawry.System.FawrySystem.Model.Transactions;

public class AddToWalletTransaction extends Transaction {

	private String creditCardNumber;
	
	public AddToWalletTransaction(String creditCardNumber,String transUserName,float transPrice,boolean trasStatus) {
		this.creditCardNumber=creditCardNumber;
		super.transUserName=transUserName;
		super. transPrice=transPrice;
		super. transStatus=transStatus;	
	}
}
