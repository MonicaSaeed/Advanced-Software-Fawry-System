package com.Advanced.Software.Fawry.System.FawrySystem.Controller.PaymentControllerPackage;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.PaymentBSLPackage.PaymentBSL;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.PaymentInfo;
@RestController
public class PaymentController {
	PaymentBSL paymentBSL;
	public PaymentController()
	{
		paymentBSL=new PaymentBSL();
	}
	
	@PostMapping(value="/payment_info")
	public String payLogic(@RequestBody PaymentInfo paymentInfo,@CookieValue("username") String username )
	{
		return paymentBSL.payLogic(paymentInfo, username);
	}

}
/*
   "amount":1000,
      "directory":"orange",
     "serviceName":"MobileRechargeservice",
     "paymentMethod":"wallet"
     
    "amount":1000,
       "directory":"orange",
      "serviceName":"MobileRechargeservice",
      "paymentMethod":"creditCard",
      "creditCardNum":"1"

 	"amount":1000,
      "directory":"orange",
     "serviceName":"MobileRechargeservice",
     "paymentMethod":"wallet"
     
 */