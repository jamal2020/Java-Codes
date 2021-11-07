import model.Employee;

import java.io.*;
import model.Project;
public class ObjectSerializationDemo {
    public static void main(String args[])
    {
        Employee e = new Employee();
        // serialize - save the employee object in a file
        try {
            FileOutputStream fos = new FileOutputStream("c:\\users\\jamal ansari\\Emp.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            e.setId("10");;
            e.setName("Sundar");
            e.setRole("Manager");
            Project p1 = new Project();
            p1.setProjectID("p1");
            p1.setProjectName("Banking");
            e.setProject(p1);
            e.setRole("CEO");
            oos.writeObject(e);
            e.setRole("CFO");

        }catch(Exception ex)
        {
            ex.printStackTrace();
        }

        //deserialize - read back the employee from the file into memory

        try
        {
            FileInputStream fis = new FileInputStream("c:\\users\\jamal ansari\\emp.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj=ois.readObject();
            if( obj instanceof Employee)
            {
                Employee e1 = (Employee) obj;
                System.out.println(e1.getId());
                System.out.println(e1.getName());
                System.out.println(e1.getRole());
                System.out.println(e.getRole());
            }

        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
