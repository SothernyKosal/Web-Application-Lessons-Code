<%-- 
    Document   : index
    Created on : Feb 19, 2020, 7:13:44 PM
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
        
        
        <form action = "loginServlet" method="post">
            <input name="username" type="text">
            <input name="password" type="text">
            <input name="submit" type="submit" value="Log In">
        </form>
        
        
        <%
            String showError= null;
            if(showError != null){
             showError =(String) request.getAttribute("error");
           out.print(showError);
           
            }


        %>
    </body>
</html>
