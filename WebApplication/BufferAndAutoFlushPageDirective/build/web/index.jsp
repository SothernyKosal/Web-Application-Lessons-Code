<%-- 
    Document   : index
    Created on : Mar 3, 2020, 2:44:33 PM
    Author     : Sotherny
--%>

<!--Page directive: buffer,autoFlush
include
EL: Expression Language-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@page buffer="3kb" autoFlush="false"  %>--%>
<%@page isELIgnored="true" %>
<!--it ignore expression language-->

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
        <%@include file="header.jsp" %>
        </div>
        <h1>Hello World!</h1>
        <% 
//            for(int i = 0; i<5000; i++){
//                out.print("hello");
//                out.flush();//handle the flush mantually
//            }
        %>
        
         ${"expression language"}
         ${10*5}
        
        
        <div>
        <%@include file="footer.jsp" %>
        </div>
    </body>
</html>
