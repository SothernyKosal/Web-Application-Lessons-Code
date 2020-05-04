

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class NewServlet extends HttpServlet {

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String username = request.getParameter("user");
            
            Cookie ck = new Cookie("user",username);
            response.addCookie(ck);
            response.setContentType("text/html");
            
            PrintWriter pw = response.getWriter();
            pw.println("Welcome: "+username);
            pw.println("<a href='LogoutCookie'>Logout here</a><br>");
            pw.println("<a href='TestServlet'>show cookie id and value</a>");
            //output
            //Welcome: (value input)
            //and 2 links
        }
    }

  


