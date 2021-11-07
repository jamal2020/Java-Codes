import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(urlPatterns = {"/welcome","/thanks","/register"})
public class FilterDemo implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter initialized");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        // Pre processing
        PrintWriter out = servletResponse.getWriter();
        servletResponse.setContentType("text/html");
        String user = servletRequest.getParameter("user");
        String pass = servletRequest.getParameter("pass");
        servletRequest.setAttribute("user",user);
        servletRequest.setAttribute("pass",pass);
        if(!(user.equals("Tom") && pass.equals("Cat")))
        {
            out.println("<h2>Authentication Failed</h2>");
        }
        else {
            filterChain.doFilter(servletRequest, servletResponse);
        }

        out.println("Filter Demo Completed");
    }

    @Override
    public void destroy() {
    System.out.println("Filter Destroyed");
    }
}
