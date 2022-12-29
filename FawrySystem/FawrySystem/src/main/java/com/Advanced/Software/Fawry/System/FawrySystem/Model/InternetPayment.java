package com.Advanced.Software.Fawry.System.FawrySystem.Model;

import java.util.Vector;

import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.HandlerBSL;

public class InternetPayment extends Services{
	
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
