package system;

import java.util.Scanner;
import java.util.*;

public abstract class Services{
	Scanner input= new Scanner(System.in);
	protected Payment payment;
	protected boolean payByCash;
	protected String serviceName;
	protected Handler handler;
	protected Form form;
	protected float paymentAmount;
	//protected SystemServices systemServices;
	
	
	
	final void makeTransaction() {
		
		sendForm();
		fillForm();
		payment= changePaymentMethod();
		servicePay(payment);
		confirm();	
		
	}
	
	
	public Payment changePaymentMethod() {
		
		CreditCard card = null;
		String creditCardNumber, password;
		float accountBalance;
		
		if(this.payByCash==true)
		{
			System.out.print("you are using your credit card if you want to pay from wallet press 1, pay cash press 2,press 0 to continue using credit card");
			int choice;
			
			choice=input.nextInt();
			if(choice==1)
			{	
				this.payment=new Wallet();
				return this.payment;
				
			}
			else if(choice==2)
			{
				this.payment=new Cash();
				return this.payment;

			}
			else 
			{
				this.payment=new CreditCard();
				System.out.println("enter credit card info credit card number and password and account balance");
				creditCardNumber=input.next();
				password=input.next();
				accountBalance=input.nextFloat();
				for(int i=0;i<card.v1.size();i++)
				{
					if(card.v1.get(i).getCRN().equals(creditCardNumber)&&card.v1.get(i).getPassword().equals(password)) {
						System.out.print("credit card already exist");	
					}
					else
					{card.addCreditCard(creditCardNumber, password, accountBalance);}	
				}
				
				return this.payment;
			}
		}
		else {
			System.out.print("you are using your credit card if you want to pay from wallet press 1,press 0 to continue using credit card");
			int choice;
			
			choice=input.nextInt();
			if(choice==1)
			{
				this.payment=new Wallet();
				return this.payment;
				//payByWallet();
			}
			else {
				this.payment=new CreditCard();
				System.out.print("enter credit card info");
				creditCardNumber=input.next();
				password=input.next();
				accountBalance=input.nextFloat();
				for(int i=0;i<card.v1.size();i++)
				{
					if(card.v1.get(i).getCRN().equals(creditCardNumber)&&card.v1.get(i).getPassword().equals(password)) {
						System.out.print("credit card already exist");	
					}
					else
					{card.addCreditCard(creditCardNumber, password, accountBalance);}	
				}
				return this.payment; 
			}
			
		}
		// TODO Auto-generated method stub
	}
	
	public void servicePay(Payment p)
	{
		//String amountValue;
		for(int i=0;i<Form.vec.size();i++)
		{
			if(Form.vec.get(i).getfieldName().equals("amount"));
			this.paymentAmount = Float. valueOf(Form.vec.get(i).getText());
		}
		p.pay(paymentAmount);
	}
	
	
	abstract void confirm();
	public void sendForm()
	{
		this.form.showForm();
	}
	public void fillForm()
	{
		this.form.setForm();
	}
	public String getServiceName()
	{
		return this.serviceName;
	}
}


