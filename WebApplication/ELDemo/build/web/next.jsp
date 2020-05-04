<%-- 
    Document   : next
    Created on : Mar 3, 2020, 3:19:38 PM
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
        <% 
            String user = (String) session.getAttribute("user");
            out.println("form sciptlet: "+user);
        %>
        <br><%= "from expression tag: "+(String) session.getAttribute("user") %>
        <br>${sessionScope.user}
    </body>
</html>
