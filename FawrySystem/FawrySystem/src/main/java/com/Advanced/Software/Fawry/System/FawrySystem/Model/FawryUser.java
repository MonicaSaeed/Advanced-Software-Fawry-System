package com.Advanced.Software.Fawry.System.FawrySystem.Model;

import com.Advanced.Software.Fawry.System.FawrySystem.Model.PaymentModel.Wallet;

public class FawryUser {
    private String userName;
	private String password;
	private String email;
	private String userType;  //Check if the user is an admin or not (admin -> admin, userFawry->user)
	private Wallet userWallet;

    FawryUser(){
		this.userWallet=new Wallet();
		this.userWallet.setTotalFunds(0);
	}
	public FawryUser(String userName,String password,String email,String userType){
		this.userName = userName;
		this.password = password;
		this.email = email;
		this. userType = userType;
		this.userWallet=new Wallet();
		this.userWallet.setTotalFunds(0);
	}

	public FawryUser(String email,String password){
		this.email = email;
		this.password = password;
		this.userWallet=new Wallet();
		this.userWallet.setTotalFunds(0);
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
	public Wallet getUserWallet()
	{
		return this.userWallet;
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
