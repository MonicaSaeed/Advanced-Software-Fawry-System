package com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic;
import java.util.Vector;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Advanced.Software.Fawry.System.FawrySystem.Controller.DiscountViewer;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.Discounts;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.OverallDiscount;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.SpecificDiscount;
@Component
@Service

public class DiscountsBSL {
	
	public static Vector<Discounts> dList= new Vector<Discounts>();
	protected DiscountViewer dViewer;
	/*public boolean (FawryUser user )
	{
		return user.getUserType();
	}*/
	
	public String addDiscount(String dName,String dType,int dValue)
	{
		boolean user=true;
		
		if(user)
		{
		if( dType.equals("SpecificDiscount"))
		{
			Discounts newDis= new SpecificDiscount(dName, dType,dValue);
			dList.add(newDis);
			//System.out.print(dList.get(0).getDName());
			return "discount added successfully";

			//Dnotify();
		}
		else if( dType.equals("OverallDiscount"))
		{
			Discounts newDis= new OverallDiscount(dName, dType,dValue);
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

			//System.out.print("Discount name	"+bsl.dList.get(i).getDName()+"\nDiscount type: "+bsl.dList.get(i).getDType()+"\nDiscount value: "+bsl.dList.get(i).getDValue()+"%\n");

		}
		return disc;
	}
	public Discounts viewDiscounts(int position)
	{
		return dList.get(position);
	}
	/*public void Dnotify()
	{
		dViewer.update(dList);	
	}
	
	public Float applyAllDiscounts(Float pAmount)
	{
		for(int i=0; i<dList.size();i++)
		{
			pAmount= pAmount-(pAmount*(dList.get(i).getDValue()/100));
			
		}
		return pAmount;
	}*/
	
	//abstract boolean checkDiscountValidation(String serviceName);
}
