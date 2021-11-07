import java.util.Scanner;
public class Practise {
    int basic=0,da=0,hra=0; // instance

    public int getBasic() {
        return basic;
    }
    public int getDa(){
        return da;
    }
    public int getHra(){
        return hra;
    }

    public static void main(String ... a)
    {
        Practise p = new Practise();
        p.readComponents();
        p.evaluate(p.getBasic());
        p.evaluate(p.getDa());
        p.evaluate(p.getHra());
        if(p.isEligible(p.getBasic()+p.getDa()+p.getHra()))
        {
            System.out.println("Your salary is taxable");
        }
        else
        {
            System.out.println("Your salary is non taxable");
        }


    }
    public void readComponents()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basic");
        basic = sc.nextInt();
        System.out.println("Enter DA");
        da = sc.nextInt();
        System.out.println("Enter HRA");
        hra = sc.nextInt();
    }
    public void evaluate(int sal)
    {
        if(sal<0) throw new RuntimeException("Component cannot be negative");
    }
    public boolean isEligible(int total)
    {
        if(total >=250000)
        {
          return true;
        }
        {
            return false;
        }
    }
}
