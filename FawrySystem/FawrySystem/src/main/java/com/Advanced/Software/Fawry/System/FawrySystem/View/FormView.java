package com.Advanced.Software.Fawry.System.FawrySystem.View;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.Advanced.Software.Fawry.System.FawrySystem.Controller.FormController;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.Form;


public class FormView {
	FormController formCon;
	FormView(){
		formCon= new FormController();
	}
	


	@PostMapping(value="/enterForm")
	public String enterFormData(@RequestBody Form form)
	{
		return formCon.createForm(form);
	}

}
