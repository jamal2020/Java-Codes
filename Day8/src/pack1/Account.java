package pack1;

public abstract class Account {
    protected double balance; // properties / instance var
    public abstract void showBalance();
    public final void setBalance(double d)
{   this.balance=d;
}
public double getBalance()
{
    return balance;
}
}
