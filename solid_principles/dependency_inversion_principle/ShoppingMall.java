package solid_principles.dependency_inversion_principle;

public class ShoppingMall {
    private final CardPayment cardPayment;  //not depends on credit or debit card.
    public ShoppingMall(CardPayment cardPayment){
        this.cardPayment=cardPayment;
    }
    public void shopping(long amount){
        cardPayment.payment(amount);
    }
    public static void main(String[] args){
        CardPayment cardPayment=new CreditCard();    //implement credit card or debit card.
        ShoppingMall shoppingMall=new ShoppingMall(cardPayment);
        shoppingMall.shopping(1000);


    }
}
