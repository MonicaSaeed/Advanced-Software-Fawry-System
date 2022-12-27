package com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic;

import java.util.Vector;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Advanced.Software.Fawry.System.FawrySystem.Model.FawryUser;

@Component
@Service
public class AuthenticationModel{
    public static Vector<FawryUser> fawryUsers = new Vector<>(); //to save all users' data

    public void setFaweryUser(String userName,String password,String email,Boolean userType){
        FawryUser fuser = new FawryUser(userName,password,email,userType);
        fawryUsers.add(fuser);
    }

    //return no if invalid user name or email 
	public String signUp (String userName, String email){ 
		String valid ="yes";
        for(int i=0;i<fawryUsers.size();i++){
			FawryUser fuser = fawryUsers.get(i);

            if(userName.equals(fuser.getUserName()) || email.equals(fuser.getEmail())){
                valid = "no";
				break;
            }
			
        }

		return valid;
    }

    


	//return user type
	public String signIn (String userName ,String password){
		String userTypeReturn="";
		boolean b=true;

		for(int i=0;i<fawryUsers.size();i++){
            FawryUser fuser = fawryUsers.get(i);
            
            if(userName.equals(fuser.getUserName())  && password.equals(fuser.getPassword()) ){
				b=fuser.getUserType();
				userTypeReturn="yes";
				break;
            }
        }

		if(userTypeReturn=="yes"){
			if(b==true){
				return "admin";
			}else{
				return "user";
			}
		} 
		else{
			
			return "not found";
		} 
	}
	
     
}
