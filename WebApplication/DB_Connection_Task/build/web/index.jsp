<%-- 
    Document   : index
    Created on : Jan 10, 2020, 8:37:58 PM
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
        <form method="post" action="Sign_Up_Servlet">
            <pre style="font-family: 'Time New Romen'">
                Username : <input type="text" name="name"><br>
                Email:     <input type="text" name="email"><br>
                Password:  <input type="password" name="password"><br>
                <input type="submit" value="Sign Up" name='submit'>
                <input type='submit' value="Sign in" name="submit">
            </pre>
        </form>
    </body>
</html>
