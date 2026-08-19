package solid_principles.single_responsibility_principle;

public class LoanService {

    public void getLoan(String loanType){
        if(loanType.equalsIgnoreCase("home")){
            // write logic for home loan
        }else if(loanType.equalsIgnoreCase("personal")){
            // write logic for personal loan
        }
    }

}