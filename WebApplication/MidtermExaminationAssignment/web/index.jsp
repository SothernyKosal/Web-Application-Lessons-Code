<%-- 
    Document   : index
    Created on : Mar 25, 2020, 12:59:41 AM
    Author     : Sotherny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login Page</title>
    </head>
    <body>
        <h3 style="color: blue">Login Page</h3>
        <!--<form method="post" action="validationServlet">-->
        <!--<form method="post" action="nextpage.jsp">-->
        
        <form method="post" action="UrlRewritingServlet">
            Username : <input type="text" name="username"><br>
            Password : <input type="text" name="password"><br>
            <input type="submit" name="login">  
        </form>
    </body>
</html>
