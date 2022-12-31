package com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.PaymentBSL;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.TransactionBSL.AddToWalletBSL;
import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.TransactionBSL.PaymentTransactionBSL;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.PaymentModel.Wallet;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.Transactions.AddToWalletTransaction;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.Transactions.PaymentTransaction;
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
	
	public boolean addFunds(String number,float amountToBeTransfered,String username)
	{   CreditCardBSL card=new CreditCardBSL();
		boolean found=false;
		AddToWalletTransaction wallett;
		AddToWalletBSL obj= new AddToWalletBSL() ;
		
		for(int i=0;i<card.creditCards.size();i++)
		{
			if(card.creditCards.get(i).getcreditCardNum().equals(number) &&
				card.creditCards.get(i).getAccountBalance()>=amountToBeTransfered)
			{
				wallet.setTotalFunds(wallet.getTotalFund()+amountToBeTransfered);
				card.creditCards.get(i).setAccountBalance(card.creditCards.get(i).getAccountBalance()-amountToBeTransfered);
				wallett= new AddToWalletTransaction(number,username,amountToBeTransfered,true);
				obj.AddToWalletTransactionVector(wallett);
				//System.out.print(card.creditCards.get(i).getAccountBalance());
				 found=true;
				 return found;
				
			}
		}
		wallett= new AddToWalletTransaction(number,username,amountToBeTransfered,false);
		obj.AddToWalletTransactionVector(wallett);
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
	public boolean pay(float paymentAmount, String username,String serviceName) {
		PaymentTransaction paid;
		PaymentTransactionBSL wallet2=new PaymentTransactionBSL();
		if(checkBalance(paymentAmount))
		{
			wallet.setTotalFunds(wallet.getTotalFund()-paymentAmount);
			System.out.print("wallet value: "+wallet.getTotalFund()+"\n");
			paid=new PaymentTransaction("wallet",serviceName,username,paymentAmount,true);
			wallet2.addToPaymentTransaction(paid);
			return true;
		}
		paid=new PaymentTransaction("wallet",serviceName,username,paymentAmount,true);
		wallet2.addToPaymentTransaction(paid);
		return false;
			
		// TODO Auto-generated method stub
	}

	
}
