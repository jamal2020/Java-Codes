import java.io.*;
public class ConsoleDemo {
    public static void main(String args[]) throws Exception
    {
        System.out.println("Enter your username");
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)) ;
        BufferedReader reader = new BufferedReader(new FileReader("c:\\users\\jamal ansari\\credentials.txt")) ;
        String username= reader.readLine();
        Console c=System.console();
        System.out.println("Enter your password");
        char [] ch=c.readPassword();
        String pass= String.copyValueOf(ch);
        System.out.println(username);
        System.out.println(pass);

    }
}
