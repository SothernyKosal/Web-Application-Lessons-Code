
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sotherny
 */
public class FilterOne implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter one created");
    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("inside doFilter of filter one");//b4 go to servlet
        chain.doFilter(request, response);//go to servlet
        System.out.println("after filter chaining in filter one");
        //it will work after the it come back from servlet
    }
    @Override
    public void destroy() {
        System.out.println("filter destroy");
    }
}
