package com.Advanced.Software.Fawry.System.FawrySystem.Controller.PaymentControllerPackage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class CashController {
	@GetMapping(value="/payCash/{paymentAmount}")
	public float pay(@PathVariable float paymentAmount) {
		return paymentAmount;
	}
}
