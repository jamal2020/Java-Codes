import java.io.FileOutputStream;
import java.io.*;
public class DataInputStreamDemo {
    public static void main(String args[]) throws Exception
    {
        DataOutputStream dataout = new DataOutputStream(new FileOutputStream("c:\\users\\jamal ansari\\data.txt"));
        dataout.writeUTF("Hello, good morning!!");
        dataout.writeBoolean(true);


        DataInputStream dinput = new DataInputStream(new FileInputStream("c:\\users\\jamal ansari\\data.txt"));
        String k = dinput.readUTF();
        boolean t= dinput.readBoolean();
        System.out.println(k);
        System.out.println(t);

//        while(dinput.available()>0)
//        {
//
//        }

    }
}
