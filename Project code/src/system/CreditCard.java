package system;

import java.util.Vector;

public class CreditCard implements Payment {
	private String creditCardNumber;
	private String password;
	private float accountBalance;
	public static Vector <CreditCard> v1= new Vector <>();
	
	
	public CreditCard(String creditCardNumber, String password, float accountBalance)
	{
		this.creditCardNumber=creditCardNumber;
		this.password=password;
		this.accountBalance=accountBalance;
		//this.amountToPay=amountToPay;	
	}
	public CreditCard() {
		// TODO Auto-generated constructor stub
	}
	public void addCreditCard(String creditCardNumber, String password, float accountBalance) 
	{
		this.creditCardNumber=creditCardNumber;
		this.password=password;
		this.accountBalance=accountBalance;
		//this.amountToPay=amountToPay;
		v1.add(this);	
	}
	String getCRN() {return  creditCardNumber;}
	String getPassword() {return password;}
	float getAccountBalance() {return accountBalance;}
	void setAccountBalance(float accountBalance ) {this.accountBalance=accountBalance;}
	//Vector <CreditCard> getVector()
	//{return v1;}
	
	@Override
	public float pay(float amountToPay) {
		accountBalance-=amountToPay;
		return accountBalance;
		// TODO Auto-generated method st
	}
	
	
	

}
