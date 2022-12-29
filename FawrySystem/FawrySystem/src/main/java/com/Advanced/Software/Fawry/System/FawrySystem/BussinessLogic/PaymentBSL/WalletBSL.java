package com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.PaymentBSL;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Advanced.Software.Fawry.System.FawrySystem.Model.PaymentModel.CreditCard;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.PaymentModel.Wallet;
@Component
@Service
public class WalletBSL {
	Wallet wallet=new Wallet();
	public boolean checkBalance(float paymentAmount ) {
		
		if(wallet.getTotalFund()<paymentAmount)
		{
			//System.out.print("amount to pay exceeds wallet balance"+wallet.getTotalFund());
			return false;
		}
		return true;
	} 
	
	public boolean addFunds(String number,float amountToBeTransfered)
	{   CreditCardBSL card=new CreditCardBSL();
		boolean found=false;
		for(int i=0;i<card.creditCards.size();i++)
		{
			if(card.creditCards.get(i).getcreditCardNum().equals(number) &&
				card.creditCards.get(i).getAccountBalance()>=amountToBeTransfered)
			{
				wallet.setTotalFunds(wallet.getTotalFund()+amountToBeTransfered);
				card.creditCards.get(i).setAccountBalance(card.creditCards.get(i).getAccountBalance()-amountToBeTransfered);
				
				//System.out.print(card.creditCards.get(i).getAccountBalance());
				 found=true;
				break;
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
	public float pay(float paymentAmount) 
	{
		if(checkBalance(paymentAmount))
		{
			wallet.setTotalFunds(wallet.getTotalFund()-paymentAmount);
		}
		return wallet.getTotalFund();
			
		// TODO Auto-generated method stub
	}
}
