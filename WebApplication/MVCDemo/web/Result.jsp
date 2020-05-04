<%-- 
    Document   : Result
    Created on : Feb 18, 2020, 3:06:07 PM
    Author     : Sotherny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="Student.Student" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    hello<br>
    Result:
        <%
            Object obj = request.getAttribute("student");
            if(obj != null)
            {
                Student s = (Student) obj;
                out.println(s.getId()+" : "+ s.getName());
            }
        %>
    </body>
</html>
