<%-- 
    Document   : index
    Created on : Jan 15, 2020, 11:03:05 AM
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
        <form action="validateServlet" method="post">
            <input type="text" name="user">
            <input type="password" name="password">
            <input type="submit" name="login">  
        </form>
    </body>
</html>
