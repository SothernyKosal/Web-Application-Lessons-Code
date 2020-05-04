<%-- 
    Document   : index
    Created on : Feb 14, 2020, 12:15:50 PM
    Author     : Sotherny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage = "/NullHandle.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="no_file_tobe_found.jsp">no found</a>
        
        <h1>null code below</h1>
        <%
            String user = request.getParameter("user");
            out.println("hello " + user);
        %>
    </body>
</html>
