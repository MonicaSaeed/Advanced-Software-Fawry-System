package com.Advanced.Software.Fawry.System.FawrySystem.Controller;


import org.springframework.web.bind.annotation.RequestBody;
import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.AuthenticationModel;

import com.Advanced.Software.Fawry.System.FawrySystem.Model.FawryUser;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service

public class AuthenticationController {
    private AuthenticationModel authenticationModel;
	

	public AuthenticationController(){
		authenticationModel = new AuthenticationModel();
	}

	 
	public String signUp (FawryUser fuser){ 
		return authenticationModel.signUp(fuser);
    }

    
	public FawryUser signIn (FawryUser fuser){
		return authenticationModel.signIn(fuser);
	}
	

	public void setUser(@RequestBody FawryUser fuser){
		authenticationModel.setFaweryUser(fuser);
	}


}
