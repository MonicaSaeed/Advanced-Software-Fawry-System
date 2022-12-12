package system;

import java.util.Scanner;

public class SpecificDiscount extends Discounts {
	Scanner input= new Scanner(System.in);
	String checkValidation;
	public SpecificDiscount(String dName, String dType, int dValue) {
		super(dName, dType, dValue);
		System.out.print("enter your service name to apply this discount:");
		this.checkValidation=input.next();
		// TODO Auto-generated constructor stub
	}
	public boolean checkDiscountValidation(String serviceName)
	{
		if(this.checkValidation.equals(serviceName))
		{
			return true;
		}
		return false;
	}

}
