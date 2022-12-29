package com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic;

import java.util.Vector;

import com.Advanced.Software.Fawry.System.FawrySystem.Model.Services.Donations;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.Services.InternetPayment;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.Services.Landline;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.Services.MobileRecharge;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.Services.Service;

public  class ServicesBSL {
	public static Vector<Service> allServices = new Vector<>();
	
	public  Vector<Service> mobileRechargeVec = new Vector<>();
	public  Vector<Service> landlineVec = new Vector<>();
	public  Vector<Service> internetPaymentVec = new Vector<>();
	public  Vector<Service> donationsVec = new Vector<>();
	
	
	//private Services cTrans=null;
	public Vector<Service> searchForService(int serviceName)
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
	
	//
	public boolean createServices()
	{
		MobileRecharge orangeM = new MobileRecharge(false);
		allServices.add(orangeM);
		MobileRecharge vodafoneM = new MobileRecharge(false);
		allServices.add(vodafoneM);

		InternetPayment orangeI = new InternetPayment(false);
		allServices.add(orangeI);
		InternetPayment vodafoneI = new InternetPayment(false);
		allServices.add(vodafoneI);


		Landline land1 = new Landline(false);
		allServices.add(land1);
		Landline land2 = new Landline(false);
		allServices.add(land2);


		Donations donation1 = new Donations(false);
		allServices.add(donation1);
		Donations donation12= new Donations(false);
		allServices.add(donation12);
		
		return true;

	}
		
	

}
