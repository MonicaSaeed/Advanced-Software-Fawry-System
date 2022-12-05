package system;

import java.util.Vector;

public class DiscountViewer {
	
	private String dName,dType;
	private int dValue;
	private Vector<Discounts> disList= new Vector<Discounts>();

	
	public void viewDiscount() 
	{
		System.out.print("Discount name	"+dName+"\nDiscount type: "+dType+"\nDiscount value: "+dValue+"%\n");
		
	}
	
	public void update(Vector<Discounts> dlist)
	{
		for(int i=0; i<dlist.size();i++)
		{
			disList.clear();
			disList.add( dlist.get(i));
		}
//		this.dName=name;
//		this.dType=type;
//		this.dValue=value;
	}

}
