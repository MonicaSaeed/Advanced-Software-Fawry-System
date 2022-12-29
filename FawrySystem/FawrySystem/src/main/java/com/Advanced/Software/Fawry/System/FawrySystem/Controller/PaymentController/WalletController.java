package com.Advanced.Software.Fawry.System.FawrySystem.Controller.PaymentController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.PaymentBSL.CreditCardBSL;
import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.PaymentBSL.WalletBSL;
@RestController
public class WalletController {
	private WalletBSL walletBSL;
	
	public WalletController()
	{walletBSL=new WalletBSL();}
	
	
	@PostMapping(value="/wallet check balance")
	public boolean checkBalance(float paymentAmount )
	{
		return walletBSL.checkBalance(paymentAmount);
	}
	@GetMapping(value="/add money to wallet/{amountToBeTransfered}")
	public boolean addFunds(@RequestBody CreditCardBSL card,@PathVariable float amountToBeTransfered)
	{
		return walletBSL.addFunds(card, amountToBeTransfered);
	}
	
}
