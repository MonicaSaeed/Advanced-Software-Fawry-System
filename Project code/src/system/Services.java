package system;

import java.util.Scanner;

public abstract class Services{
	
	final void transaction() {
		changePaymentMethod();
		fillForm();
		sendForm();
		confirm();	
	}
	public void payByWallet()
	{
		Wallet w = null;
		w.pay();
	}
	public void payByCash()
	{
		Cash c=null;
		c.pay();
	}
	private boolean changePaymentMethod() {
		System.out.print("you are using your credit card if you want to pay from wallet press 1, pay cash press 2");
		int choice;
		Scanner input= new Scanner(System.in);
		choice=input.nextInt();
		if(choice==1)
		{
			payByWallet();
		}
		else if(choice==2)
		{
			payByCash();
		}
		return false;
		
		// TODO Auto-generated method stub
	}
	
	private void confirm() {
		System.out.print("transaction done successfully");
		// TODO Auto-generated method stub
		
	}

	private void sendForm() {
		// TODO Auto-generated method stub
		
	}

	private void fillForm() {
		// TODO Auto-generated method stub
		
	}

	
	
	/*public Payment p1;
	public CreditCard card;
	public void changePayment()
	{
		card.pay();
		this.p1=new CreditCard();
		p1.
		
		
	}*/
	
	
	
	
	
	/*public static void main(String[] args)
	{
		Payment p1=new CreditCard("2020002", "miretta", 4000,350);
		System.out.print(p1.pay());
		
		
	}*/

	
	/* f class services payment p1=new payment
			 p1.pay(new creditCard("2020002", "miretta", 4000,350))*/

	

}
