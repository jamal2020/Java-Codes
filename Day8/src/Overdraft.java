import pack1.*;

public final  class Overdraft extends Account implements Withdrawable{
    @Override
    public void showBalance() {
        System.out.println("The OD balance is "+balance);
    }


    @Override
    public void withdraw() {
        System.out.println("Can withdraw in access of your balance");
    }
}
