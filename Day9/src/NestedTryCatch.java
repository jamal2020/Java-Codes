import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class NestedTryCatch {

    public static void main(String args[])
    {
        BufferedReader br=null;
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\jamal ansari\\Music\\abc.tx"));
            System.out.println(br.readLine());
        }catch(java.io.IOException io)
        {
           try
           {
               System.out.println(10/0);
           }catch(Exception e){}
        }
        finally {
            try {
                br.close();
            }catch(Exception e)
            {
                System.out.println("Error closing the file");
            }
        }
        }
}
