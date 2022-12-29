package com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.PaymentBSL;

import java.util.Vector;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Advanced.Software.Fawry.System.FawrySystem.Model.PaymentModel.CreditCard;
@Component
@Service

public class CreditCardBSL {
	public static Vector <CreditCard> creditCards= new Vector <>();
	public String addCreditCard(CreditCard cerditcard) 
	{
		for(int i=0;i<creditCards.size();i++)
		{
			/*if(creditCards.get(i).getCRN()==cerditcard.getCRN())
			{
				System.out.print(creditCards.get(i).getCRN());
				return "already exist";
			}*/
			
		}
		creditCards.add(cerditcard);
		return"added successfully";
			
	}
	/*public boolean validCard(CreditCard cerditcard)
	{
		for(int i=0;i<creditCards.size();i++)
		{
			if(creditCards.get(i)==cerditcard)
			{
				return true;
			}	
		}
		return false; 
	}*/
	public float pay(String cardnumber, float amount) {
		for(int i=0;i<creditCards.size();i++)
		{
			System.out.print(creditCards.get(i).getCRN());
			if( creditCards.get(i).getAccountBalance()>=amount)
			{
				System.out.print(creditCards.get(i).getCRN()+"    "+creditCards.get(i).getAccountBalance());
				creditCards.get(i).setAccountBalance(creditCards.get(i).getAccountBalance()-amount);
				return creditCards.get(i).getAccountBalance();
			
			}	
		}
		return creditCards.size();   //failed transaction
		
		// TODO Auto-generated method st
	}
	
}
