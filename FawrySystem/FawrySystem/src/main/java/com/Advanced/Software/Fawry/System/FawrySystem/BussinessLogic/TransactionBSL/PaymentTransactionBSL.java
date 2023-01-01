package com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.TransactionBSL;

import java.util.Vector;

import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.AuthenticationBSL;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.Transactions.PaymentTransaction;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.Transactions.RefundTransaction;

public class PaymentTransactionBSL {
	public  static Vector<PaymentTransaction> payment = new Vector<>();
	public  static Vector<RefundTransaction> refund = new Vector<>();
	
	public void addToPaymentTransaction(PaymentTransaction paymentTrans )
	{
		paymentTrans.setTransID(payment.size()+"p");
		payment.add(paymentTrans);
	}
	public Vector<PaymentTransaction> printVector(){
		return PaymentTransactionBSL.payment;
	}


	public boolean addToRefundTransVector(RefundTransaction refundTrans )
	{
		refund.add(refundTrans);
		return true;
	}
	public Vector<RefundTransaction> printRefundVector()
	{
		return PaymentTransactionBSL.refund;
	}

	public String dealWithRefundRequest(String paymentTransactionID,boolean response,String type)
	{
		if(type.equals("admin"))
		{
			if(response)
			{
				for(int i=0;i<AuthenticationBSL.fawryUsers.size();i++)
				{
					if(AuthenticationBSL.fawryUsers.get(i).getUserName().equals(payment.get(i-1).getTransUserName()))
					{
						AuthenticationBSL.fawryUsers.get(i).getUserWallet().setTotalFunds(AuthenticationBSL.fawryUsers.get(i).getUserWallet().getTotalFund()+payment.get(i-1).getTransPrice());
					}
				}
			}
			else 
			{return "request rejected";}


		}
		return "not allowed";
	}

}
