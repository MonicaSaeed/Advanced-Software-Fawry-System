package system;

import java.util.Vector;

public class CompleteTransaction {
    private String serviceUserName;
    private String serviceName;
    private float servicePrice;
    public static Vector<CompleteTransaction> completeServices = new Vector<>(); //to save all completed services

	CompleteTransaction(String serviceUserName, String serviceName, float servicePrice){
		this.serviceUserName = serviceUserName;
		this.serviceName = serviceName;
		this.servicePrice = servicePrice;
	}


    public String getServiceUserName() {
		return serviceUserName;
	}
	public String getServiceName() {
		return serviceName;
	}
	public float getServicePrice() {
		return servicePrice;
	}

    public void setServiceUserName(String serviceUser) {
		this.serviceUserName = serviceUserName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public void setservicePrice(Float servicePrice) {
		this.servicePrice = servicePrice;
	}

	public void addCompleteTransaction(CompleteTransaction CT){
		completeServices.add(CT);
	}
    
}
