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
		CreditCard c = null;
		for(int i=0;i<c.v1.size();i++)
		{
			if(c.v1.get(i).getCRN().equals(creditCardNumber)&&c.v1.get(i).getPassword().equals(password)&& c.v1.get(i).getAccountBalance()>=amountToBeTransfered) {
				totalFunds+=amountToBeTransfered;
				c.setAccountBalance(c.getAccountBalance()-amountToBeTransfered);
				found=true;
				break;
			}
			
		}
		if(found==false)
		{
			c.addCreditCard(creditCardNumber, password, accountBalance);
				if(c.v1.lastElement().getCRN().equals(creditCardNumber)&&c.v1.lastElement().getPassword().equals(password)&& c.v1.lastElement().getAccountBalance()>=amountToBeTransfered) {
				totalFunds+=amountToBeTransfered;
				c.setAccountBalance(c.getAccountBalance()-amountToBeTransfered);
				}
		}
		}	
	@Override
	public float pay(float paymentAmount) {
		if(checkBalance(paymentAmount))
		{
			paymentAmount-=totalFunds;
		}
		return totalFunds;
			
		// TODO Auto-generated method stub
		
}
}
