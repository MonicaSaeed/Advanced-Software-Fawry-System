package com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic;

import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Advanced.Software.Fawry.System.FawrySystem.Model.Services.Donations;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.Services.InternetPayment;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.Services.Landline;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.Services.MobileRecharge;
import com.Advanced.Software.Fawry.System.FawrySystem.Model.Services.SystemService;
@Component

public  class ServicesBSL {
	
	public  static Vector<SystemService> mobileRechargeVec = new Vector<>();
	public  static Vector<SystemService> landlineVec = new Vector<>();
	public  static Vector<SystemService> internetPaymentVec = new Vector<>();
	public  static Vector<SystemService> donationsVec = new Vector<>();
	
	public Vector<SystemService> searchForService(String serviceName)
    {		System.out.print(serviceName);
        if(serviceName.equals("MobileRechargeservice")) {

            return this.mobileRechargeVec;  
        }
        else if(serviceName.equals("InternetPaymentservice")) {

            return this.internetPaymentVec;
        }else if(serviceName.equals("Landlineservice")) {

            return this.landlineVec;
        }else if(serviceName.equals("Donationservice")) {

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

		InternetPayment orangeI = new InternetPayment(true);
		internetPaymentVec.add(orangeI);
		InternetPayment vodafoneI = new InternetPayment(false);
		internetPaymentVec.add(vodafoneI);


		Landline land1 = new Landline(false);
		landlineVec.add(land1);
		Landline land2 = new Landline(false);
		landlineVec.add(land2);


		Donations donation1 = new Donations(true);
		donationsVec.add(donation1);
		Donations donation12= new Donations(false);
		donationsVec.add(donation12);
		
		return true;

	}
	public String fillServiceForm(String amount,String directory,int serviceName)
	{
		
		if(serviceName==1) {
            this.mobileRechargeVec.get(0).setFormData(amount, directory);  
            return "filled successfully";
        }else if(serviceName==2) {

          this.internetPaymentVec.get(0).setFormData(amount, directory);
          return "filled successfully";
        }else if(serviceName==3) {

            this.landlineVec.get(0).setFormData(amount, directory);
            return "filled successfully";
        }else if(serviceName==4) {

           this.donationsVec.get(0).setFormData(amount, directory);
           return "filled successfully";
        }
        return "failed";
		
	}
		
}
