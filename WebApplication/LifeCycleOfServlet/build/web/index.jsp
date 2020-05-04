<%-- 
    Document   : index
    Created on : Jan 8, 2020, 10:04:11 AM
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
        <!--for requestHeader-->
        <form action="Batch6Servlet" method="get">
            username : <input type="text" name="user">
            <input type="submit" value="click here">
        </form>
        <p>when u click the submit button it will create the gift box and send to server
            server will check weather username(that u input) is an authenticated user or not 
            then will create a new box and send respond back to username(that u input)</p>
        <p>----------------------</p><br>
        
        <!--for responseHeader-->
        <form action="responseHeader" method="get">
            <input type="submit" value="show current time">
        </form>
    </body>
</html>
