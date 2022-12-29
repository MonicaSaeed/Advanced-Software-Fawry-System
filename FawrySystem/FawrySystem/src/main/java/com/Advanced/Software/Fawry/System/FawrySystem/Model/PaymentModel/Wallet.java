package com.Advanced.Software.Fawry.System.FawrySystem.Model.PaymentModel;

public class Wallet{
	 private float totalFunds;  //el wallet already fiha kam
	 float paymentAmount;
	 String creditCardNumber,password;
	 float accountBalance;
	
	public Wallet() {
	}
	public Wallet(float totalFunds, float paymentAmount)
	{
		this.totalFunds=totalFunds;
		this.paymentAmount=paymentAmount;
	}
	
	public float getTotalFund()
	{
		return totalFunds;
	}
	public void setTotalFunds(float totalFunds)
	{
		this.totalFunds=totalFunds;
	}
}
