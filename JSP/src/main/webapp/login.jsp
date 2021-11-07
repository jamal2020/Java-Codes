<%@page import="java.sql.*" contentType="text/html" language="java"  %>
<html>
<body>
<h1><marquee>Welcome to JSP <%=request.getAttribute("user") %></marquee></h1>
<%
int i =1; //local variable
for(;i<6;i++)
{
out.println("<h"+i+"> Welcome </h"+i+">");
}

connect();


%>
<%! int a =100;  //declarations
public void connect()
{
System.out.println("Connecting to some resource");
}
%>
</body>
</html>