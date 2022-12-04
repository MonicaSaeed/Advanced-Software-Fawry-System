package system;

import java.util.*;  

public class FawryUser {
	private String userName;
	private String password;
	private String email;
	private String userType;  //Check if the user is an admin or not (admin -> true, user->false)
	Vector<FawryUser> fawryUsers = new Vector<>(); //to save all users' data
	
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
	public String getUserType() {
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
	public void setUserType(String userType) {
		this. userType = userType;
	}
	
	public void signUp(String userName,String password, String email, String userType ){
        for(int i=0;i<fawryUsers.size();i++){
            FawryUser FU = fawryUsers.get(i);
            String UN = FU.getUserName();
            String E = FU.getEmail();
            if(userName == UN ){
                System.out.println("Invalid  user name");
            }
            else if (email == E ){
                System.out.println("Invalid  email");
            }
            else{
                FawryUser FUValid = new FawryUser() ;
                FUValid.setEmail(email);
                FUValid.setPassword(password);
                FUValid.setUserName(userName);
                FUValid.setUserType(userType);
                fawryUsers.add(FUValid);
                System.out.println("Singed up successfully");
            }

        }        

    }
}
