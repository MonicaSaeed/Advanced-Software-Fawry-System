package system;

import java.util.Scanner;

public abstract class Services{
	Scanner input= new Scanner(System.in);
	protected Payment payment;
	protected boolean payByCash;
	protected String serviceName;
	protected Handler handler;
	protected Form form;
	protected float paymentAmount;

	
	final void transaction() {
		
		changePaymentMethod();
		fillForm();
		sendForm();
		confirm();	
	}
	public void payByWallet()
	{
		Wallet w = null;
		w.pay(paymentAmount);
	}
	public void payByCash()
	{
		Cash c=null;
		c.pay(paymentAmount);
	}
	private Payment changePaymentMethod() {
		CreditCard card = null;
		 String creditCardNumber, password;
		 float accountBalance;
		if(payByCash==true)
		{
			System.out.print("you are using your credit card if you want to pay from wallet press 1, pay cash press 2,press 0 to continue using credit card");
			int choice;
			
			choice=input.nextInt();
			if(choice==1)
			{	
				this.payment=new Wallet();
				payByWallet();
				return this.payment;
				
			}
			else if(choice==2)
			{
				this.payment=new Cash();
				return this.payment;
				//payByCash();
			}
			else 
			{
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
	
	private void confirm() {
		System.out.print("transaction done successfully");
		// TODO Auto-generated method stub
		
	}
	abstract void sendForm();
	abstract void fillForm();
}
