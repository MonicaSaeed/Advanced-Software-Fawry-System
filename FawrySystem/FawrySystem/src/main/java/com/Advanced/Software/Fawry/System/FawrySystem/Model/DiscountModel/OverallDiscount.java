package com.Advanced.Software.Fawry.System.FawrySystem.Model.DiscountModel;

public class OverallDiscount extends Discounts {
	//Scanner input= new Scanner(System.in);
	//private int checkValidation;
//	private CompleteTransaction cTrans=null;

	public OverallDiscount(String dName,float dValue,String constraints) {
		//super(dName, dType, dValue);
		super.dName=dName;
		super.dType="OverallDiscount";
		super.dValue=dValue;
		super.constraints=constraints;
		
	}
	// @Override
	// public boolean checkDiscountValidation(String user)
	// {
	// 	int noOFTRansac=0;
	// 	for(int i=0; i<CompleteTransaction.completeServices.size();i++)
	// 	{
	// 		if(CompleteTransaction.completeServices.get(i).getServiceUserName().equals(user))
	// 		{
	// 			noOFTRansac++;
	// 		}
	// 	}
	// 	if(this.checkValidation==noOFTRansac)
	// 	{
	// 		return true;
	// 	}
		
	// 	return false;
	// }

}
