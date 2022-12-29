package com.Advanced.Software.Fawry.System.FawrySystem.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.ServicesBSL;
@RestController
public class ServicesController {
	
	private ServicesBSL serBSL ;
	
	public ServicesController()
	{
		this.serBSL = new ServicesBSL();

	}
	
	@PostMapping(value="/creatSystemServices")
	public boolean createService(@RequestBody boolean value)
	{
		boolean ret=serBSL.createServices();
		System.out.print(ServicesBSL.allServices.size());
		return ret;
	}

}
