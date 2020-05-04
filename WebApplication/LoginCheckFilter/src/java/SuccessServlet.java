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
public class SuccessServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("html/text");
          PrintWriter out = response.getWriter();
          out.println("<a href='HomeServlet'>Home</a>");
          out.println("<a href='AboutServlet'>About</a>");
          out.println("<a href='ContactServlet'>Contact</a>");
          out.println("<a href='ProfileServlet'>Profile</a>");
    }
}
