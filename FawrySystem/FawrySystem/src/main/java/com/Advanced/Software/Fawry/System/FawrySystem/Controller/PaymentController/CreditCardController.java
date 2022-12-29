package com.Advanced.Software.Fawry.System.FawrySystem.Controller.PaymentController;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.PaymentBSL.CreditCardBSL;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.PaymentModel.CreditCard;

@RestController
public class CreditCardController {
	CreditCardBSL creditBSL;
	
	public CreditCardController() {
		creditBSL=new CreditCardBSL();
	}
	public static class PayCreditCardInfo{
		public String cardnumber;
		public float amount;
	}
	
	//@RequestParam(defaultValue = "empty") String name, @RequestParam(defaultValue = "empty"
	
		/*@RequestMapping(path = "/mno/objectKey/{id}/{name}", method = RequestMethod.GET)
		public Book getBook(@PathVariable int id, @PathVariable String name) {
		    // code here
		}*/

	@PostMapping(value = "/CreditCard") 
	public float makePayment(@RequestBody CreditCardController.PayCreditCardInfo payCredit)
	{
		//System.out.print("blllaa"+payCredit.cardnumber+" "+payCredit.amount);
		return creditBSL.pay(payCredit.cardnumber, payCredit.amount);
	}
	
	@RequestMapping(value="/addCard",method = RequestMethod.POST)
	public String addCard(@RequestBody CreditCard card)
	{
		return creditBSL.addCreditCard(card);
	}
}
