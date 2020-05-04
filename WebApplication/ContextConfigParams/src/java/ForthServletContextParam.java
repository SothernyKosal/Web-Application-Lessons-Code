import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForthServletContextParam extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //get an initialization parameter from web.xml
        ServletContext contexts = getServletContext();
        Enumeration<String> allContextNames = contexts.getInitParameterNames();
        String value, name = "";
        
        PrintWriter out = response.getWriter();
       
        while(allContextNames.hasMoreElements()){
            name = allContextNames.nextElement();
            value = contexts.getInitParameter(name);
            out.println("param-name: "+name+", param-value:"+value);       
        }
        out.println("from ForthServletContextParam"); 
        
        //output -> param-name: free access, param-value: context param is accessible to all servlets
        //          param-name: com.sun.faces.forceLoadConfiguration, param-value:true
        //          param-name: com.sun.faces.validateXml, param-value:true
        //          param-name: contextParam, param-name: allow multiple access
        //          from thirdServletContextParam
        
    }
}
