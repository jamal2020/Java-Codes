package org.example;

import org.example.model.Account;
import org.example.model.AccountHolder;
import org.example.model.BankAccount;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import practical.Customer;
import practical.DBConnector;
import practical.Product;
import practical.SpringDBConnector;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
        System.out.println( "Hello World!" );
        //BankAccount hdfc = new BankAccount(); // Singleton
        BankAccount h1 = BankAccount.getAccount();
        BankAccount h2 = BankAccount.getAccount();
        h1.setBalance(10000);
        System.out.println(h2.getBalance());

        // ApplicationContext from Spring Framework
       ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"beans.xml","customer.xml"});

 //       ApplicationContext ctx = new FileSystemXmlApplicationContext(new String[]{"C:\\Users\\jamal ansari\\IdeaProjects\\SpringDay1\\src\\main\\resources\\beans.xml"});
       Account a = (Account)ctx.getBean("accounts");
//          a.setBalance(1000);
//       a.setName("ABCD");
       System.out.println(a.getBalance());
       System.out.println(a.getName());
        Account b =(Account)ctx.getBean("accounts");

        AccountHolder ho1= (AccountHolder) ctx.getBean("holder");
        System.out.println(ho1.getAccount().getName());
        System.out.println(ho1.getAddress());
        System.out.println(ho1.getAccount().getBalance());

        ho1=null;

        AccountHolder ho2= (AccountHolder) ctx.getBean("holder");
        //ho2.setName("Rajendra");
       // System.out.println(ho1.getName());
        //System.out.println(ho2.getName());

        AccountHolder ho3=(AccountHolder) ctx.getBean("holder1");
        System.out.println(ho3.getName());

        Connection conn = new DBConnector("org.h2.Driver","jdbc:h2:file:c:/user/jamal ansari/test2","sa").getConnection();

        Connection spConn = ((SpringDBConnector)ctx.getBean("springDB")).getConnection();

        Customer cust = (Customer)ctx.getBean("cust");

        cust.getProducts().forEach((n)->{System.out.print(n.getProName()); System.out.println(n.getPrice());});

        Product p3 = (Product) ctx.getBean("prod2");
        p3.setProName("Asus laptop");
        p3.setPrice(1000);
        cust.getProducts().add(p3);


        spConn.close();
        spConn = null;
           System.out.println("Main Ended");






    }


    }

