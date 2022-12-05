package system;

import java.util.Vector;

public class SystemServices {
	
	public static Vector<Services> mobileRechargeVec = new Vector<>();
	public static Vector<Services> landlineVec = new Vector<>();
	public static Vector<Services> internetPaymentVec = new Vector<>();
	public static Vector<Services> donationsVec = new Vector<>();
	
	
	private Services cTrans=null;
	public Vector<Services> searchForService(String serviceName)
	{
		//Vector<Services> matchingServices=new Vector();
		if(mobileRechargeVec.get(0).getServiceName().equals(serviceName)) {
			return mobileRechargeVec;
		}else if(internetPaymentVec.get(0).getServiceName().equals(serviceName)) {
			return internetPaymentVec;
		}else if(landlineVec.get(0).getServiceName().equals(serviceName)) {
			return landlineVec;
		}else if(donationsVec.get(0).getServiceName().equals(serviceName)) {
			return donationsVec;
		}
		return null;
		
	}

}
