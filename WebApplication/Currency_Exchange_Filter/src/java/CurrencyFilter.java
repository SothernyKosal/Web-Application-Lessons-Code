
import java.io.IOException;
import static java.lang.Integer.parseInt;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author Sotherny
 */
public class CurrencyFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("currency filter is created");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("in currency filter");
        String number = request.getParameter("amt");
        int amt = parseInt(number);
        
        
        if(amt < 0){
            RequestDispatcher rd = request.getRequestDispatcher("Error.jsp");
            rd.include(request, response);
        }
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("Destroy currency Filter");
    }
    
}
