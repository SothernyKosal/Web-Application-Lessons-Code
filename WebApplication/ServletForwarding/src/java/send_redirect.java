import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class send_redirect extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            PrintWriter out = response.getWriter();
            String search = request.getParameter("search");
            out.print("I'm in sendRedirect");
            // will not display anywhere cuz the output will redirect to google search
            response.sendRedirect("https://www.google.co.in/#q="+search);
    }
}
