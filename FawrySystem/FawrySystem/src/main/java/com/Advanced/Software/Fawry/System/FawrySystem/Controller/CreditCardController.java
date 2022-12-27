package com.Advanced.Software.Fawry.System.FawrySystem.Controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.CreditCardBSL;
//import com.Advanced.Software.Fawry.System.FawrySystem.Model.AmountToPay;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.CreditCard;

@Component
@Service

public class CreditCardController {
	CreditCardBSL creditBSL;
	
	public CreditCardController() {
		creditBSL=new CreditCardBSL();
		}
	
	public String addCreditCard(CreditCard cerditcard)
	{
		return creditBSL.addCreditCard(cerditcard);
	}
	
	public float pay( String number, float amount  )
	{
		return creditBSL.pay(number,amount);
	}
}
