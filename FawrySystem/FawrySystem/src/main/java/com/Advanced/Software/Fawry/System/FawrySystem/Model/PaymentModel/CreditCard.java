package com.Advanced.Software.Fawry.System.FawrySystem.Model.PaymentModel;

public class CreditCard {
	private String creditCardNum;
	private String password;
	private float accountBalance;
	public CreditCard(){
		
	}
	public CreditCard(String creditCardNum,String password, float accountBalance)
	{
		this.password=password;
		this.creditCardNum=creditCardNum;
		this.accountBalance=accountBalance;	
	}
	//public CreditCard() {}
	public String getcreditCardNum() {return creditCardNum;}
	public String getPassword() {return password;}
	public float getAccountBalance() {return accountBalance;}
	public void setAccountBalance(float accountBalance ) {this.accountBalance=accountBalance;}
}
