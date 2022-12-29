package com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic;

import com.Advanced.Software.Fawry.System.FawrySystem.Model.Services.Service;

public class HandlerBSL {
	
	public void setFormInputes(Service serv,String field1,String field2 )
	{
		serv.setFormData(field1, field2);
		
		
	}

}
