import static java.lang.Math.*;
import pack1.*;

public class MAIN {
    static int a;static String y;
    static // static initializers
    {
      a=100;
      y = "Java is fun to learn";
    }

    public static void main(String args[])
    {
        Withdrawable w = new Overdraft();

        Overdraft a1 = new Overdraft();
        SavingAccount a2 = new SavingAccount();
        a1.setBalance(-10000);
        a2.setBalance(20000);
        a1.showBalance();
        a2.showBalance();
        a1.withdraw();
        a2.withdraw();
        System.out.println(Withdrawable.bank);
        System.out.println(sqrt(16));
        System.out.println(a);
        System.out.println(y);

        if(w instanceof Transferable)
        {
            Account temp = (Account)w;
        }
        else
        {
            System.out.println("Not a parent class");
        }

        if(a1 instanceof Withdrawable)
        {
            System.out.println("A1 is inheriting from Withdrawable");
        }

    }
    public static void limit(Withdrawable w)
    {
        w.withdraw();
    }


}
