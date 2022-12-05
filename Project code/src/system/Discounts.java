package system;

import java.util.Vector;

public abstract class Discounts {
	private String dName,dType;
	private int dValue;
	public static Vector<Discounts> dList= new Vector<Discounts>();
	private DiscountViewer dViewer;
	
	
	public String getDName()
	{
		return this.dName;
	}
	public String getDType()
	{
		return this.dType;
	}
	public int getDValue()
	{
		return this.dValue;
	}
		
	///Admin creating new discount
	public void addDiscount(Discounts d, String type)
	{
		if(type.equals("admin"))
		{
			dList.add(d);
			notify();
		}
		else {System.out.print("Only admins can add new discounts...");}
	}
	
	public void removeDiscount(String d, String type)
	{
		if(type.equals("admin"))
		{
			int index=0;
			for(int i=0; i<dList.size();i++)
			{
				if(dList.get(i).getDName().equals(d))
				{
					index=i;
					break;
				}
			}
			
			dList.remove(index);
			notify();
		}
		else {System.out.print("Only admins can add new discounts...");}
		
		
	}
	
	public void notif()
	{
		//for(int i=0; i<dList.capacity();i++)
	//	{
			dViewer.update(dList);
		//}
		
	}

}
