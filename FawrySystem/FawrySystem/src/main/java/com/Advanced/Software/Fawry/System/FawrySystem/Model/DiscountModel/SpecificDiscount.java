package com.Advanced.Software.Fawry.System.FawrySystem.Model.DiscountModel;

public class SpecificDiscount extends Discounts {
	String checkValidation;
	public SpecificDiscount(String dName, String dType, int dValue) {
		super(dName, dType, dValue);
		//System.out.print("enter your service name to apply this discount:");
		//this.checkValidation=input.next();
	}
	/*public boolean checkDiscountValidation(String serviceName)
	{
		if(this.checkValidation.equals(serviceName))
		{
			return true;
		}
		return false;
	}*/

}
