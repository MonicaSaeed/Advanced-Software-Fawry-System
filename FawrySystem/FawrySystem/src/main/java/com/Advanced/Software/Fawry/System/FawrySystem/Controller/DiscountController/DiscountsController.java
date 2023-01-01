package com.Advanced.Software.Fawry.System.FawrySystem.Controller.DiscountController;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.DiscountsBSL;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.FawryUser;

@RestController
public class DiscountsController {
	
	public static class DiscountInfo{
		public String dName,dType,constraints;
		public int dValue;
	}
	private DiscountsBSL discountBSL;
	
	public DiscountsController() {
		discountBSL=new DiscountsBSL();
	}
	
	@PostMapping(value="/discount")
	public String addDiscount(@CookieValue("usertype") String type, @RequestBody DiscountsController.DiscountInfo discount)
	{   
		return discountBSL.addDiscount(discount.dName,discount.dType,discount.dValue,discount.constraints,type);
	}
	
	
}
