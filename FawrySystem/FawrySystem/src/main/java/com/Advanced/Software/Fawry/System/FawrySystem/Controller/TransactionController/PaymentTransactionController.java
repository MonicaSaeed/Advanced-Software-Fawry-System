package com.Advanced.Software.Fawry.System.FawrySystem.Controller.TransactionController;

import java.util.Vector;

import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.TransactionBSL.PaymentTransactionBSL;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.Transactions.PaymentTransaction;

public class PaymentTransactionController {
	private PaymentTransactionBSL paymentBSL;
	
	public PaymentTransactionController()
	{
		this.paymentBSL=paymentBSL;
	}
	
	public Vector<PaymentTransaction> printVector(){
		return ( Vector<PaymentTransaction>) paymentBSL.printVector();
	}
	

}
