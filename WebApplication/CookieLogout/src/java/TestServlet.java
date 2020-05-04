/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TestServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
            Cookie[] cookies = request.getCookies();
            PrintWriter out = response.getWriter();
            for(Cookie ck: cookies){
                out.println(ck.getName()+" : "+ ck.getValue());
                out.println("<br>");
            }
            out.println("<a href='LogoutCookie'>Logout here</a><br>");
            //output before logout are :
            //sessionIdName : its value
            //user: (Value input) 
    }
}
