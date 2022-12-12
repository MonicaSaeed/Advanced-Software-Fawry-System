package system;

import java.util.Vector;

public abstract class Discounts {
	protected String dName,dType;
	protected int dValue;
	public static Vector<Discounts> dList= new Vector<Discounts>();
	protected DiscountViewer dViewer;
	
	
	public Discounts(String dName, String dType, int dValue) {
		// TODO Auto-generated constructor stub
		this.dName=dName;
		this.dType=dType;
		this.dValue=dValue;
		//this.checkValidation=condition;
	}
	
	
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
	public void addDiscount(String dName, String dType, int dValue,String condition)
	{
		if(dType.equals("SpecificDiscount"))
		{
			Discounts newDis= new SpecificDiscount(dName,dType,dValue);
			dList.add(newDis);
			Dnotify();
		}
		else if(dType.equals("OverallDiscount"))
		{
			Discounts newDis= new OverallDiscount(dName,dType,dValue);
			dList.add(newDis);
			this.Dnotify();
		}
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
			this.Dnotify();
		}
		else {System.out.print("Only admins can add new discounts...");}
	}
	
	public void Dnotify()
	{
		dViewer.update(dList);	
	}
	
	public Float applyAllDiscounts(Float pAmount)
	{
		for(int i=0; i<dList.size();i++)
		{
			pAmount= pAmount-(pAmount*(dList.get(i).getDValue()/100));
			
		}
		return pAmount;
	}
	
	abstract boolean checkDiscountValidation(String serviceName);

}



