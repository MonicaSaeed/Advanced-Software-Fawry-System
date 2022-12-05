package system;

public class InternetPayment extends Services {
	
	public InternetPayment(int noOfFields, boolean cash) {
		// TODO Auto-generated constructor stub
		this.payByCash=cash;
		this.serviceName="Internet Payment service";
		this.form=new Form(noOfFields);
		this.payment=new CreditCard();
	}

	@Override
	void confirm() {
		// TODO Auto-generated method stub
		System.out.print("transaction done successfully for Internet Payment service");

		
	}

}
