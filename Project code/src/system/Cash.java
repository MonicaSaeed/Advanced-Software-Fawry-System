package system;

public class Cash implements Payment {
	float paymentAmount;
	@Override
	public float pay(float paymentAmount) {
		System.out.print("Pay :" + paymentAmount + "L.E.");
		// TODO Auto-generated method stub
		return 0;
	}

}
