<%-- 
    Document   : index
    Created on : Feb 18, 2020, 11:02:19 AM
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
        <form action="ValidateServlet" method="post">
            <input type="text" name="id" placeholder="id">
            <input type="text" name="name" placeholder="username">
            <input type="submit" value="submit">
        </form>
    </body>
</html>
