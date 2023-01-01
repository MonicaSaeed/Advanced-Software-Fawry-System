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
		paymentTrans.setTransID(payment.size());
		System.out.println("blaaaaaa "+paymentTrans.getTrasStatus());
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

	
	
	
	public String dealWithRefundRequest(int paymentTransactionID,boolean response,String type)
	{
		AuthenticationBSL autBsl=new AuthenticationBSL();
		if(payment.size()<=paymentTransactionID)
		{
			return "this transaction id not found";
		}
		if(type.equals("admin"))
		{
	
			if(response)
			{
				for(int i=0;i<autBsl.fawryUsers.size();i++)
				{
					System.out.println(response+"payment.get(paymentTransactionID).getTrasStatus()="+payment.get(paymentTransactionID).getTrasStatus());
					if(autBsl.fawryUsers.get(i).getUserName().equals(payment.get(paymentTransactionID).getTransUserName()) && payment.get(paymentTransactionID).getTrasStatus()==true)
					{
						autBsl.fawryUsers.get(i).getUserWallet().setTotalFunds(autBsl.fawryUsers.get(i).getUserWallet().getTotalFund()+payment.get(paymentTransactionID).getTransPrice());
						//refund.get(paymentTransactionID).setRefundStatus(1);
						return "done";
					}
				}
			}
			
			return "request rejected";
		}
		return "not allowed";
	}

}
