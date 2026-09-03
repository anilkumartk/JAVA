package solid_principles.dependency_inversion_principle;

public class ShoppingMall {
    private final CardPayment cardPayment;
    public ShoppingMall(CardPayment cardPayment){
        this.cardPayment=cardPayment;
    }
    public void shopping(long amount){
        cardPayment.payment(amount);
    }
    public static void main(String[] args){
        CardPayment cardPayment=new CreditCard();
        ShoppingMall shoppingMall=new ShoppingMall(cardPayment);
        shoppingMall.shopping(1000);


    }
}
