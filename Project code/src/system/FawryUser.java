package system;

import java.util.*;  

public class FawryUser {
	protected String userName;
	protected String password;
	protected String email;
	protected boolean userType;  //Check if the user is an admin or not (admin -> true, user->false)
	public static Vector<FawryUser> fawryUsers = new Vector<>(); //to save all users' data
	
	FawryUser(){
		
	}
	FawryUser(String userName,String password,String email,boolean userType){
		this.userName = userName;
		this.password = password;
		this.email = email;
		this. userType = userType;
	}
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
	
	
	//return no if invalid user name or email 
	public String signUp (String userName, String email){ 
		String valid ="yes";
        for(int i=0;i<fawryUsers.size();i++){
            FawryUser FU = fawryUsers.get(i);
            String UN = FU.getUserName();
            String E = FU.getEmail();
            if(userName.equals(UN) || email.equals(E)){
                System.out.println("user already exist (name or email)");
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
            FawryUser FU = fawryUsers.get(i);
            String UN = FU.getUserName();
            String p = FU.getPassword();
            if(userName.equals(UN)  && password.equals(p) ){
				b=FU.getUserType();
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
		} //System.out.println("Singed in successfully");
		else{
			System.out.println("invalid user name or password");
			return "not found";
		} 
	}

	//if user want to refund, the user shoud send serves name 
	void requestRefund (FawryAdmin f,String servesName,String userName){
		f.checkRefund(servesName, userName);
	}

}