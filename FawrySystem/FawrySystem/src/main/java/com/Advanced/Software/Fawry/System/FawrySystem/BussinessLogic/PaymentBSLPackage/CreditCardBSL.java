package com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.PaymentBSLPackage;

import java.util.Vector;


import org.springframework.stereotype.Service;

import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.TransactionBSL.PaymentTransactionBSL;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.PaymentModel.CreditCard;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.Transactions.PaymentTransaction;

@Service

public class CreditCardBSL {
	public static Vector <CreditCard> creditCards= new Vector <>();
	public String addCreditCard(CreditCard cerditcard) 
	{
		for(int i=0;i<creditCards.size();i++)
		{
			if(creditCards.get(i).getcreditCardNum().equals(cerditcard.getcreditCardNum()))
			{
				System.out.print(creditCards.get(i).getcreditCardNum());
				return "already exist";
			}	
		}
		creditCards.add(cerditcard);
		
		return ("added successfully"+cerditcard.getAccountBalance());	
	}
	
	
	public boolean pay(String cardnumber, float amount, String username,String serviceName) {
		PaymentTransactionBSL obj= new PaymentTransactionBSL() ;
		for(int i=0;i<this.creditCards.size();i++)
		{
			if(creditCards.get(i).getcreditCardNum().equals(cardnumber)&&creditCards.get(i).getAccountBalance()>=amount)
			{
				creditCards.get(i).setAccountBalance(creditCards.get(i).getAccountBalance()-amount);
				PaymentTransaction paid=new PaymentTransaction("creditcard",serviceName,username,amount,true);
				obj.addToPaymentTransaction(paid);
				return true;
			}	
		}
		PaymentTransaction paid=new PaymentTransaction("creditcard",serviceName,username,amount,false);
		obj.addToPaymentTransaction(paid);
		return false;   //failed transaction
	
	}

	}