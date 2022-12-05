package system;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		FawryUser F = new FawryUser();
		
		
		//System.out.println("for sing in enter 1 ,for sign up 2");
		for(int i=0;i<3;i++) {
			String up;
			String username,email,pass;
			int userType;
			do {
				System.out.print("enter user name: ");
				username = sc.next();
				System.out.print("enter email: ");
				email = sc.next();
				System.out.print("enter password: ");
				pass = sc.next();
				System.out.print("enter 1 for admin, 2 for user: ");
				userType=sc.nextInt();
				up = F.signUp(username, email);
			}while(up=="no");
			
			FawryUser FUValid = new FawryUser();
			FUValid.setEmail(email);
			FUValid.setPassword(pass);
			FUValid.setUserName(username);
			//admin-> true, user-> false
			if(userType==1) {
				FUValid.setUserType(true);
			}else{
				FUValid.setUserType(false);
			}
			
			F.fawryUsers.add(FUValid);
			System.out.println("Signed up successfully");
		}
		
		System.out.println("sign in");
		String in; //string to save if signed in user is user or admin 
		do {
			System.out.print("enter name: ");
			String name = sc.next();
			System.out.print("enter paassword: ");
			String pass = sc.next();
			in = F.signIn(name, pass);
		}while(in=="not found");
		System.out.println("Signed in successfully");
		
		
		
		
		
	}

}
