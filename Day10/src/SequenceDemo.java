import java.io.*;
import java.util.*;
public class SequenceDemo {
    public static void main(String args[]) throws Exception
    {
        Date d = new Date(System.currentTimeMillis());
        System.out.print(d);
        FileInputStream f = new FileInputStream("c:\\users\\jamal ansari\\credentials.txt");
        FileInputStream f1 = new FileInputStream("c:\\users\\jamal ansari\\demo.txt");
        Vector v = new Vector();
        v.add(f);
        v.add(f1);
        Enumeration e = v.elements();
        SequenceInputStream sis = new SequenceInputStream(e);
        int c;
        while((c=sis.read())!=-1)
        {
            System.out.print((char)c);
        }


    }

}
