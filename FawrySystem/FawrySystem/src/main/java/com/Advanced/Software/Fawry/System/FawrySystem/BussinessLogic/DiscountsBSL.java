package com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic;
import java.util.Vector;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Advanced.Software.Fawry.System.FawrySystem.Model.Discounts;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.FawryUser;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.OverallDiscount;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.SpecificDiscount;
import com.Advanced.Software.Fawry.System.FawrySystem.View.DiscountViewer;
@Component
@Service

public class DiscountsBSL {
	
	public static Vector<Discounts> dList= new Vector<Discounts>();
	protected DiscountViewer dViewer;
	public boolean checkUserType(FawryUser user )
	{
		return user.getUserType();
	}

	public void addDiscount(Discounts discount,FawryUser user)
	{
		
		if(checkUserType(user))
		{
		if(discount.getDType().equals("SpecificDiscount"))
		{
			Discounts newDis= new SpecificDiscount(discount.getDName(),discount.getDType(),discount.getDValue());
			dList.add(newDis);
			Dnotify();
		}
		else if(discount.getDType().equals("OverallDiscount"))
		{
			Discounts newDis= new OverallDiscount(discount.getDName(),discount.getDType(),discount.getDValue());
			dList.add(newDis);
			this.Dnotify();
		}
		}
	}
	
	public void removeDiscount(Discounts discount,FawryUser user)
	{
		if(checkUserType(user))
		{
			int index=0;
			for(int i=0; i<dList.size();i++)
			{
				if(dList.get(i).getDName().equals(discount.getDName()))
				{
					index=i;
					break;
				}
			}
			
			dList.remove(index);
			this.Dnotify();
		}
		else {System.out.print("Only admins can add new discounts...");}
	}
	
	public void Dnotify()
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
	}
	
	//abstract boolean checkDiscountValidation(String serviceName);
}
