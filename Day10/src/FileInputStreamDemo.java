import java.io.*;
public class FileInputStreamDemo {
    public static void main(String args[])
    {
        try
        {
        FileInputStream fis = new FileInputStream("c:\\users\\jamal ansari\\demo.txt");
        int c=0;
        while((c=fis.read())!=-1)
            {
                System.out.println(c);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
