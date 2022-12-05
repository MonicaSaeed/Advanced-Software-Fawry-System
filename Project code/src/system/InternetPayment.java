package system;

public class InternetPayment extends Services {
	
	public InternetPayment(int noOfFields, boolean cash) {
		// TODO Auto-generated constructor stub
		//super(noOfFields, cash);

		super.payByCash=cash;
		super.serviceName="Internet Payment service";
		super.form=new Form(noOfFields);
		super.payment=new CreditCard();
	}

	@Override
	void confirm() {
		// TODO Auto-generated method stub
		System.out.print("transaction done successfully for Internet Payment service");

		
	}

}
