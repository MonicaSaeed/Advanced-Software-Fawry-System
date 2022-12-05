package system;

public class FawryAdmin extends FawryUser {

    public FawryAdmin(String string, String string2, String string3, boolean b) {
		// TODO Auto-generated constructor stub
    	super.userName = userName;
		super.password = password;
		super.email = email;
		super. userType = userType;
	}

	public float checkRefund(String servesName,String userName){
        CompleteTransaction CtObj=null;

        for(int i=0;i< CompleteTransaction.completeServices.size();i++){
            String SUN=CompleteTransaction.completeServices.get(i).getServiceUserName();
            String SN=CompleteTransaction.completeServices.get(i).getServiceName();
            if(SUN.equals(userName) && SN.equals(servesName) ){
                return CompleteTransaction.completeServices.get(i).getServicePrice();
            }
        }
        return -1;
    }
   
}
