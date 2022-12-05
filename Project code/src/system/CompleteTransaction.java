package system;

import java.util.Vector;

public class CompleteTransaction {
    private String serviceUserName;
    private String serviceName;
    private float servicePrice;
    public static Vector<CompleteTransaction> completeServices = new Vector<>(); //to save all completed services

	CompleteTransaction(){
		
	}
	CompleteTransaction(String serviceUserName, String serviceName, float servicePrice){
		this.serviceUserName = serviceUserName;
		this.serviceName = serviceName;
		this.servicePrice = servicePrice;
	}


    public String getServiceUserName() {
		return this.serviceUserName;
	}
	public String getServiceName() {
		return this.serviceName;
	}
	public float getServicePrice() {
		return this.servicePrice;
	}
	public Vector<CompleteTransaction> getCompleteServices(){
		return this.completeServices;
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
