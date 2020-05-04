<%-- 
    Document   : CoreTag_jstl
    Created on : Mar 25, 2020, 1:00:14 AM
    Author     : Sotherny
--%>

<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:out value="this is core tag of jstl"/><br>
        <c:set var="number" value="${10}" scope="session"/>
        <c:choose>
            <c:when test="${number%2 eq 0}">
                <c:out value="${number} is even number"/>
            </c:when>
            <c:when test="${number%2 ne 0}">
                <c:out value="${number} is odd number"/>
            </c:when>
            <c:otherwise>
                <c:out value="invalid number"/>
            </c:otherwise>
        </c:choose>
    </body>
</html>
