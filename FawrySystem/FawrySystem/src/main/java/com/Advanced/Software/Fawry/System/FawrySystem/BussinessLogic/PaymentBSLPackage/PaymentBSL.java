package com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.PaymentBSLPackage;

import org.springframework.stereotype.Service;

import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.DiscountsBSL;
import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.ServicesBSL;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.PaymentModel.PaymentInfo;
@Service
public class PaymentBSL {
	



	public String payLogic(PaymentInfo paymentInfo,String username )
	{ 
		float amount;
		DiscountsBSL discount = new DiscountsBSL();
		amount=discount.applyAllDiscounts(paymentInfo.getAmount(), paymentInfo.getServiceName(),username);
		
		if(paymentInfo.getPaymentMethod().equals("creditCard"))
		{ 
			CreditCardBSL card=new CreditCardBSL();
			boolean val=card.pay(paymentInfo.getCreditCardNum(), amount,username,paymentInfo.getServiceName());
			if(val==true)
			{
			return  "paid successfully"+amount;
			}
			return "invalid creditcard or no enough money"+amount;
		}
		else if(paymentInfo.getPaymentMethod().equals("wallet"))
		{
			WalletBSL wallet=new WalletBSL();
			
			boolean val=wallet.pay(amount,username,paymentInfo.getServiceName());
			if(val==false)
			{
				return "no enough money in wallet"+amount;
			}
			return "paid successfully"+amount;
		}
		
		else if(paymentInfo.getPaymentMethod().equals("cash"))	
		{ ServicesBSL servicesBSL = new ServicesBSL();
		
			if(servicesBSL.searchForService(paymentInfo.getServiceName()).get(0).getPayByCashStatus()==true)
			{
				//return amount;//"payment method not found";
				return ("you can pay by cash"+ amount);
			}
			return "not allowed to pay by cash";
		}
		return "payment method not found";
	
}
}
 