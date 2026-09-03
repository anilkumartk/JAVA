package solid_principles.interface_segregation_principle;
//need only UpiPayments interface. Not forced to implement Credit cash back interface.
public class PhonePay implements UpiPayments{
    @Override
    public void payMoney() {

    }

    @Override
    public void receiveMoney() {

    }
}
