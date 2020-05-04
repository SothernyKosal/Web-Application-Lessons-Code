/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sotherny
 */
public class loginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String click = request.getParameter("btn");
        dboperation dbop = new dboperation();    
        System.out.println("click = "+click);
    if(click.equals("login")){
        try {
            boolean validation = dbop.validateLogin(username, password);
            System.out.println(validation);
            
            if(validation == true){
                System.out.println("successful login");
                response.sendRedirect("home.jsp");
            }
            else{
                request.setAttribute("error","Invalid username or password");
                System.out.println("fail login");
                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                rd.forward(request, response);
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    else{
            response.sendRedirect("register.jsp");
    }
  }
}
    
       
    


