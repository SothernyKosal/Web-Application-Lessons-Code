<%-- 
    Document   : index
    Created on : Jan 10, 2020, 9:48:02 AM
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
        <!--ServletConfig-->
        <form method="post" action="NewServlet">
            username : <input type="text" name="user">
            <input type="submit" value="click here">
        </form>
        <br>
        <form action="SecondServlet" method="post">
            driver name: <input type="text" value="com.mysql.jdbc.Driver"><br>
            user : <input type="text" value="sotherny"><br>
            password : <input type="password" value="12345"><br>
            url : <input type="text" value="jdbc:mysql://localhost:3306/"><br>
            <input type="submit" value="2nd servlet"><br>
        </form>
        
        <!--ServletContext-->
        <form action="thirdServletContextParam" method="get">
            <input type="submit" value="thirdServletContextParam">
        </form>
        <form action="ForthServletContextParam" method="get">
            <input type="submit" value="ForthServletContextParam">
        </form>
    </body>
</html>
