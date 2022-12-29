package com.Advanced.Software.Fawry.System.FawrySystem.Model;

import java.util.Vector;
import com.Advanced.Software.Fawry.System.FawrySystem.View.DiscountViewer;

public abstract class Discounts {
	protected String dName,dType;
	protected int dValue;
	protected DiscountViewer dViewer;
	
	
	public Discounts(String dName, String dType, int dValue) {
		// TODO Auto-generated constructor stub
		this.dName=dName;
		this.dType=dType;
		this.dValue=dValue;
		//this.checkValidation=condition;
	}
	
	
	public String getDName()
	{
		return this.dName;
	}
	public String getDType()
	{
		return this.dType;
	}
	public int getDValue()
	{
		return this.dValue;
	}
		
	

}
