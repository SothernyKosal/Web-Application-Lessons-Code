<%-- 
    Document   : index
    Created on : Jan 3, 2020, 10:56:14 AM
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
        <form method="post" action="ValidationServlet">
            <input type="text" name="user">
            <input type="password" name="pass">
            <input type="submit" value="click me">
        </form>
    </body>
</html>
