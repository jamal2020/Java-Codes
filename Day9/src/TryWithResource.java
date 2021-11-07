import java.io.*;
public class TryWithResource {
    public static void main(String args[]) throws IOException {

        try (BufferedWriter br = new BufferedWriter(new FileWriter("C:\\Users\\jamal ansari\\Music\\abc.txt"))) {

            br.write("Welcome to Java");

        br.close();


            try (BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\jamal ansari\\Music\\abc.txt"))) {

                System.out.println(br1.readLine());
            }

        }

        }





}



