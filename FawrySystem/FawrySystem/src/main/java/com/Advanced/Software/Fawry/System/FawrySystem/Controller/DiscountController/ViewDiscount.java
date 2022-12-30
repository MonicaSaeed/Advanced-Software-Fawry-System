package com.Advanced.Software.Fawry.System.FawrySystem.Controller.DiscountController;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.DiscountsBSL;


@RestController
public class ViewDiscount {
	DiscountsBSL bsl;
	
	public ViewDiscount() {
		bsl=new DiscountsBSL();
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
