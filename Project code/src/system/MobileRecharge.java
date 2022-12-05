package system;

public class MobileRecharge extends Services {
	
	
	public MobileRecharge(int noOfFields,boolean cash) {
		// TODO Auto-generated constructor stub
		//super(noOfFields, cash);

		super.payByCash=cash;
		super.serviceName="Mobile Recharge service";
		super.form=new Form(noOfFields);
		super.payment=new CreditCard();
		
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
