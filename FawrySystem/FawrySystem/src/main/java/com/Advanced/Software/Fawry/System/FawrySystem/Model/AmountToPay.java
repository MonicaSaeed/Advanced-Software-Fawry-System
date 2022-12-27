package com.Advanced.Software.Fawry.System.FawrySystem.Model;

public class AmountToPay {
	
	private String creditCardNumber;
	private String password;
	private float accountBalance;
	private float amountToPay;
	public AmountToPay(String creditCardNumber, String password, float accountBalance,float amountToPay)
	
	{
		this.creditCardNumber=creditCardNumber;
		this.password=password;
		this.accountBalance=accountBalance;	
		this.amountToPay=amountToPay;
	}
	public AmountToPay() {}
	public String getCRN() {return  creditCardNumber;}
	public String getPassword() {return password;}
	public float getAmountToPay() {return amountToPay;}
	public float getAccountBalance() {return accountBalance;}
	public void setAccountBalance(float accountBalance ) {this.accountBalance=accountBalance;}
	public void setAmountToPay(float amountToPay) {this.amountToPay=amountToPay;}
}