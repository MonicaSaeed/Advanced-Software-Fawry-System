package com.Advanced.Software.Fawry.System.FawrySystem.Controller.TransactionController;

import java.util.Vector;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.TransactionBSL.AddToWalletTransactionBSL;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.Transactions.AddToWalletTransaction;

public class AddToWalletController <AddToWalletTransaction>{
	private AddToWalletTransactionBSL walletBSL;
	
	public AddToWalletController()
	{
		walletBSL=new AddToWalletTransactionBSL();
	}
	
	@GetMapping(value="/adding to wallet transactions")
	public Vector<AddToWalletTransaction> printVector()
	{
		return  (Vector<AddToWalletTransaction>) walletBSL.printVector();

	}
}
//->pay ->refund ->pay ->addfund
//
//->pay ->pay
//->refund
//->addfund