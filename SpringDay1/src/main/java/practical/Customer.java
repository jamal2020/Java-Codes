package practical;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Customer {
    ArrayList<Product>products = new ArrayList<Product>();
    private String name;

    public Customer()
    {

    }
    public ArrayList<Product> getProducts() {
        return products;
    }

    public ArrayList<Product> getProductsFromDB() throws SQLException {

        ApplicationContext ctx= new ClassPathXmlApplicationContext("customer.xml");
        Connection conn =  ((SpringDBConnector)ctx.getBean("springDB")).getConnection();

//        Statement st = conn.createStatement();
//        ResultSet rs=st.executeQuery("select * from products");
//        while(rs.next())
//      {
//        Product temp = new Product();
//        temp.setPrice(rs.getInt(1));
//        temp.setProName(rs.getString("prod"));
//         products.add(temp);
//     }
        return null;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
