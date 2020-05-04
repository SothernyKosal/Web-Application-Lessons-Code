import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sotherny
 */
public class validateServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String name = request.getParameter("user");
            String pass = request.getParameter("password");
            
            if(name.equals("sotherny")){
                Cookie nameCookie = new Cookie("user",name);
                response.addCookie(nameCookie);
                Cookie passCookie = new Cookie ("password", pass);
                response.addCookie(passCookie);
                
                PrintWriter out = response.getWriter();
                out.println("hi sotherny");
            }
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
            processRequest(request,response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
            processRequest(request,response);
    }
}
