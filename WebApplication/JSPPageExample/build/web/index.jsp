<%-- 
    Document   : index
    Created on : Mar 3, 2020, 10:54:07 AM
    Author     : Sotherny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.Student, java.util.Date" session="true" isThreadSafe="false" info="this is index"%>

<%--<%@page language="java" extends="com.Student" %>--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            session.setAttribute("user","sotherny");
//            Thread.sleep(5000);
            out.println("hello world...");
//            Thread.sleep(5000);
            out.println(getServletInfo());
            Student st = new Student();
            Date date = new Date();
        %>
        <%= st.getMsg() %>
        <%= date %>
        <%= " (=^_^=) "%>
        <%--<%= getMsg() %>--%>
    </body>
</html>
