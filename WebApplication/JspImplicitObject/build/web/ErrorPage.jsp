<%-- 
    Document   : ErrorPage
    Created on : Feb 14, 2020, 11:42:45 AM
    Author     : Sotherny
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%=exception.getMessage() %>
        <h1>Error</h1>
    </body>
</html>
