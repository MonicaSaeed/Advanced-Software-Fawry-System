package com.Advanced.Software.Fawry.System.FawrySystem.Controller.PaymentController;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.PaymentBSL.WalletBSL;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.PaymentModel.CreditCard;
@RestController
public class WalletController {
	
	public static class PayWalletInfo{
		public CreditCard obj;
        public String number;
        public float amountToBeTransfered;
        
    }
	private WalletBSL walletBSL;
	
	public WalletController()
	{walletBSL=new WalletBSL();}
	
	@GetMapping(value="/payByWallet/{paymentAmount}")
	public float pay(@PathVariable float paymentAmount,@CookieValue("username")String username ,@CookieValue("serviceName") String serviceName)
	{
		return walletBSL.pay(paymentAmount,username,serviceName);
	}
	
	@GetMapping(value="/add money to wallet/{number}/{amountToBeTransfered}")
	public boolean addFunds(@PathVariable String number ,@PathVariable float amountToBeTransfered,@CookieValue("username")String username)
	{
		return walletBSL.addFunds(number, amountToBeTransfered,username);
	}
}
