import pack1.Account;

public class SavingAccount extends Account implements Withdrawable{
    @Override
    public void showBalance() // overriding
    {
        System.out.println("The Saving account balance is "+balance);
    }
    @Override
    public void withdraw()
    {
    System.out.println("Can withdraw to the extent of balance only");
    }


}
