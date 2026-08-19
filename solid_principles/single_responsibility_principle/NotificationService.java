package solid_principles.single_responsibility_principle;

public class NotificationService {

    public void sendOTP(String medium){
        if(medium.equalsIgnoreCase("email")){
            // write logic for email notification
        }else if(medium.equalsIgnoreCase("mobile")){
            // write logic for mobile notification
        }
    }


}