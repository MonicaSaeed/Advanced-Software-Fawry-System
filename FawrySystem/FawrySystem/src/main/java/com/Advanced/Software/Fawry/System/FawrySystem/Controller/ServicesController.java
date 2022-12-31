package com.Advanced.Software.Fawry.System.FawrySystem.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.CookiesUtils;
import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.ServicesBSL;

import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;

@RestController
public class ServicesController<SystemService> {
	@Autowired 
	CookiesUtils cookieutils;

	private ServicesBSL serBSL ;
	
	public ServicesController()
	{
		this.serBSL = new ServicesBSL();
	}

	
	/*@GetMapping(value="/searchService/{serviceName}")
	public Vector<SystemService> searchService(@PathVariable String serviceName){
		return (Vector<SystemService>) serBSL.searchForService(serviceName);
	}*/



	@GetMapping(value="/searchService")
	public ResponseEntity<?> searchService(String serviceName){
		ResponseCookie cookie = cookieutils.generateUserCookieService(serviceName);
		return ResponseEntity.ok()
			.header(HttpHeaders.SET_COOKIE, cookie.toString())
			.body(serBSL.searchForService(serviceName));
		//return serBSL.searchForService(n).get(0).getServiceName();
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
