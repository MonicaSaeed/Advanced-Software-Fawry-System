package system;

public class FawryAdmin extends FawryUser {

    public FawryAdmin(String string, String string2, String string3, boolean b) {
		// TODO Auto-generated constructor stub
    	this.userName = userName;
		this.password = password;
		this.email = email;
		this. userType = userType;
	}

	public float checkRefund(String servesName,String userName){
        CompleteTransaction CtObj=null;

        for(int i=0;i< CtObj.completeServices.size();i++){
            String SUN=CtObj.completeServices.get(i).getServiceUserName();
            String SN=CtObj.completeServices.get(i).getServiceName();
            if(SUN.equals(userName) && SN.equals(servesName) ){
                return CtObj.completeServices.get(i).getServicePrice();
            }
        }
        return -1;
    }
   
}
