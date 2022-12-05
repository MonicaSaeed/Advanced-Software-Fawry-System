package system;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		FawryUser F = new FawryUser();
		
		SystemServices systemServices=new SystemServices();
		FawryAdmin admin= new FawryAdmin("Ali","ali@gmail.com","123456",true);
		
		////you must creat some services to work on in the project
		MobileRecharge orange= new MobileRecharge(2, false);
		systemServices.mobileRechargeVec.add(orange);
		MobileRecharge vodafone= new MobileRecharge(2, false);
		systemServices.mobileRechargeVec.add(vodafone);
		InternetPayment etisalat= new InternetPayment(3, false);
		systemServices.internetPaymentVec.add(etisalat);
		InternetPayment we= new InternetPayment(3, false);
		systemServices.internetPaymentVec.add(we);
		Landline quarter=new Landline(2, true);
		systemServices.landlineVec.add(quarter);
		Landline monthly=new Landline(2, true);
		systemServices.landlineVec.add(monthly);
		Donations cancerHospital= new Donations(3, false);
		systemServices.donationsVec.add(cancerHospital);
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		int choice=6;
		do {
			System.out.print("Choose action from thr following menu\n");
			System.out.print("1/ Search for a service\n");
			System.out.print("2/ pay for a service\n");
			System.out.print("3/ make a refund\n");
			System.out.print("4/ add to wollet\n");
			System.out.print("5/ view all discounts\n");
			System.out.print("6/ exit");
			choice=sc.nextInt();
			
			if(choice==1) 
			{
				int servicChoice;
				System.out.print("Choose service name\n");
				System.out.print("1/ Mobile Recharge\n");
				System.out.print("2/ Internet Payment\n");
				System.out.print("3/ Landline\n");
				System.out.print("4/ Donations\n");
				servicChoice=sc.nextInt();
				
				if(servicChoice==1) {
					systemServices.searchForService("Mobile Recharge service");
				}else if(servicChoice==2) {
					systemServices.searchForService("Internet Payment service");
				}else if(servicChoice==3) {
					systemServices.searchForService("Landline Service");
				}else if(servicChoice==4) {
					systemServices.searchForService("Donation service");
				}
			}
			else if(choice==2)
			{
				
			}
			else if(choice==3)
			{
				
			}
			else if(choice==4)
			{
				
			}
			else if(choice==5)
			{
				
			}
			
		}while(choice!=6);
		
	}

}
