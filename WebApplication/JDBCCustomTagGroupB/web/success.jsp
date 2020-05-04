<%-- 
    Document   : success
    Created on : Mar 27, 2020, 10:20:33 AM
    Author     : Sotherny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/tlds/my_jdbc_tag.tld" prefix="t" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%--<t:registerData driver="${param.driver}" url="${param.url}" dbUserName="${param.dbUserName}" dbPassword="${param.dbPassword}" user="${param.user}" age="${param.age}"></t:registerData>--%>
          <t:registerData driver="${param.driver}" url="${param.url}" dbUserName="${param.dbUserName}" dbPassword="${param.dbPassword}" user="${param.user}" age="${param.age}"></t:registerData>
    </body>
</html>
