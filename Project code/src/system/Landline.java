package system;

public class Landline extends Services {
	
	
	public Landline(int noOfFields, boolean cash) {
		super(noOfFields, cash);
		// TODO Auto-generated constructor stub
		this.payByCash=cash;
		this.serviceName="Landline Service";
		this.form=new Form(noOfFields);
		this.payment=new CreditCard();
	}
	
	@Override
	void confirm() {
		// TODO Auto-generated method stub
		System.out.print("transaction done successfully for Landline service");

		
	}

}
