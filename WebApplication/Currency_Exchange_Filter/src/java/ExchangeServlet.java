/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sotherny
 */
public class ExchangeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        PrintWriter display = response.getWriter();
        String type = request.getParameter("currency_type");
        String number = request.getParameter("amt");
        int amt = parseInt(number);
        double res;
        
        double roupee = 71.21, reil = 4070.0 , yen = 109.74;
        
        
        if( type.equals("INR")){
            res = amt*roupee;
            display.println(amt + "$ = R" + res);
        }
        if( type.equals("KHR")){
            res = amt*reil;
            display.println(amt + "$ = r" + res);
        }
        if( type.equals("YEN")){
            res = amt*yen;
            display.println(amt + "$ = Y" + res);
        }
    }

}
