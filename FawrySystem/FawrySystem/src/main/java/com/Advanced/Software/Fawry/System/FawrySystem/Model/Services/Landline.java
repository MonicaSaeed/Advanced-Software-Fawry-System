package com.Advanced.Software.Fawry.System.FawrySystem.Model.Services;

import java.util.Vector;

import com.Advanced.Software.Fawry.System.FawrySystem.Model.Form;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.FormFields;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.Text;

public class Landline extends SystemService{
		public Landline(boolean cash) {
			super(cash);
			this.serviceName="Landline service";
			
			Vector<FormFields> fields= new Vector<>();
//			
			FormFields text1=new Text("amount");
			fields.add(text1);
			FormFields text2=new Text("landlineNumber");
			fields.add(text2);
			
			Form f=new Form(2, fields);
			this.form=f;
		}

}
