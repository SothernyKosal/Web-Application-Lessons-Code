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

/**
 *
 * @author Sotherny
 */
public class NextServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String user = request.getParameter("user");
            PrintWriter out = response.getWriter();
            System.out.println("hello from 1st servlet");
            out.println("welcome " + user);
            response.setContentType("text/html");
            request.getSession();
            out.println("<a href='SecondServlet'>Second Servlet</a>");
    }
}
