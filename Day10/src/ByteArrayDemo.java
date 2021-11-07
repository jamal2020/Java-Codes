import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

public class ByteArrayDemo {
    public static void main(String args[]) throws Exception {
        ByteArrayOutputStream boutput = new ByteArrayOutputStream(12);
        while (boutput.size() != 10) {
            boutput.write("Hello".getBytes());
        }
        byte b[] = boutput.toByteArray();
        for (int i = 0; i < b.length; i++) {
            System.out.print((char) b[i]);
        }

        int c;
        ByteArrayInputStream binput = new ByteArrayInputStream(b);
        while((c=binput.read())!=-1)
        {
            System.out.print(Character.toUpperCase((char)c));
        }


    }
}
