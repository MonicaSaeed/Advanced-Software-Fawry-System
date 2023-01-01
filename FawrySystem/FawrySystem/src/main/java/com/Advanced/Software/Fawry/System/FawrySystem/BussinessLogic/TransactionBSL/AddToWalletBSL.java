package com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.TransactionBSL;

import java.util.Vector;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.Transactions.AddToWalletTransaction;

public class AddToWalletBSL {
	public  static Vector<AddToWalletTransaction> wallet = new Vector<>();
	
	public void AddToWalletTransactionVector(AddToWalletTransaction walletTrans)
	{
		//walletTrans.setTransID(wallet.size()+"w");
		wallet.add(walletTrans);
		
	}
	public Vector<AddToWalletTransaction> printVector(){
		return AddToWalletBSL.wallet;
	}

}
