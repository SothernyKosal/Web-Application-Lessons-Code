<%-- 
    Document   : index
    Created on : Mar 27, 2020, 9:39:10 AM
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
        <form action="success.jsp">
            driver :<input type="text" name="driver" value="com.mysql.jdbc.Driver"><br>
            Url : <input type="text" name="url" value="jdbc:mysql://localhost:3306/test"><br>
            username : <input type="text" name="dbUserName" value="root"><br>
            password : <input type="text" name="dbPasswird" value=""><br>
            name : <input type="text" name="user"><br>
            age : <input type="text" name="age"><br>
            <input type="submit" name="register"><br>
        </form>
    </body>
</html>
