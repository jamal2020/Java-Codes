import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example5 {

    public static void main(String args[])  {
       String str="";
       try {
           str = readModule("C:\\Users\\jamal ansari\\Music\\abc.txt");
       } catch(Exception e)
       {

       }
       System.out.println(str);
        System.out.println("End");
    }

    public static String readModule(String filePath) throws IOException {

        BufferedReader br = null;

        br = new BufferedReader(new FileReader(filePath));
       return br.readLine();
    }
    }



