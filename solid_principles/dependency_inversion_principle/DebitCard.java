package solid_principles.dependency_inversion_principle;

public class DebitCard implements CardPayment{
    @Override
    public void payment(long amount) {
        System.out.println("Payment done using DebitCard");
    }
}
