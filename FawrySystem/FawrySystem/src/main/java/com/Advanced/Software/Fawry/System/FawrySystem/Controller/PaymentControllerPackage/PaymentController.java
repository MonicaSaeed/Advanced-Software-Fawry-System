package com.Advanced.Software.Fawry.System.FawrySystem.Controller.PaymentControllerPackage;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.PaymentBSLPackage.PaymentBSL;
import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.TransactionBSL.PaymentTransactionBSL;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.PaymentModel.PaymentInfo;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.Transactions.PaymentTransaction;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.Transactions.RefundTransaction;
@RestController
public class PaymentController {
	PaymentBSL paymentBSL;
   PaymentTransactionBSL paymentTransactionBSL;
	public PaymentController()
	{
		paymentBSL=new PaymentBSL();
      paymentTransactionBSL=new PaymentTransactionBSL();
	}
	
	@PostMapping(value="/payment_info")
	public float payLogic(@RequestBody PaymentInfo paymentInfo,@CookieValue("username") String username )
	{
		return paymentBSL.payLogic(paymentInfo, username);
	}

   @PostMapping(value="/requestRefund")
   public String refundRequest(@RequestBody PaymentTransaction transaction)
   {
      RefundTransaction refundTransaction= new RefundTransaction(transaction);
      paymentTransactionBSL.addToRefundTransVector(refundTransaction);
      return "your request is pending";
   }

   public static class PayWalletInfo{
		//public CreditCard obj;
        public int paymentTransactionID;
        public boolean response;
        
    }
   @PostMapping(value="/dealWithRefundRequest")
   public String dealWithRefundRequest(@RequestBody PaymentController.PayWalletInfo p ,@CookieValue("usertype")String type )
   {
      return paymentTransactionBSL.dealWithRefundRequest(p.paymentTransactionID,p.response,type);
   }

   @PostMapping(value="/addRefundRequest")
   public String addToRefundTransVector(RefundTransaction refundTrans )
   {
      if(paymentTransactionBSL.addToRefundTransVector(refundTrans))
      {
         return "your request is pending";
      }
      return "can't add your request";
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