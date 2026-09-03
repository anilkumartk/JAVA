package solid_principles.interface_segregation_principle;
//implements two interfaces
public class GooglePay implements CashBackManager,UpiPayments{
    @Override
    public void creditBalance() {

    }

    @Override
    public void payMoney() {

    }

    @Override
    public void receiveMoney() {

    }
}
