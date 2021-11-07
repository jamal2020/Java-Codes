import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/welcome")
public class Welcome extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
    {
        PrintWriter out = response.getWriter();
        String user =(String) request.getAttribute("user");
        //response.setContentType("text/html");

        out.println("<h1><marquee>Welcome to the site "+user+"</marquee></h1>");
    }

}
