import java.util.Scanner;
public class AgeException {
    public static void main(String args[])
    {
        int age = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any age");
        age = sc.nextInt();
//        eligibility(age);
        try
        {
            eligibility(age);
            System.out.println("Elgibile for Vote");
        }
        catch(Throwable e)
        {
            System.out.println("Not eligible for vote");
        }


    }
    public static boolean eligibility(int age) throws Exception
    {
        if(age<18)
            throw new EligibilityException("Age is less that 18");
        else
           return true;

    }
}
