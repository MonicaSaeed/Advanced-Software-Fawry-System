package com.Advanced.Software.Fawry.System.FawrySystem.Controller.PaymentController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class CashController {
	@GetMapping(value="/payCAsh/{paymentAmount}")
	public float pay(@PathVariable float paymentAmount) {
		return paymentAmount;
	}
}
