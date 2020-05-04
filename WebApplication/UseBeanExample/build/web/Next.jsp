<%-- 
    Document   : Next
    Created on : Mar 6, 2020, 9:58:03 AM
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
        <jsp:useBean id="st" class="com.Student" scope="session"></jsp:useBean>
        <jsp:setProperty name="st" property="name" value="${param.name}"/>
        <jsp:setProperty name="st" property="age" value="${param.age}"/> 
        <jsp:forward page="success.jsp"></jsp:forward>
    </body>
</html>
