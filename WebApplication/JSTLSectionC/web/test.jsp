<%-- 
    Document   : test
    Created on : Mar 12, 2020, 1:43:31 PM
    Author     : Sotherny
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!--forEach, forTokens, catch and if-->
        <c:forEach items="${sessionScope.al}" var="i">
            <c:out value="${i}"/>
        </c:forEach>
        <br>
        
        <c:forTokens var="i" delims="," items="Te-vy,Sok-noy,Chhun-neng">
            <c:forTokens var="j" delims="-" items="${i}">
                <c:out value="${j}"/>
            </c:forTokens>
            <br>
            <c:out value="*******"/>
            <br>
        </c:forTokens>
        
            <c:catch var="ex">
                <%
                    int res = 10/0;
                %>
            </c:catch>
            <c:out value="exception : ${ex}"/>
            <br>
            
            <!--if-->
            <c:if test="${e!=null}">
                <c:out value="there is an exception"/>
            </c:if>
            
       
    </body>
</html>
