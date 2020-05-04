/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Sotherny
 */
public class UrlRewritingServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String username = request.getParameter("username");
        
        //        HttpSession
        HttpSession hs = request.getSession();
        hs.setAttribute("username", username);
        
        //        url rewriting
        PrintWriter pw = response.getWriter();
        pw.println("<a href='HttpSessionServlet?user="+username+"'>Get Session Atrribute</a>");
    }
}
