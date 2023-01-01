package com.Advanced.Software.Fawry.System.FawrySystem.Model.DiscountModel;


public abstract class Discounts {
	protected String dName,dType,constraints;
	protected float dValue;
	//protected DiscountViewer dViewer;
	
	
	// public Discounts(String dName, String dType, int dValue) {
	// 	this.dName=dName;
	// 	this.dType=dType;
	// 	this.dValue=dValue;
	// 	//this.checkValidation=condition;
	// }
	public String getDName()
	{
		return this.dName;
	}
	public String getDType()
	{
		return this.dType;
	}
	public String getConstraints()
	{
		return this.constraints;
	}
	public float getDValue()
	{
		return this.dValue;
	}
	//public abstract boolean checkDiscountValidation(String user);	
	

}
