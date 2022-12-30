package com.Advanced.Software.Fawry.System.FawrySystem.Model;

public class FawryUser {
    private String userName;
	private String password;
	private String email;
	private String userType;  //Check if the user is an admin or not (admin -> admin, userFawry->user)
	

    FawryUser(){
		
	}
	public FawryUser(String userName,String password,String email,String userType){
		this.userName = userName;
		this.password = password;
		this.email = email;
		this. userType = userType;
	}

	public FawryUser(String email,String password){
		this.email = email;
		this.password = password;
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
	public void setFaweryUser(String userName,String password,String email,String userType){
		this.userName = userName;
		this.password = password;
		this.email = email;
		this. userType = userType;
	}

}
