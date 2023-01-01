package com.Advanced.Software.Fawry.System.FawrySystem.Model.PaymentModel;
public class Wallet{
	 private float totalFunds;  //el wallet already fiha kam
	 //float paymentAmount;
	 //String creditCardNumber,password;
	 //float accountBalance;
	
	public Wallet() {
		this.totalFunds = (float) 0;
	}
	public Wallet(float totalFunds)
	{
		this.totalFunds=totalFunds;
		//this.paymentAmount=paymentAmount;
	}
	
	public float getTotalFund()
	{
		return this.totalFunds;
	}
	public void setTotalFunds(float totalFunds)
	{
		this.totalFunds=totalFunds;
	}
}
