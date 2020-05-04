<%-- 
    Document   : index
    Created on : Feb 5, 2020, 9:46:06 AM
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
        <form method="post" action="SuccessServlet">
        name : <input type="text" name="user"><br> 
        <label>Role</label>
        <select name="role">
            <option value="admin">admin</option>
            <option value="supervisor">suprevisor</option>
            <option value="teacher">teacher</option>
        </select>
        <input type="submit" value="submit">
        </form>
    </body>
</html>
