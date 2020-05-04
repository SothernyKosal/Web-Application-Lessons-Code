<%-- 
    Document   : Next
    Created on : Mar 4, 2020, 9:49:50 AM
    Author     : Sotherny
--%>

<%@page import="com.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!--param include forward-->
        <!--if we use "forward", it will not display '--hello...' cause it forward to another file it not include in this so it can't go back --> 
        <%--<jsp:include page="Success.jsp">--%>
            <%--<jsp:param name="user" value="${param.user}"/>--%>
        <%--</jsp:include>--%>
        <%--<%= " --hello form Next.jsp--"%>--%>
        
        
        <!--bean-->
        <%
//            Student stud = new SStudent();
//            stud.setName(request.getParameter("name");
//            request.getAttribute("stud");
        %>
        <jsp:useBean class="com.Student" id="stud" scope="session">
        <!--this above line of code is equal the code in scriplet above-->
        <!--scope is where u want to store the property-->
        </jsp:useBean>
        <jsp:setProperty name="stud" property="name" value="${params.name}"/>
        <%= "hello this is from Next.jsp" %>
        <jsp:getProperty name="stud" property="name"/>
    </body>
</html>
