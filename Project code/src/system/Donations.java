package system;

public class Donations extends Services {
	
	public Donations(int noOfFields, boolean cash) {
		// TODO Auto-generated constructor stub
		//super(noOfFields, cash);

		super.payByCash=cash;
		super.serviceName="Donation service";
		super.form=new Form(noOfFields);
		super.payment=new CreditCard();
	}

	@Override
	void confirm() {
		// TODO Auto-generated method stub
		System.out.print("transaction done successfully for Donation service");

		
	}
	

}
