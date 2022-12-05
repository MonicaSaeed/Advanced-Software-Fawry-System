package system;

import java.util.Scanner;

public class OverallDiscount extends Discounts {
	Scanner input= new Scanner(System.in);
	private int checkValidation;
	private CompleteTransaction cTrans=null;

	public OverallDiscount(String dName, String dType, int dValue) {
		super(dName, dType, dValue);
		System.out.print("enter your transaction counter to apply this discount:");
		this.checkValidation=input.nextInt();
		// TODO Auto-generated constructor stub
	}
	
	public boolean checkDiscountValidation(String user)
	{
		int noOFTRansac=0;
		for(int i=0; i<CompleteTransaction.completeServices.size();i++)
		{
			if(CompleteTransaction.completeServices.get(i).getServiceUserName().equals(user))
			{
				noOFTRansac++;
			}
		}
		if(this.checkValidation==noOFTRansac)
		{
			return true;
		}
		
		return false;
	}

}
