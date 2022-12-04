package system;

import java.util.*;  

public class FawryUser {
	private String userName;
	private String password;
	private String email;
	private boolean userType;  //Check if the user is an admin or not (admin -> true, user->false)
	static Vector<FawryUser> fawryUsers = new Vector<>(); //to save all users' data
	
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public Vector<FawryUser> getFawryUsers() {
		return fawryUsers;
	}
	public boolean getUserType() {
		return userType;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setUserType(Boolean userType) {
		this. userType = userType;
	}
	
	//public String signUp (String userName,String password, String email, Boolean userType ){
	public String signUp (String userName, String email){
		String found="yes";
        for(int i=0;i<fawryUsers.size();i++){
            FawryUser FU = fawryUsers.get(i);
            String UN = FU.getUserName();
            String E = FU.getEmail();
            if(userName == UN || email == E){
                //System.out.println("Invalid  user name or email");
				found = "no";
				break;
            }
        }  
		/* 
		FawryUser FUValid = new FawryUser();
		FUValid.setEmail(email);
		FUValid.setPassword(password);
		FUValid.setUserName(userName);
		FUValid.setUserType(userType);
		fawryUsers.add(FUValid);
		//System.out.println("Singed up successfully");*/
		return found;
    }
	
	public String signIn (String userName ,String password){
		String userTybeReturn="";
		boolean b=true;


		for(int i=0;i<fawryUsers.size();i++){
            FawryUser FU = fawryUsers.get(i);
            String UN = FU.getUserName();
            String p = FU.getPassword();
            if(userName == UN && password==p ){
				b=FU.getUserType();
				userTybeReturn="yes";
				break;
            }
        }

		if(userTybeReturn=="yes"){
			if(b==true){
				return "admin";
			}else{
				return "user";
			}
		} //System.out.println("Singed in successfully");
		else{
			return "not";
		} //System.out.println("invalid");
	}
}

