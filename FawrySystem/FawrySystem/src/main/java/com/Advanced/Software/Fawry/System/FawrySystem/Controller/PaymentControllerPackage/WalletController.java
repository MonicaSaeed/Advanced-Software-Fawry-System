package com.Advanced.Software.Fawry.System.FawrySystem.Controller.PaymentControllerPackage;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.PaymentBSLPackage.WalletBSL;
@RestController
public class WalletController {
	
	public static class PayWalletInfo{
		//public CreditCard obj;
        public String numberCredit;
        public float amountToBeTransfered;
        
    }
	private WalletBSL walletBSL;
	
	public WalletController()
	{walletBSL=new WalletBSL();}
	
	@RequestMapping(value="/addmoneytowallet",method = RequestMethod.POST)
	public boolean addFunds(@RequestBody WalletController.PayWalletInfo p,@CookieValue("username")String username)
	{
		return walletBSL.addFunds(p.numberCredit, p.amountToBeTransfered,username);
	}
}
