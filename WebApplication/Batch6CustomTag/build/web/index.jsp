<%-- 
    Document   : index
    Created on : Mar 26, 2020, 9:59:16 AM
    Author     : Sotherny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/tlds/batch6_customtag_libraries.tld" prefix="batch6" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <batch6:test1 num="${param.num}" userName="Sotherny"></batch6:test1>
    </body>
</html>

