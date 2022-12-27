package com.Advanced.Software.Fawry.System.FawrySystem.Model;

public class FawryUser {
    private String userName;
	private String password;
	private String email;
	private boolean userType;  //Check if the user is an admin or not (admin -> true, user->false)
	

    FawryUser(){
		
	}
	public FawryUser(String userName,String password,String email,boolean userType){
		this.userName = userName;
		this.password = password;
		this.email = email;
		this. userType = userType;
	}

	public FawryUser(String userName,String password){
		this.userName = userName;
		this.password = password;
		this.email = "";
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
	public void setFaweryUser(String userName,String password,String email,boolean userType){
		this.userName = userName;
		this.password = password;
		this.email = email;
		this. userType = userType;
	}

}
