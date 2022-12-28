package com.Advanced.Software.Fawry.System.FawrySystem.View;

import java.util.Vector;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Advanced.Software.Fawry.System.FawrySystem.Controller.FormController;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.FormFields;

import jakarta.websocket.server.PathParam;

public class FormView {
	
	//@PostMapping(value="/enterForm")
	public void enterFormData(@RequestParam int numOfFields)
	{
		FormController formCon= new FormController();
		formCon.creatForm(numOfFields);
		
	}
	
	@PostMapping(value="/enterForm")

	public String enterFormData(@PathParam(value="fieldsno") int numOfFields,@PathParam(value="formFields") Vector<FormFields> fieldsVec)
	{
		FormController formCon= new FormController();
		return formCon.creatForm(numOfFields,fieldsVec);
		
	}
	
	
//	public void setFieldData(FormFields f)
//	{
//		FormController formCon= new FormController();
//		formCon.setFieldData(f);
//		
//	}

}
