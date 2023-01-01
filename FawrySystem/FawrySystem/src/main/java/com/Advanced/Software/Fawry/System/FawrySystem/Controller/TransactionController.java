package com.Advanced.Software.Fawry.System.FawrySystem.Controller;

import java.util.Vector;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.TransactionBSL.AddToWalletBSL;
import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.TransactionBSL.PaymentTransactionBSL;
import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.TransactionBSL.RefundTransactionBSL;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.Transactions.Transaction;
@RestController
public class TransactionController {
    private AddToWalletBSL walletBSL;
    private PaymentTransactionBSL paymentBSL;
    //private RefundTransactionBSL refundBsl;

	public TransactionController()
	{
		this.walletBSL=new AddToWalletBSL();
        this.paymentBSL=new PaymentTransactionBSL();
        //this.refundBsl=new RefundTransactionBSL();
	}
	/* 
	//@GetMapping(value="/adding to wallet transactions")
	public Vector<AddToWalletTransaction> walletTransaction()
	{
		return  (Vector<AddToWalletTransaction>) walletBSL.printVector();
	}

    //@GetMapping(value="/all payment transactions")
	public Vector<PaymentTransaction> paymenTransaction(){
		return ( Vector<PaymentTransaction>) paymentBSL.printVector();
	}

    public Vector<RefundTransactionBSL> refundTransaction(){
		return ( Vector<RefundTransactionBSL>) refundBsl.printvector();
	}
*/
    @GetMapping(value="/printAllTransaction")
    public Vector<Transaction> printAllTransaction()
    {
        Vector<Transaction> allTransactions = new Vector<Transaction>(); 
        if(walletBSL.printVector().size()==0)
        {
            return null;
        }  
        allTransactions.addAll(0,walletBSL.printVector());
        allTransactions.addAll(allTransactions.size()-1,paymentBSL.printVector());
        allTransactions.addAll(allTransactions.size()-1,paymentBSL.printRefundVector());

        return  allTransactions;
    }
}
