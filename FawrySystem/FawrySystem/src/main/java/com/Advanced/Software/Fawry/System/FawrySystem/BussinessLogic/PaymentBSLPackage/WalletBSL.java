package com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.PaymentBSLPackage;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.AuthenticationBSL;
import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.TransactionBSL.AddToWalletBSL;
import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.TransactionBSL.PaymentTransactionBSL;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.FawryUser;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.Transactions.AddToWalletTransaction;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.Transactions.PaymentTransaction;
@Component
@Service
public class WalletBSL {
	//Wallet wallet=new Wallet();
	public FawryUser checkBalance(float paymentAmount,String username ) {

		for(int i=0;i<AuthenticationBSL.fawryUsers.size();i++)
		{
			if(AuthenticationBSL.fawryUsers.get(i).getUserName().equals(username))
			{
				if(AuthenticationBSL.fawryUsers.get(i).getUserWallet().getTotalFund()>=paymentAmount)
				{
					return AuthenticationBSL.fawryUsers.get(i);
				}
				return null;
			}
		}
		return null;
		
	} 
	
	public boolean addFunds(String number,float amountToBeTransfered,String username)
	{   CreditCardBSL card=new CreditCardBSL();
		boolean found=false;
		AddToWalletTransaction wallett;
		AddToWalletBSL obj= new AddToWalletBSL() ;
		
		for(int i=0;i<card.creditCards.size();i++)
		{
			if(card.creditCards.get(i).getcreditCardNum().equals(number) &&card.creditCards.get(i).getAccountBalance()>=amountToBeTransfered)
			{
				for(int j=0;j<AuthenticationBSL.fawryUsers.size();j++)
				{
					if(AuthenticationBSL.fawryUsers.get(j).getUserName().equals(username))
					{
						AuthenticationBSL.fawryUsers.get(j).getUserWallet().setTotalFunds(AuthenticationBSL.fawryUsers.get(j).getUserWallet().getTotalFund()+amountToBeTransfered);
						//System.out.print(card.creditCards.get(i).getAccountBalance()+" walletttttttttttttttttttttt"+AuthenticationBSL.fawryUsers.get(j).getUserWallet().getTotalFund());
						break;

					}

				}
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
		FawryUser f=checkBalance(paymentAmount,username);
		if(f!=null)
		{
			f.getUserWallet().setTotalFunds(f.getUserWallet().getTotalFund()-paymentAmount);
			System.out.print("wallet value: "+f.getUserWallet().getTotalFund()+"\n");
			paid=new PaymentTransaction("wallet",serviceName,username,paymentAmount,true);
			wallet2.addToPaymentTransaction(paid);
			return true;
		}
		paid=new PaymentTransaction("wallet",serviceName,username,paymentAmount,false);
		wallet2.addToPaymentTransaction(paid);
		return false;
			
		// TODO Auto-generated method stub
	}

	
}
