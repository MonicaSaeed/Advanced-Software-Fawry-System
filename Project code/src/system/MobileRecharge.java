package system;

public class MobileRecharge extends Services {
	
	
	public MobileRecharge(int noOfFields,boolean cash) {
		// TODO Auto-generated constructor stub
		this.payByCash=cash;
		this.serviceName="Mobile Recharge service";
		this.form=new Form(noOfFields);
		this.payment=new CreditCard();
	}

	@Override
	void confirm() {
		// TODO Auto-generated method stub
		System.out.print("transaction done successfully for Mobile Recharge service");

		
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.print("The system is running");
//
//	}

}
