<%-- 
    Document   : Next
    Created on : Feb 13, 2020, 1:42:20 PM
    Author     : Sotherny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage = "/ErrorPage.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%! String user ; %>
        <% 
            user = request.getParameter("user");
            out.println(user);
            
            String color = config.getInitParameter("Color");
            if(color.equals("blue")){
                String school = application.getInitParameter("School");
                out.println("you are " + school);
            }
            else{
                out.println("you are not kit");
            }
        %>
        
        <%--14.02.2020--%>
        <%
//            String user = request.getParameter("user");
//            Cookie ck = new Cookie("user",user);
//            
//            response.addCookie(ck);
//            out.println("<a href = 'viewDetails.jsp'>View Detail</a>");
            
//     session object
//            String user = request.getParameter("user");
//            session.setAttribute("user",user);
//            out.println("<a href = 'viewDetails.jsp'>View Detail</a>");

//     pagecontext object
//            String user = request.getParameter("user");
//            pageContext.setAttribute("user", user, PageContext.SESSION_SCOPE);
//            out.println("<a href = 'viewDetails.jsp'>View Detail</a>");


//     exeption
            
            int c = 10/0;
            
            
        %>
        
        
    </body>
</html>
