package com.Advanced.Software.Fawry.System.FawrySystem.Model.Services;

import java.util.Vector;

import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.HandlerBSL;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.DropDown;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.Form;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.FormFields;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.Text;

public class InternetPayment extends Service{
	
	protected boolean payByCash;
	protected String serviceName;
	protected HandlerBSL handler;
	protected Form form;
	
	
	public InternetPayment(boolean cash) {
		
		super(cash);
		this.serviceName="Internet Payment service";
		
		Vector<FormFields> fields= new Vector<>();
		Vector<String> options= new Vector<>();
		options.add("10");
		options.add("20");
		options.add("50");
		
		FormFields text=new Text("phoneNumber");
		fields.add(text);
		
		FormFields dropdown=new DropDown( "amount",options);
		fields.add(dropdown);
		
		Form form=new Form(2, fields);
	}

}
