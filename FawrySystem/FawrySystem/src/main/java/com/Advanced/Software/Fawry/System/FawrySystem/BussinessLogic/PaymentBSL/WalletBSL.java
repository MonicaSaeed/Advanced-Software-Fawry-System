package com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.PaymentBSL;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Advanced.Software.Fawry.System.FawrySystem.Model.PaymentModel.Wallet;
@Component
@Service
public class WalletBSL {
	Wallet wallet;
	public boolean checkBalance(float paymentAmount ) {
		
		if(wallet.getTotalFund()<paymentAmount)
		{
			System.out.print("amount to pay exceeds wallet balance");
			return false;
		}
		return true;
	} 
	
	public boolean addFunds(CreditCardBSL card,float amountToBeTransfered)
	{   
		boolean found=false;
		for(int i=0;i<card.creditCards.size();i++)
		{
			if(card.creditCards.get(i).getCRN().equals(card.creditCards.get(i).getCRN()) &&card.creditCards.get(i).getPassword().equals(card.creditCards.get(i).getPassword()) &&
				card.creditCards.get(i).getAccountBalance()>=amountToBeTransfered) {
				wallet.setTotalFunds(wallet.getTotalFund()+amountToBeTransfered);
				card.creditCards.get(i).setAccountBalance(card.creditCards.get(i).getAccountBalance()-amountToBeTransfered);
				 found=true;
				//break;
			}
			
		}
		/*if(found==false)
		{
			card.addCreditCard(card.getCRN(), card.getPassword(), card.getAccountBalance());
				if(CreditCard.v1.lastElement().getCRN().equals(creditCardNumber)&& CreditCard.v1.lastElement().getPassword().equals(password)&& 
				CreditCard.v1.lastElement().getAccountBalance()>=amountToBeTransfered) {
				totalFunds+=amountToBeTransfered;
				CreditCard.v1.get(CreditCard.v1.size()-1).setAccountBalance(CreditCard.v1.get(CreditCard.v1.size()-1).getAccountBalance()-amountToBeTransfered);
				}
		}*/
		return found;
	}	
	/*@Override
	public float pay(float paymentAmount) 
	{
		if(checkBalance(paymentAmount))
		{
			totalFunds-=paymentAmount;
		}
		return totalFunds;
			*/
		// TODO Auto-generated method stub
		
	//}//

}
