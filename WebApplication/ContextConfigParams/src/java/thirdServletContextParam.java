import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class thirdServletContextParam extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //get an initialization parameter from web.xml
        ServletContext context = getServletContext();
        String value = context.getInitParameter("free access");
        
        PrintWriter out = response.getWriter();
        out.println("free access: "+value);
        out.println("from thirdServletContextParam");
        //output -> free access: context param is accessible to all servlets
        //          from thirdServletContextParam
    }
}
