package com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic;

import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Advanced.Software.Fawry.System.FawrySystem.Model.Services.Donations;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.Services.InternetPayment;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.Services.Landline;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.Services.MobileRecharge;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.Services.SystemService;
@Component
@Service
public  class ServicesBSL {
	
	public  static Vector<SystemService> mobileRechargeVec = new Vector<>();
	public  static Vector<SystemService> landlineVec = new Vector<>();
	public  static Vector<SystemService> internetPaymentVec = new Vector<>();
	public  static Vector<SystemService> donationsVec = new Vector<>();
	
	
	public Vector<SystemService> searchForService(int serviceName)
    {
        if(serviceName==1) {

            return this.mobileRechargeVec;
        }else if(serviceName==2) {

            return this.internetPaymentVec;
        }else if(serviceName==3) {

            return this.landlineVec;
        }else if(serviceName==4) {

            return this.donationsVec;
        }
        return null;

    }


	//singleton ->to create services at one  
	@Autowired
	public boolean createServices()
	{
		MobileRecharge orangeM = new MobileRecharge(false);
		mobileRechargeVec.add(orangeM);
		MobileRecharge vodafoneM = new MobileRecharge(false);
		mobileRechargeVec.add(vodafoneM);

		InternetPayment orangeI = new InternetPayment(false);
		internetPaymentVec.add(orangeI);
		InternetPayment vodafoneI = new InternetPayment(false);
		internetPaymentVec.add(vodafoneI);


		Landline land1 = new Landline(false);
		landlineVec.add(land1);
		Landline land2 = new Landline(false);
		landlineVec.add(land2);


		Donations donation1 = new Donations(false);
		donationsVec.add(donation1);
		Donations donation12= new Donations(false);
		donationsVec.add(donation12);
		
		return true;

	}
		
}
