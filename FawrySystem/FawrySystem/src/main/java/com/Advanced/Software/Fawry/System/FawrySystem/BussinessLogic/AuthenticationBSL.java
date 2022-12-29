package com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic;

import java.util.Vector;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Advanced.Software.Fawry.System.FawrySystem.Model.FawryUser;

@Component
@Service
public class AuthenticationBSL{
    public static Vector<FawryUser> fawryUsers = new Vector<>(); //to save all users' data

    public void setFaweryUser(FawryUser fuser){
        fawryUsers.add(fuser);
    }

    //return no if invalid user name or email 
	public String signUp (FawryUser fawryuser){ 
		String valid ="yes";
        for(int i=0;i<fawryUsers.size();i++){
			FawryUser fuser = fawryUsers.get(i);

            if(fawryuser.getUserName().equals(fuser.getUserName()) || fawryuser.getEmail().equals(fuser.getEmail())){
                valid = "no";
				break;
            }
			
        }
		return valid;
    }

    


	//return user type
	public FawryUser signIn (FawryUser fawryuser){

		for(int i=0;i<fawryUsers.size();i++){
            FawryUser fuser = fawryUsers.get(i);            
            if(fawryuser.getEmail().equals(fuser.getEmail())  && fawryuser.getPassword().equals(fuser.getPassword()) ){
				return fuser;
            }
        }
        return null;	 
	}
	
     
}
