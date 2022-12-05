package system;

import java.util.Vector;

public class SystemServices {
	
	public static Vector<Services> mobileRechargeVec = new Vector<>();
	public static Vector<Services> landlineVec = new Vector<>();
	public static Vector<Services> internetPaymentVec = new Vector<>();
	public static Vector<Services> donationsVec = new Vector<>();
	
	
	private Services cTrans=null;
	public void searchForService(String serviceName)
	{
		//Vector<Services> matchingServices=new Vector();
		if(mobileRechargeVec.get(0).getServiceName().equals(serviceName)) {
			for(int i=0;i< mobileRechargeVec.size();i++)
			{
				System.out.print("Service "+i+":	"+mobileRechargeVec.get(i).getServiceName());
			}
		}else if(internetPaymentVec.get(0).getServiceName().equals(serviceName)) {
			for(int i=0;i< internetPaymentVec.size();i++)
			{
				System.out.print("Service "+i+":	"+internetPaymentVec.get(i).getServiceName());
			}
		}else if(landlineVec.get(0).getServiceName().equals(serviceName)) {
			for(int i=0;i< landlineVec.size();i++)
			{
				System.out.print("Service "+i+":	"+landlineVec.get(i).getServiceName());
			}
		}else if(donationsVec.get(0).getServiceName().equals(serviceName)) {
			for(int i=0;i< donationsVec.size();i++)
			{
				System.out.print("Service "+i+":	"+donationsVec.get(i).getServiceName());
			}
		}

		
	}

}
