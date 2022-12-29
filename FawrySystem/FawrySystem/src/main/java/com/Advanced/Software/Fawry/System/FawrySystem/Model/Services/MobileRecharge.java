package com.Advanced.Software.Fawry.System.FawrySystem.Model.Services;

import java.util.Vector;

import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.HandlerBSL;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.Form;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.FormFields;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.Text;

public class MobileRecharge extends SystemService{
	protected boolean payByCash;
	protected String serviceName;
	protected HandlerBSL handler;
	protected Form form;
	
	
	public MobileRecharge(boolean cash) {
		
		super(cash);
		this.serviceName="Mobile Recharge service";
		
		Vector<FormFields> fields= new Vector<>();
		FormFields text1=new Text("amount");
		fields.add(text1);
		FormFields text2=new Text("mobileNumber");
		fields.add(text2);
		
		Form form=new Form(2, fields);
	}

}
