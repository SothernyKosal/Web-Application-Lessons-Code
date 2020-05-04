import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ServletConfig sc = getServletConfig();
        String color = sc.getInitParameter("color");
        System.out.println(color);
        //output is null
        //null because you can't not access the param of other servlet
        
        PrintWriter display = response.getWriter();
        String driverName = sc.getInitParameter("driverName");
        System.out.println(driverName);
        display.println(driverName);
        //output in console is : value that input in driver name
    }
}
