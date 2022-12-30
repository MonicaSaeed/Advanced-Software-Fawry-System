package com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.TransactionBSL;

import java.util.Vector;

import com.Advanced.Software.Fawry.System.FawrySystem.Model.Transactions.PaymentTransaction;

public class PaymentTransactionBSL {
	public PaymentTransactionBSL(){};
	public  static Vector<PaymentTransaction> payment = new Vector<>();
	
	public void addToPaymentTransaction(PaymentTransaction paymentTrans )
	{
		payment.add(paymentTrans);
	}
	public Vector<PaymentTransaction> printVector(){
		return PaymentTransactionBSL.payment;
	}

}
