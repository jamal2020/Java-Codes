public class Example2 {
    public static void main(String args[])
    {
        try {
            test();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("End of the app");
    }
    public static void test()
    {
        subtest();
    }
    public static void subtest()
    {
        System.out.println(10/0);
    }
}
