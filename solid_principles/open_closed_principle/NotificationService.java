package solid_principles.open_closed_principle;

/*

If we want new features in notification service, then we need to modify the notification service class.

*/




public class NotificationService {


    public void sendOTP(String medium){
        if(medium.equalsIgnoreCase("email")){
            // write logic for email notification
        }else if(medium.equalsIgnoreCase("mobile")){
            // write logic for mobile notification
        }
    }
}

