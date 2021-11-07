import java.io.FileInputStream;
import java.io.InputStream;
import java.io.*;

public class ImageReadWriteDemo {
    public static void main(String args[]) throws Exception
    {
        InputStream is = new FileInputStream("c:\\users\\jamal ansari\\Google-Images.jpg");
        OutputStream os = new FileOutputStream("c:\\users\\jamal ansari\\temp.jpg");
        int c=0;
        while((c=is.read())!=-1)
        {
            os.write(c);
        }
        os.flush();
        os.close();
        is.close();
    }
}
