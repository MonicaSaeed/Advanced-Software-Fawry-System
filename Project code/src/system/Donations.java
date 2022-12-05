package system;

public class Donations extends Services {
	
	public Donations(int noOfFields, boolean cash) {
		super(noOfFields, cash);
		// TODO Auto-generated constructor stub
		this.payByCash=cash;
		this.serviceName="Donation service";
		this.form=new Form(noOfFields);
		this.payment=new CreditCard();
	}

	@Override
	void confirm() {
		// TODO Auto-generated method stub
		System.out.print("transaction done successfully for Donation service");

		
	}
	

}
