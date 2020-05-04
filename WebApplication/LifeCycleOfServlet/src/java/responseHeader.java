import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class responseHeader extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            handleRequest(request, response);
        }
    public void handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //set Refresh - AutoLoad Time as 15 seconds. 'Refresh is the name of header'
        response.setIntHeader("Refresh", 15 );
        
        //Response Content Type
        response.setContentType("text/html");
        
        //Get current time
        Calendar cal = new GregorianCalendar();
        String am_pm;
        int hour = cal.get(Calendar.HOUR);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        if(cal.get(Calendar.AM_PM) == 0)
            am_pm = "A.M.";
        else
            am_pm = "P.M.";
        String time = hour+":"+minute+":"+second+am_pm;
        PrintWriter out = response.getWriter();
        String title = "Auto Refresh Header Setting";
        out.println("<html>\n"
                + "<head><title>"+title+"</title></head>\n"
                + "<body>\n"
                        + "<h1 align= 'center'>title</h1>\n"
                        + "<p>current time is = "+time+"</p>\n"
                + "</body>"
                + "</html>");   
    }
}
