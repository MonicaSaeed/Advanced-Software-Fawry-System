package system;

import java.util.Vector;

public class CreditCard implements Payment {
	private String creditCardNumber;
	private String password;
	private float accountBalance, amountToPay;
	public Vector <CreditCard> v1= new Vector <>();
	
	
	public CreditCard(String creditCardNumber, String password, float accountBalance, float amountToPay)
	{
		this.creditCardNumber=creditCardNumber;
		this.password=password;
		this.accountBalance=accountBalance;
		this.amountToPay=amountToPay;	
	}
	public CreditCard() {
		// TODO Auto-generated constructor stub
	}
	public void addCreditCard(String creditCardNumber, String password, float accountBalance, float amountToPay) 
	{
		this.creditCardNumber=creditCardNumber;
		this.password=password;
		this.accountBalance=accountBalance;
		this.amountToPay=amountToPay;
		v1.add(this);	
	}
	//Vector <CreditCard> getVector()
	//{return v1;}
	
	@Override
	public float pay() {
		accountBalance-=amountToPay;
		return accountBalance;
		// TODO Auto-generated method st
	}
	
	
	

}
