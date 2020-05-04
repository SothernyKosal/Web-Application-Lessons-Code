
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class FilterLogin implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter is created");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
            throws IOException, ServletException {
        String user = request.getParameter("role");
        if (user.equals("admin") || user.equals("supervisor")){
           chain.doFilter(request, response);
        }
        else{
            RequestDispatcher rd = request.getRequestDispatcher("Error.jsp");     
            rd.include(request, response);
        }
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }   
}
