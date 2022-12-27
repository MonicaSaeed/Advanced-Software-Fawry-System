package com.Advanced.Software.Fawry.System.FawrySystem.View;

import java.util.Scanner;

import com.Advanced.Software.Fawry.System.FawrySystem.Controller.AuthenticationController;

public class AuthenticationView {
    Scanner sc = new Scanner(System.in);
    private AuthenticationController AC;

    public AuthenticationView(){
        AC=new AuthenticationController();
    }

    public void signIn(){
        System.out.print("enter name: ");
        String userName = sc.next();
        System.out.print("enter paassword: ");
        String pass = sc.next();

        String SIReturn = AC.signIn(userName, pass);

        if( SIReturn.equals("not found") ){
            System.out.println("invalid user name or password");
        }
        else{
            System.out.println("Signed in successfully");
        }
    }


    public void signUp(){
        String username,email,pass;
        boolean userType;
        System.out.print("enter user name: ");
        username = sc.next();
        System.out.print("enter email: ");
        email = sc.next();
        System.out.print("enter password: ");
        pass = sc.next();
        System.out.print("enter 1 for admin, 2 for user: ");
        userType=sc.nextBoolean();
        String up = AC.signUp(username, email);

        if(up.equals("no")){
            System.out.println("user already exist (name or email)");
        }
        else{
            System.out.println( AC.setUser(username,pass,email,userType) );
            System.out.println("Signed up successfully");
        }
    }

}
