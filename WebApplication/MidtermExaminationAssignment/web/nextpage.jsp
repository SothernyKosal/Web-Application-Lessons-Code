<%-- 
    Document   : nextpage
    Created on : Mar 25, 2020, 11:55:59 PM
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
        <jsp:include page="includepage.jsp">
            <jsp:param name="username" value="${param.username}"/>
        </jsp:include>
        
        <jsp:useBean class="com.student" id="st" scope="session"/>
        <jsp:setProperty name="st" property="username" value="${params.username}"/>
        <br>
        <%="You are in nextpage.jsp" %>
        
    </body>
</html>
