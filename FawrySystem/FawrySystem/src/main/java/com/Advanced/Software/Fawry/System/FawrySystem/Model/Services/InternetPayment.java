package com.Advanced.Software.Fawry.System.FawrySystem.Model.Services;

import java.util.Vector;

import com.Advanced.Software.Fawry.System.FawrySystem.Model.FormModel.DropDown;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.FormModel.Form;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.FormModel.FormFields;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.FormModel.Text;

public class InternetPayment extends SystemService{	
	public InternetPayment(boolean cash) {
		super(cash);
		this.serviceName="InternetPaymentservice";
		
		Vector<FormFields> fields= new Vector<>();
		Vector<String> options= new Vector<>();
		options.add("10");
		options.add("20");
		options.add("50");
		
		FormFields text=new Text("phoneNumber");
		fields.add(text);
		
		FormFields dropdown=new DropDown( "amount",options);
		fields.add(dropdown);
		
		Form f=new Form(2, fields);
		this.form=f;
	}

}
