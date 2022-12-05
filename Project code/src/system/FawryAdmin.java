package system;

public class FawryAdmin extends FawryUser {

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
