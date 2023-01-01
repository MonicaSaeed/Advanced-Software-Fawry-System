package com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic;
import java.util.Vector;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.TransactionBSL.PaymentTransactionBSL;
import com.Advanced.Software.Fawry.System.FawrySystem.Controller.DiscountController.ViewDiscount;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.DiscountModel.Discounts;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.DiscountModel.OverallDiscount;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.DiscountModel.SpecificDiscount;
@Component
@Service

public class DiscountsBSL {
	
	public static Vector<Discounts> dList= new Vector<Discounts>();
	protected ViewDiscount dViewer;
	/*public boolean (FawryUser user )
	{
		return user.getUserType();
	}*/
	
	public String addDiscount(String dName,String dType,int dValue,String constraints,String type)
	{
		//System.out.println("typpppppppppppppppppppppp "+type);
		if(type.equals("admin"))
		{
		if( dType.equals("SpecificDiscount"))
		{
			Discounts newDis= new SpecificDiscount(dName,dValue,constraints);
			dList.add(newDis);
			//System.out.print(dList.get(0).getDName());
			return "discount added successfully";

			//Dnotify();
		}
		else if( dType.equals("OverallDiscount"))
		{
			Discounts newDis= new OverallDiscount(dName,dValue,constraints);
			dList.add(newDis);
			//System.out.print(dList.get(0).getDName()+dList.get(1).getDName());
			//this.Dnotify();
			return "discount added successfully";

		}
		}
		return "not allowed";
	}
	public String printAllDiscounts()
	{
		String disc="";
		for(int i=0;i<dList.size();i++)
		{
			disc+=" Discount name: "+dList.get(i).getDName()+" Discount type: "+dList.get(i).getDType()+" Discount value: "+dList.get(i).getDValue()+"%\n";
		}
		if(disc.equals("")){
			return "There are no discounts to display";
		}
		else{
			return disc;
		}
	}
	public Discounts viewDiscounts(int position)
	{
		return dList.get(position);
	}
	/*public void Dnotify()
	{
		dViewer.update(dList);	
	}*/
	
	public Float applyAllDiscounts(Float pAmount,String serviceName,String user)
	{
		for(int i=0; i<dList.size();i++)
		{
			if(dList.get(i).getDType().equals("SpecificDiscount")&& dList.get(i).getConstraints().equals(serviceName)	||	(dList.get(i).getDType().equals("OverallDiscount")&& dList.get(i).getConstraints().equals(checkDiscountValidation(user))))
			{
				pAmount= pAmount-(pAmount*(dList.get(i).getDValue()/100));
			}
			// else if (dList.get(i).getDType().equals("OverallDiscount")&& dList.get(i).getConstraints().equals(checkDiscountValidation(user)))
			// {
			// 	pAmount= pAmount-(pAmount*(dList.get(i).getDValue()/100));

			// }
		}
		return pAmount;
	}

	public String checkDiscountValidation(String user)
	{
		int noOFTRansac=0;
		for(int i=0; i<PaymentTransactionBSL.payment.size();i++)
		{
			if(PaymentTransactionBSL.payment.get(i).getTransUserName().equals(user))
			{
				noOFTRansac++;
			}
		}
		return Integer.toString(noOFTRansac);
	}
	
	//abstract boolean checkDiscountValidation(String serviceName);
}
