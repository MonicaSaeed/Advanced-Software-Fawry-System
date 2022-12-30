package com.Advanced.Software.Fawry.System.FawrySystem.Controller;

import java.util.Vector;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.ServicesBSL;

@RestController
public class ServicesController<SystemService> {
	
	private ServicesBSL serBSL ;
	
	public ServicesController()
	{
		this.serBSL = new ServicesBSL();
	}

	
	@GetMapping(value="/searchService")
	public Vector<SystemService> searchService(int n){
		return (Vector<SystemService>) serBSL.searchForService(n);
	}

	/* 
	@PostMapping(value="/createSystemServices")
	public boolean createService()
	{
		boolean ret=serBSL.createServices();
		System.out.print(ServicesBSL.allServices.size());
		return ret;
	}*/

}
