package com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.TransactionBSL;

import java.util.Vector;

import com.Advanced.Software.Fawry.System.FawrySystem.Model.Transactions.PaymentTransaction;


public class RefundTransactionBSL {
	
	public  static Vector<PaymentTransaction> refund = new Vector<>();
	
	public void refundTransVector(PaymentTransaction refundTrans )
	{
		refund.add(refundTrans);
	}
	public Vector<PaymentTransaction> printvector()
	{
		return RefundTransactionBSL.refund;
	}
}
