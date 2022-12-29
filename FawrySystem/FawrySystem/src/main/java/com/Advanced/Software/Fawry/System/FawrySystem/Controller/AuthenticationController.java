package com.Advanced.Software.Fawry.System.FawrySystem.Controller;

import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.AuthenticationBSL;
import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.CookiesUtils;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.FawryUser;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@CookieValue("username") String username
@RestController
public class AuthenticationController {
	@Autowired 
	CookiesUtils cookieutils;
    private AuthenticationBSL authenticationModel;
	

	public AuthenticationController(){
		authenticationModel = new AuthenticationBSL();
	}
	@RequestMapping(value="/SignIN",method = RequestMethod.POST)
    public ResponseEntity<?> signIn(@RequestBody FawryUser fawryuser){

        FawryUser fuser = authenticationModel.signIn(fawryuser);
        //String SIReturn = AC.signIn(userName, pass);

        if( fuser==null ){
             return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No Service found with this name");
        }
        
        else{
        	ArrayList<ResponseCookie> cookies = cookieutils.generateUserCookie(fuser);
        	return ResponseEntity.ok()
        	        .header(HttpHeaders.SET_COOKIE, cookies.get(0).toString())
        	        .header(HttpHeaders.SET_COOKIE, cookies.get(1).toString())
        	        .header(HttpHeaders.SET_COOKIE, cookies.get(2).toString())
        	       // .header(HttpHeaders.SET_COOKIE, cookies.get(3).toString())
        	        .body("Signed in Successfully");        }
        
    }
	 @RequestMapping(value="/SignUP",method = RequestMethod.POST)
	    public String signUp(@RequestBody FawryUser fuser){
	       
	        String up = authenticationModel.signUp(fuser);

	        if(up.equals("no")){
	            return "user already exist (name or email)";
	        }
	        else{
	            authenticationModel.setFaweryUser(fuser);
	            return "Signed up successfully";
	        }
	    }
	 
	public void setUser( FawryUser fuser){
		authenticationModel.setFaweryUser(fuser);
	}
	
	


}
