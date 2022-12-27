package com.Advanced.Software.Fawry.System.FawrySystem.View;

import java.util.Scanner;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Advanced.Software.Fawry.System.FawrySystem.Controller.AuthenticationController;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.FawryUser;

@RestController

public class AuthenticationView {
    Scanner sc = new Scanner(System.in);
    private AuthenticationController AC;

    public AuthenticationView(){
        AC=new AuthenticationController();
    }

    @RequestMapping(value="/SignIN",method = RequestMethod.POST)
    public String signIn(@RequestBody FawryUser fawryuser){

        FawryUser fuser = AC.signIn(fawryuser);
        //String SIReturn = AC.signIn(userName, pass);

        if( fuser==null ){
            return "invalid user name or password";
        }
        else{
            return "Signed in successfully";
        }
    }


    @RequestMapping(value="/SignUP",method = RequestMethod.POST)
    public String signUp(@RequestBody FawryUser fuser){
       
        String up = AC.signUp(fuser);

        if(up.equals("no")){
            return "user already exist (name or email)";
        }
        else{
            AC.setUser(fuser);
            return "Signed up successfully";
        }
    }

}
