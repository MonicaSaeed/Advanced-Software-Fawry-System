package com.Advanced.Software.Fawry.System.FawrySystem.Model;

import java.util.Vector;

import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.HandlerBSL;

public class Donations extends Services{
	protected boolean payByCash;
	protected String serviceName;
	protected HandlerBSL handler;
	protected Form form;
	
	
	public Donations(boolean cash) {
		
		super(cash);		
		this.serviceName="Donation service";
		
		Vector<FormFields> fields= new Vector<>();
//		
		FormFields text1=new Text("amount");
		fields.add(text1);
		FormFields text2=new Text("whereTo");
		fields.add(text2);
		
		Form form=new Form(2, fields);
	}

}
