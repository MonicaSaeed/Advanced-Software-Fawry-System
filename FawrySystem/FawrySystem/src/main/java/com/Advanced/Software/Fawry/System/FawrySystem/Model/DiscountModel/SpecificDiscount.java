package com.Advanced.Software.Fawry.System.FawrySystem.Model.DiscountModel;

public class SpecificDiscount extends Discounts {
	//String checkValidation;
	public SpecificDiscount(String dName, float dValue, String constraints) {
		//super(dName, dType, dValue);
		super.dName=dName;
		super.dType="SpecificDiscount";
		super.dValue=dValue;
		super.constraints=constraints;
		
	}

}
