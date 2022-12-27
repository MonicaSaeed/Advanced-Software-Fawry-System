package com.Advanced.Software.Fawry.System.FawrySystem.View;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Advanced.Software.Fawry.System.FawrySystem.Controller.CreditCardController;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.CreditCard;
@RestController

public class CreditcardView {
	private CreditCardController controller;
	
	public CreditcardView() {
		controller=new CreditCardController();
		// TODO Auto-generated constructor stub
	}
	//@RequestParam(defaultValue = "empty") String name, @RequestParam(defaultValue = "empty"
	
	/*@RequestMapping(path = "/mno/objectKey/{id}/{name}", method = RequestMethod.GET)
	public Book getBook(@PathVariable int id, @PathVariable String name) {
	    // code here
	}*/
	@GetMapping(value = "/CreditCard/{number}/{amount}")
	public float makePayment(@PathVariable String number,@PathVariable float amount)
	{
		return controller.pay(number, amount);
	}
	
	 @RequestMapping(value="/addCard",method = RequestMethod.POST)
	public String addCard(@RequestBody CreditCard card)
	{
		return controller.addCreditCard(card);
	}


}
