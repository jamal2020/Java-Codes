import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class NestedTry {

    public static void main(String args[])
    {
        BufferedReader br=null;
        try {
            br= new BufferedReader(new FileReader("C:\\Users\\jamal ansari\\Music\\abc.txt"));
            System.out.println(br.readLine());
            try {
                System.out.println(10 / 0);
            }catch(ArithmeticException ae)
            {

                ae.printStackTrace();
            }
        }catch(FileNotFoundException e)
        {
          System.out.println("File Not Found");
        }
        catch(java.io.IOException ex)
        {
            System.out.println("Cant read the file - permission denied");
        }

        System.out.println("End ...");

    }
}
