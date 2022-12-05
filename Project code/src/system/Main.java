package system;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		FawryUser F = new FawryUser();
		
		//must enter 3 users valid to sign up to continue the program to sign in user
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
		
		//sign in user or admin to make the functionality
		System.out.println("sign in");
		String in; //string to save if signed in user is user or admin 
		do {
			System.out.print("enter name: ");
			String name = sc.next();
			System.out.print("enter paassword: ");
			String pass = sc.next();
			in = F.signIn(name, pass);
			if(in != "not found"){
				F.setPassword(pass);
				F.setUserName(name);
				for(int i=0;i<F.fawryUsers.size();i++){
					if(F.fawryUsers.get(i).getUserName().equals(name) && F.fawryUsers.get(i).getPassword().equals(pass)){
						F.setEmail(F.fawryUsers.get(i).getEmail());
						F.setUserType(F.fawryUsers.get(i).getUserType());
					}
				}
				
			}
		}while(in=="not found");
		System.out.println("Signed in successfully");
		System.out.println("");System.out.println("");

		//System.out.println(F.getEmail());
		//System.out.println(F.getUserName());
		//System.out.println(F.getPassword());
		//System.out.println(F.getUserType());

		if(F.getUserType()==true){

		}
		//F.requestRefund( F, "hsbhh", F.getUserName());
		
	}

}
