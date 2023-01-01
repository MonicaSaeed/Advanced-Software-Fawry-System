package com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic;

import java.util.Vector;
import org.springframework.stereotype.Service;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.FawryUser;

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
			//FawryUser fuser = fawryUsers.get(i);

            if(fawryuser.getUserName().equals(fawryUsers.get(i).getUserName()) || fawryuser.getEmail().equals(fawryUsers.get(i).getEmail())){
                valid = "no";
				break;
            }	
        }
		return valid;
    }
	//return user type
	public FawryUser signIn (FawryUser fawryuser){

		for(int i=0;i<fawryUsers.size();i++){
            //FawryUser fuser = fawryUsers.get(i);      
            //System.out.println("nnnnnnnnnnnnnnnnnn  "+fuser.getUserWallet());      
            if(fawryuser.getEmail().equals(fawryUsers.get(i).getEmail())  && fawryuser.getPassword().equals(fawryUsers.get(i).getPassword()) ){
                //fawryuser=fawryUsers.get(i);
                //System.out.println("mmmmmmmmmmmmmmmmmm:  "+fawryuser.getUserWallet().getTotalFund());
				return fawryUsers.get(i);
            }
        }
        return null;	 
	}
	
     
}
