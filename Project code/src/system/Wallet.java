package system;

public class Wallet implements Payment {
	
	 private float totalFunds;  //el wallet already fiha kam
	 float paymentAmount;
	 String creditCardNumber,password;
	 float accountBalance;
	
	public Wallet(float totalFunds, float paymentAmount)
	{
		this.totalFunds=totalFunds;
		this.paymentAmount=paymentAmount;
	}
	public Wallet() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean checkBalance(float paymentAmount ) {
		
		if(this.totalFunds<paymentAmount)
		{
			System.out.print("amount to pay exceeds wallet balance");
			return false;
		}
		return true;
	} 
	
	public void addFunds(CreditCard card,float amountToBeTransfered)
	{   
		boolean found=false;
		for(int i=0;i<CreditCard.v1.size();i++)
		{
			if(CreditCard.v1.get(i).getCRN().equals(card.getCRN()) && CreditCard.v1.get(i).getPassword().equals(card.getPassword()) &&
			CreditCard.v1.get(i).getAccountBalance()>=amountToBeTransfered) {
				totalFunds+=amountToBeTransfered;
				CreditCard.v1.get(i).setAccountBalance(CreditCard.v1.get(i).getAccountBalance()-amountToBeTransfered);
				found=true;
				break;
			}
			
		}
		if(found==false)
		{
			card.addCreditCard(card.getCRN(), card.getPassword(), card.getAccountBalance());
				if(CreditCard.v1.lastElement().getCRN().equals(creditCardNumber)&& CreditCard.v1.lastElement().getPassword().equals(password)&& 
				CreditCard.v1.lastElement().getAccountBalance()>=amountToBeTransfered) {
				totalFunds+=amountToBeTransfered;
				CreditCard.v1.get(CreditCard.v1.size()-1).setAccountBalance(CreditCard.v1.get(CreditCard.v1.size()-1).getAccountBalance()-amountToBeTransfered);
				}
		}
	}	
	public float pay(float paymentAmount) 
	{
		if(checkBalance(paymentAmount))
		{
			totalFunds-=paymentAmount;
		}
		return totalFunds;
			
		// TODO Auto-generated method stub
		
	}
}
