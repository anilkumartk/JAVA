public class BankService {
    public void printPassbook(){

        //write logic for printing passbook
    }
    public void getLoan(String loanType){
        if(loanType.equalsIgnoreCase("home")){
            // write logic for home loan
        }else if(loanType.equalsIgnoreCase("personal")){
            // write logic for personal loan
        }
    }
    public void sendOTP(String medium){
        if(medium.equalsIgnoreCase("email")){
            // write logic for email notification
        }else if(medium.equalsIgnoreCase("mobile")){
            // write logic for mobile notification
        }
    }
}