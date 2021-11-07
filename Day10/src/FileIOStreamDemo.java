import java.io.*;

public class FileIOStreamDemo {
    public static void main(String args[])
    {
        try
        {
            byte data[]={65,66,67,68};
            OutputStream os= new FileOutputStream("c:\\users\\jamal ansari\\demo.txt",true);
            for(int x=0;x<data.length;x++)
            {
                os.write(data[x]);
            }
            os.flush();
            os.close();

            InputStream is = new FileInputStream("c:\\users\\jamal ansari\\demo.txt");
            int size = is.available();
            for(int i=0;i<size;i++)
            {
                System.out.println((char)is.read());

            }
            is.close();



        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}
