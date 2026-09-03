package solid_principles.dependency_inversion_principle;

public class CreditCard implements CardPayment{
    @Override
    public void payment(long amount) {
        System.out.println("Payment done using CreditCard");
    }
}
