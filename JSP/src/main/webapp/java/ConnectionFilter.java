import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//@WebFilter(urlPatterns = "/employee1.jsp")
public class ConnectionFilter implements Filter {
    Connection conn;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // pre
        try {
            System.out.println(" try to loaded");
            Class.forName("org.h2.Driver");
            System.out.println("loaded");
             conn = DriverManager.getConnection("jdbc:h2:c:/users/public/db1", "sa", "");
             servletRequest.getServletContext().setAttribute("connection",conn);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

            filterChain.doFilter(servletRequest,servletResponse); // processing
            //post
            try
            {
                conn.close();
            }catch(SQLException e)
            {
                e.printStackTrace();
            }

    }

    @Override
    public void destroy() {

    }
}
