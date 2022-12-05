package system;

public class Wallet implements Payment {
	
	 private float totalFunds;  //el wallet already fiha kam
	 float paymentAmount;
	
	
	public Wallet(float totalFunds, float paymentAmount)
	{
		this.totalFunds=totalFunds;
		this.paymentAmount=paymentAmount;
	}
	public boolean checkBalance(float totalFunds, float paymentAmount ) {
		
		if(totalFunds<paymentAmount)
		{
			System.out.print("amount to pay exceeds wallet balance");
			return false;
		}
		return true;
	} 
	
	public void addFunds(CreditCard card,float amountToBeTransfered)
	{
		
		totalFunds+=amountToBeTransfered;
		
	}
	@Override
	public float pay() {
		if(checkBalance(totalFunds, paymentAmount))
		{
			paymentAmount-=totalFunds;
		}
		return totalFunds;
			
		// TODO Auto-generated method stub
		
}
}
