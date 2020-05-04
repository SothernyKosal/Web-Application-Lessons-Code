<%-- 
    Document   : index
    Created on : Jan 16, 2020, 1:42:23 PM
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
        <form method="post" action="NewServlet">
            name: <input type="text" name="user">
            <input type="submit" value="login"> 
        </form>
        <form method="get" action="TestServlet">
            <input type="submit" value="Cookie before and after login and logout">
        </form>
    </body>
</html>
