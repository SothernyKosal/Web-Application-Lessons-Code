import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("loginservlet");
        String name = request.getParameter("name");
        String pass = request.getParameter("password");
        
        boolean flag = false ;
        if (name.equals("sotherny") && pass.equals("1234")){
            
            HttpSession ses = request.getSession();
            ses.setAttribute("flag", true);
            RequestDispatcher rd = request.getRequestDispatcher("SuccessServlet");
            rd.include(request, response);
        }
        else{
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.include(request, response);
        }   
    }
}
