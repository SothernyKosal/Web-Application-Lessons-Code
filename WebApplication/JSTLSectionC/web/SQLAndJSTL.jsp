<%-- 
    Document   : SQLAndJSTL
    Created on : Mar 12, 2020, 2:15:25 PM
    Author     : Sotherny
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>SQL</p>
    <sql:setDataSource 
        var="mydb"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://localhost:3306/kit"
        user="root"
        password=""/>
    <sql:transaction dataSource="${mydb}">
        <sql:update>
            insert into sectionc values(?,?);
            <sql:param value="54"/>
            <sql:param value="Oppa"/>
        </sql:update>
        <sql:update>
            insert into sectionc values(?,?);
            <sql:param value="54"/>
            <sql:param value="therny"/>
        </sql:update>
        <sql:update>
            insert into sectionc values(?,?);
            <sql:param value="54"/>
            <sql:param value="thaknia"/>
        </sql:update>
    </sql:transaction>
    <sql:query var="rs" dataSource="${mydb}">
        select * from sectionc;
    </sql:query>
        <table>
            <tr>
                <th>ID</th>
                <th>Name</th>
            </tr>
            <c:forEach var="row" items="${rs.rows}">
                <tr>
                    <td><c:out value="${row.id}"/></td>
                    <td>${row.name}</td>
                </tr>
            </c:forEach>
        </table>   
    </body>
</html>
