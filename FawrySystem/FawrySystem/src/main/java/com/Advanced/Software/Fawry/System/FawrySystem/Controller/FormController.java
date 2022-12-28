package com.Advanced.Software.Fawry.System.FawrySystem.Controller;

import java.util.Vector;

import com.Advanced.Software.Fawry.System.FawrySystem.Model.Form;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.FormFields;

public class FormController {
//	public void setFieldData(FormFields f)
//	{
//		if(f.fieldType.equals("text"))
//		{
//			f
//			
//		}
//	}
	public void creatForm(int numOFFields)
	{
		Form newForm=new Form(numOFFields);
	}
	public String creatForm(int numOFFields,Vector<FormFields> fieldsVec)
	{
		Form newForm=new Form(numOFFields,fieldsVec);
		return newForm.vec.get(0).getFieldName();
	}

}
