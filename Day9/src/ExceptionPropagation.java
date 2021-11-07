public class ExceptionPropagation {
    public static void main(String args[]) throws Exception
    {
        ExceptionPropagation ep = new ExceptionPropagation();
        ep.bolt();
    }
    public void walk() throws Exception
    {
        throw new Exception("Cant walk now");
    }
    public void jog() throws Exception
    {
        walk();
    }
    public void run() throws Exception
    {
        jog();
    }
    public void sprint() throws Exception
    {
        run();
    }
    public void bolt() throws Exception
    {
        sprint();
    }

}
