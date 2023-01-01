package com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.PaymentBSLPackage;

import java.util.Vector;

import org.springframework.stereotype.Service;
import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.ServicesBSL;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.PaymentInfo;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.Services.SystemService;
@Service
public class PaymentBSL {
	
	public String payLogic(PaymentInfo paymentInfo,String username )
	{ 
		if(paymentInfo.getPaymentMethod().equals("creditCard"))
		{ 
			CreditCardBSL card=new CreditCardBSL();
			boolean val=card.pay(paymentInfo.getCreditCardNum(), paymentInfo.getAmount(),username,paymentInfo.getServiceName());
			if(val==true)
			{
			return "paid successfully";
			}
			return "invalid creditcard or no enough money";
		}
		else if(paymentInfo.getPaymentMethod().equals("wallet"))
		{
			WalletBSL wallet=new WalletBSL();
			
			boolean val=wallet.pay(paymentInfo.getAmount(),username,paymentInfo.getServiceName());
			if(val==false)
			{
				return "no enough money in wallet";
			}
			return "paid successfully";
		}
		
		else if(paymentInfo.getPaymentMethod().equals("cash"))	
		{ ServicesBSL servicesBSL = new ServicesBSL();
		
			if(servicesBSL.searchForService(paymentInfo.getServiceName()).get(0).getPayByCashStatus()==true)
			{
			return ("you can pay by cash"+ paymentInfo.getAmount());
			}
			return "not allowed to pay by cash";
		}
		return "payment method not found";
	
}
}
 