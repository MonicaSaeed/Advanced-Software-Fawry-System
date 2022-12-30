package com.Advanced.Software.Fawry.System.FawrySystem.Controller.TransactionController;

import java.util.Vector;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.TransactionBSL.PaymentTransactionBSL;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.Transactions.PaymentTransaction;

public class PaymentTransactionController {
	private PaymentTransactionBSL paymentBSL;
	
	public PaymentTransactionController()
	{
		this.paymentBSL=paymentBSL;
	}
	
	@GetMapping(value="/all payment transactions")
	public Vector<PaymentTransaction> printVector(){
		return ( Vector<PaymentTransaction>) paymentBSL.printVector();
	}
	

}
