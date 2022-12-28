package com.Advanced.Software.Fawry.System.FawrySystem.View;

import java.util.Vector;

import com.Advanced.Software.Fawry.System.FawrySystem.Model.Discounts;

public class DiscountViewer {
	
	private String dName,dType;
	private int dValue;
	private Vector<Discounts> disList= new Vector<Discounts>();

	
	public void viewDiscounts() 
	{
		for(int i=0;i<disList.size();i++)
		{
			System.out.print("Discount name	"+disList.get(i).getDName()+"\nDiscount type: "+disList.get(i).getDType()+"\nDiscount value: "+disList.get(i).getDValue()+"%\n");

		}
		
	}
	
	public void update(Vector<Discounts> dlist)
	{
		disList.clear();
		for(int i=0; i<dlist.size();i++)
		{
			disList.add( dlist.get(i));
		}
//		this.dName=name;
//		this.dType=type;
//		this.dValue=value;
	}

}
