<%-- 
    Document   : index
    Created on : Jan 13, 2020, 3:13:55 PM
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
        <!--RequestDispatcher - forward() and include-->
        <form action="FirstServlet" method="post">
            <input type="text" name="name">
            <input type="submit" value="cookie">
        </form>
        <!--sendRedirect()-->
        <form action="send_redirect" method="post">
            <input type="text" name="search" value="java">
            <input type="submit" value="google search">
        </form>
    </body>
</html>
