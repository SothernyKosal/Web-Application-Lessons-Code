<%-- 
    Document   : index
    Created on : Mar 11, 2020, 10:48:28 AM
    Author     : Sotherny
--%>

<%@page import="java.util.ArrayList"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
    </head>
    <body>
        <h6>JSTL</h6>
        
        <!--set and remove-->
        <c:set var="abc" value="${500*5}" scope="session"/>
        before delete: <c:out value="${abc}"/>
        <br>
        <c:remove var="abc" scope="session"/>
        After delete: <c:out value="${abc}"/>
        
        
        <!--otherwise, choose, when-->
        <c:set var="mark" value="${(55+76+80)/3}" scope="session"/>
        average mark = <c:out value="${mark}"/>
        <br>
       
        <c:choose>
            <c:when test="${mark ge 90 and mark le 100}">
                <c:out value="distinction" />
            </c:when>
             <c:when test="${mark>70}">
                <c:out value="first class"/>
            </c:when>
            <c:when test="${mark>50}">
                <c:out value="second class"/>
            </c:when>
            <c:otherwise>
                <c:out value="fail"/>
            </c:otherwise>
        </c:choose>
        
        <!--import-->
        <c:import url="header.jsp"/>
        <!--import without creating variable, it will take only text in that file not the whole code-->
            <c:out value="this is between header file and footer file"/><br>
            <c:out value="header file value: ${header}"/>
        <c:import url="footer.jsp"/>
        
        <br>
        <c:import url="header.jsp" var="head" />
        <!--if you import with creating an variable, it will import the whole code-->
        <c:import url="footer.jsp" var="foot" />
        <c:out value="hello ${head}"/><br>
        <c:out value="hello ${foot}"/>
        
        
        <!--url, param and redirect-->
        <c:url var="url1" value="success.jsp">
            <c:param name="color" value="green"/>
        </c:url>
        <c:url var="url2" value="failure.jsp">
            <c:param name="color" value="red"/>
        </c:url>
        <%--<c:redirect url="${url1}"/>--%>
        <br>
        
        
        <!--12.03.2020-->
        <!--forEach-->
        <c:forEach var="i" begin="0" end="10" step="2">
            <c:out value="${i}"/>
        </c:forEach>
        <!--output in index.jsp : 2 4 6 8-->
        <%
            ArrayList<Integer> al = new ArrayList<Integer>();
            al.add(100);
            al.add(200);
            al.add(300);
            al.add(400);
            session.setAttribute("al",al);
        %>
        <c:redirect url="test.jsp"/>
        
    </body>
</html>