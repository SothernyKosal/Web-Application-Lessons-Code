import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String user = request.getParameter("name");
        
//       response.setContentType("text/html");//the output will not have any html tag
        PrintWriter pw = response.getWriter();
        pw.println("hi from servlet 1");
        
        if(user.trim().equals("sotherny")){
            // the output include htlm tag cuz we don't set the content type to html
            RequestDispatcher rd = request.getRequestDispatcher("newjsp.jsp");
            rd.include(request, response);
//            rd.forward(request, response);
            pw.println("after the newjsp.jsp output, still in FirstServlet");
        }else{
            //the output will be normal text cuz we've already set content type
            //and it will not any output of servlet the output is only from fail.jsp
            response.setContentType("text/html");
            RequestDispatcher rd = request.getRequestDispatcher("fail.jsp");
            rd.forward(request, response);
        }  
    }
}
