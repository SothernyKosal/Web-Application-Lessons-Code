<%-- 
    Document   : success
    Created on : Mar 6, 2020, 10:06:22 AM
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
        ${sessionScope.st.name}
        ${sessionScope.st.age}
        <jsp:useBean id="st" class="com.Student" scope="session"></jsp:useBean>
        <jsp:getProperty name="st" property="name"/>
        <jsp:getProperty name="st" property="age"/>
    </body>
</html>
