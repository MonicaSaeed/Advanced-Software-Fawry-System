package com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic;

import java.util.Vector;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Advanced.Software.Fawry.System.FawrySystem.Model.CreditCard;
@Component
@Service

public class CreditCardBSL {
	public static Vector <CreditCard> creditCards= new Vector <>();
	public String addCreditCard(CreditCard cerditcard) 
	{
		/*for(int i=0;i<creditCards.size();i++)
		{
			if(creditCards.get(i).getCRN().equals(cerditcard.getCRN()))
			{
				return "already exist";
			}			
		}*/
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
			if(creditCards.get(i).getCRN().equals(cardnumber) && creditCards.get(i).getAccountBalance()>=amount)
			{
				
				creditCards.get(i).setAccountBalance(creditCards.get(i).getAccountBalance()-amount);
				return creditCards.get(i).getAccountBalance();
			
			}	
		}
		return creditCards.size();   //failed transaction
		
		// TODO Auto-generated method st
	}
	
}
