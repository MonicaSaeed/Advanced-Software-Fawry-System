package system;

public class Landline extends Services {
	
	
	public Landline(int noOfFields, boolean cash) {
		// TODO Auto-generated constructor stub
		//super(noOfFields, cash);

		super.payByCash=cash;
		super.serviceName="Landline Service";
		super.form=new Form(noOfFields);
		super.payment=new CreditCard();
	}
	
	@Override
	void confirm() {
		// TODO Auto-generated method stub
		System.out.print("transaction done successfully for Landline service");

		
	}

}
