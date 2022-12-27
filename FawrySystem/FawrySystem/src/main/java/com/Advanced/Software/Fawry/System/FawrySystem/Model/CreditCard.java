package com.Advanced.Software.Fawry.System.FawrySystem.Model;

public class CreditCard {
	private String creditCardNumber;
	private String password;
	private float accountBalance;
	public CreditCard(String creditCardNumber, String password, float accountBalance)
	{
		this.creditCardNumber=creditCardNumber;
		this.password=password;
		this.accountBalance=accountBalance;	
	}
	public CreditCard() {}
	public String getCRN() {return  creditCardNumber;}
	public String getPassword() {return password;}
	
	public float getAccountBalance() {return accountBalance;}
	public void setAccountBalance(float accountBalance ) {this.accountBalance=accountBalance;}
}
