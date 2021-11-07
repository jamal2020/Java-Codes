<%@page import="java.sql.*" %>
<html>
<body>
<%
  try {
            System.out.println(" try to loaded");
            Class.forName("org.h2.Driver");
            System.out.println("loaded");
        } catch (Exception ex) {
            ex.printStackTrace();
            }
    try (Connection conn = DriverManager.getConnection("jdbc:h2:c:/users/public/db1", "sa", ""))
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
        else
        {
        %>
        <jsp:useBean id="e" class="model.Employee" scope="session" />
        <jsp:setProperty name="e" property="ename" value="ename" />
        <jsp:setProperty name="e" property="loc" value="loc" />
        <jsp:setProperty name="e" property="role" value="role" />






        <%


        out.println(e.getEname());
        out.println("reading from bean");
        }
        }catch(SQLException e)
        {
        e.printStackTrace();
        }

%>
<jsp:include page="EmpForm.jsp"/>

<!-- <jsp:forward page="EmpForm.jsp" /> -->

</body>
</html>


