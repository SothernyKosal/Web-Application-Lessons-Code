<%-- 
    Document   : index
    Created on : Feb 7, 2020, 9:41:55 AM
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
        <form method="post" action="LoginServlet">
            <input type="text" name="name" placeholder="username">
            <input type="text" name="password" placeholder="password">
            <input type="submit" value="Login">
        </form>
    </body>
</html>
