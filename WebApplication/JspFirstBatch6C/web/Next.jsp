<%-- 
    Document   : Next
    Created on : Feb 12, 2020, 11:23:56 AM
    Author     : Sotherny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            String user = request.getParameter("user");
            out.println(user);
        %>
        <%="this is Next.jsp page "+user%>
        <%-- hello world this is a sample comment--%>
        
    </body>
</html>
