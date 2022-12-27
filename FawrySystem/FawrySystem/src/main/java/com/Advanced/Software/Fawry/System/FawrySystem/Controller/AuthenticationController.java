package com.Advanced.Software.Fawry.System.FawrySystem.Controller;



import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.AuthenticationModel;


@RestController

public class AuthenticationController {
    private AuthenticationModel authenticationModel;
	

	public AuthenticationController(){
		authenticationModel = new AuthenticationModel();
	}

	public String signUp (String userName, String email){ 
		return authenticationModel.signUp(userName, email);
    }

    
	//return user type
	public String signIn (String userName ,String password){
		return authenticationModel.signIn(userName, password);
	}
	

	@RequestMapping(value="/User",method = RequestMethod.POST) 
	
	public boolean setUser(@RequestParam("userName")  String userName,@RequestParam ("password")String password,
	@RequestParam("email")String email,@RequestParam("userType")Boolean userType)
	{
		authenticationModel.setFaweryUser( userName, password, email, userType);
		return true;
	}


}
