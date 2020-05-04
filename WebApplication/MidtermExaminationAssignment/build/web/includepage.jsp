<%-- 
    Document   : includepage
    Created on : Mar 25, 2020, 11:55:35 PM
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
        <%
            String username = request.getParameter("username");
            out.print("welcome to includepage, "+username);
        %>
    </body>
</html>
