package practical;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SpringDBConnector {
    private Connection connection;
    private String driverClass;
    private String url;
    private String username;
    public SpringDBConnector(String driverClass, String url, String username)
    {
        System.out.println("Spring DBConnector");
        this.driverClass = driverClass;
        this.url=url;
        this.username=username;

    }
    public Connection getConnection() {
        try {
            //Class.forName("org.h2.Driver"); //  >JDK 1.6
            Class.forName(driverClass);
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Connecting to Database");
        }
        try {
            Connection conn = DriverManager.getConnection(url, username, "");

            return conn;
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return null;
    }
    public void close()
    {
        System.out.println("Spring DB closing");
        try
        {
            connection.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
