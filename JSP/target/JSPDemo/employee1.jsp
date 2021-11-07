<%@page import="java.sql.*" %>
<html>
<body>
<%

    Connection conn = (Connection)application.getAttribute("connection");
     if(conn!=null)
     {

        String action = request.getParameter("action");
        if(action.equals("displayAll"))
        {
 %>
 <table><tr><th>Name</th><th>Role</th><th>Location</th></tr>

 <%
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from employee");
        while(rs.next())
        {
 %>
        <tr>
        <td><%=rs.getString("name")%></td>
        <td><%=rs.getString("role")%></td>
        <td><%=rs.getString("loc")%></td>
        </tr>

    <%
        }
       out.println("</table>");

        }
        }


%>


</body>
</html>


