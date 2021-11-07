import java.io.*;
public class FileDemo {
    public static void main(String args[])
    {
        File f = new File("c:\\users\\jamal ansari\\demo.txt");
        File f1 = new File("c:\\");
        System.out.println(f1.getTotalSpace());
        System.out.println(f1.getFreeSpace());
        System.out.println(f.exists());
        try {
            f.createNewFile();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
