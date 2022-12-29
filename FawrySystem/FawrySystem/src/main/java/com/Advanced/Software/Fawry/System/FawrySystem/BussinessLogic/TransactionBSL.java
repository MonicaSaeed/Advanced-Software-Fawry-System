package com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic;

import java.util.Vector;

import com.Advanced.Software.Fawry.System.FawrySystem.Model.Transactions.Transaction;

public class TransactionBSL {
    public static Vector<Transaction> transactions = new Vector<>(); //to save all completed services

    public void addTransaction(Transaction CT){
    	transactions.add(CT);
	}
}
