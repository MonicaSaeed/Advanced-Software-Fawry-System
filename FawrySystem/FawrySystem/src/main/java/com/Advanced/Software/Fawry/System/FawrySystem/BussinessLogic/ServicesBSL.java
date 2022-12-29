package com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic;

import java.util.Vector;

import com.Advanced.Software.Fawry.System.FawrySystem.Model.Services;

public  class ServicesBSL {
	public static Vector<Services> allServices = new Vector<>();
	
	public  Vector<Services> mobileRechargeVec = new Vector<>();
	public  Vector<Services> landlineVec = new Vector<>();
	public  Vector<Services> internetPaymentVec = new Vector<>();
	public  Vector<Services> donationsVec = new Vector<>();
	
	
	//private Services cTrans=null;
	public Vector<Services> searchForService(int serviceName)
	{
		if(serviceName==1) {
			for(int i=0;i< allServices.size();i++)
			{
				if(allServices.get(i).getServiceName().equals("Mobile Recharge service"))
					mobileRechargeVec.add(allServices.get(i));
			}
			return this.mobileRechargeVec;
		}else if(serviceName==2) {
			for(int i=0;i< allServices.size();i++)
			{
				if(allServices.get(i).getServiceName().equals("Internet Payment service"))
					internetPaymentVec.add(allServices.get(i));
			}
			return this.internetPaymentVec;
		}else if(serviceName==3) {
			for(int i=0;i< allServices.size();i++)
			{
				if(allServices.get(i).getServiceName().equals("landlineNumber"))
					landlineVec.add(allServices.get(i));
			}
			return this.landlineVec;
		}else if(serviceName==4) {
			for(int i=0;i< allServices.size();i++)
			{
				if(allServices.get(i).getServiceName().equals("Donation service"))
					donationsVec.add(allServices.get(i));
			}
			return this.donationsVec;
		}
		return null;

		//return service obj to make transaction
	}
	
		
	

}
