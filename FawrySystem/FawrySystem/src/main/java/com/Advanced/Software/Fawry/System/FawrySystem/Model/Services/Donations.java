package com.Advanced.Software.Fawry.System.FawrySystem.Model.Services;

import java.util.Vector;

import com.Advanced.Software.Fawry.System.FawrySystem.Model.FormModel.Form;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.FormModel.FormFields;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.FormModel.Text;

public class Donations extends SystemService{	
	public Donations(boolean cash) {	
		super(cash);		
		this.serviceName="Donationservice";
		
		Vector<FormFields> fields= new Vector<>();
//		
		FormFields text1=new Text("amount");
		fields.add(text1);
		FormFields text2=new Text("whereTo");
		fields.add(text2);
		
		Form f=new Form(2, fields);
		this.form=f;
	}
	
}
