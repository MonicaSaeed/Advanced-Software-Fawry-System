package system;

import java.util.Vector;

public class SystemServices {
	
	public static Vector<Services> mobileRechargeVec = new Vector<>();
	public static Vector<Services> landlineVec = new Vector<>();
	public static Vector<Services> internetPaymentVec = new Vector<>();
	public static Vector<Services> donationsVec = new Vector<>();
	
	
	//private Services cTrans=null;
	public void searchForService(int serviceName)
	{
		//Vector<Services> matchingServices=new Vector();
		if(serviceName==1) {
			for(int i=0;i< mobileRechargeVec.size();i++)
			{
				System.out.print("Service "+i+":	"+mobileRechargeVec.get(i).getServiceName());
			}
		}else if(serviceName==2) {
			for(int i=0;i< internetPaymentVec.size();i++)
			{
				System.out.print("Service "+i+":	"+internetPaymentVec.get(i).getServiceName());
			}
		}else if(serviceName==3) {
			for(int i=0;i< landlineVec.size();i++)
			{
				System.out.print("Service "+i+":	"+landlineVec.get(i).getServiceName());
			}
		}else if(serviceName==4) {
			for(int i=0;i< donationsVec.size();i++)
			{
				System.out.print("Service "+i+":	"+donationsVec.get(i).getServiceName());
			}
		}

		//return service obj to make transaction
	}

}
