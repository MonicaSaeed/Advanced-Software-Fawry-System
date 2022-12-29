package com.Advanced.Software.Fawry.System.FawrySystem.Controller.DiscountController;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.DiscountsBSL;
import com.Advanced.Software.Fawry.System.FawrySystem.Controller.DiscountController.DiscountsController.DiscountInfo;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.Discounts;

@RestController
public class DiscountViewer {
	DiscountsBSL bsl;
	
	public DiscountViewer() {
		bsl=new DiscountsBSL();
		// TODO Auto-generated constructor stub
	}
	@PostMapping(value="/viewDiscounts")
	public String viewDiscounts() 
	{
		return bsl.printAllDiscounts();
	}
	
	/*public void update(Vector<Discounts> dlist)
	{
		disList.clear();
		for(int i=0; i<dlist.size();i++)
		{
			disList.add( dlist.get(i));
		}

	}*/

}
