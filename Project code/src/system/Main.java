package system;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		FawryUser F = new FawryUser();
		
		SystemServices systemServices=new SystemServices();
		FawryAdmin admin= new FawryAdmin("Ali","ali@gmail.com","123456",true);
		
		////you must creat some services to work on in the project
		
		
		/***the next comment block to check all services**/
		
		
//		MobileRecharge orange= new MobileRecharge(2, false);
//		SystemServices.mobileRechargeVec.add(orange);
//		MobileRecharge vodafone= new MobileRecharge(2, false);
//		SystemServices.mobileRechargeVec.add(vodafone);
//		InternetPayment etisalat= new InternetPayment(3, false);
//		SystemServices.internetPaymentVec.add(etisalat);
//		InternetPayment we= new InternetPayment(3, false);
//		SystemServices.internetPaymentVec.add(we);
//		Landline quarter=new Landline(2, true);
//		SystemServices.landlineVec.add(quarter);
		Landline monthly=new Landline(2, true);
		SystemServices.landlineVec.add(monthly);
		Donations cancerHospital= new Donations(3, false);
		SystemServices.donationsVec.add(cancerHospital);
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//must enter 3 users valid to sign up to continue the program to sign in user
		for(int i=0;i<2;i++) {
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
			
			FawryUser.fawryUsers.add(FUValid);
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
				for(int i=0;i<FawryUser.fawryUsers.size();i++){
					if(FawryUser.fawryUsers.get(i).getUserName().equals(name) && F.fawryUsers.get(i).getPassword().equals(pass)){
						F.setEmail(FawryUser.fawryUsers.get(i).getEmail());
						F.setUserType(FawryUser.fawryUsers.get(i).getUserType());
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
			System.out.print("6/ exit\n");
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
				
				systemServices.searchForService(servicChoice);

			}
			else if(choice==2)
			{
				monthly.makeTransaction(F.getUserName());
			}
			else if(choice==3)
			{
				System.out.println("enter service name: ");
				String ser = sc.next();
				F.requestRefund(admin, ser, F.getUserName());
				admin.checkRefund(ser,F.getUserName());
			}
			else if(choice==4)
			{
				Wallet w=new Wallet(80,20);
				CreditCard c = new CreditCard("123","***",80);
				w.addFunds(c, 10);
			}
			else if(choice==5)
			{
				DiscountViewer d=new DiscountViewer();
				d.viewDiscounts();
			}
			
		}while(choice!=6);
		
	}

}
