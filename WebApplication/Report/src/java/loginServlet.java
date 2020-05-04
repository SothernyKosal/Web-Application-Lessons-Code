/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

    Statement st = null;
    ResultSet rs = null;
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter show = response.getWriter();
        DBOperation dbop = new DBOperation();
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        show.println("je");
        try {
            Connection con = dbop.getCon();
            st = con.createStatement();
            String selectData = String.format("SELECT * FROM register where id = '%s' ",user);
            rs = st.executeQuery(selectData);
            System.out.println("select username from register where username="+user);
            show.print(rs.next());
            System.out.println(rs);
            System.out.println(rs.next());
            if (rs.next()){
                RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
                rd.forward(request, response);
            }
            else{
                show.print("wrong......");
                System.out.println("Wrong password.....");
                request.setAttribute("error", "Invalid username and password....");
//                 RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
//                rd.forward(request, response);

                response.sendRedirect("index.jsp");
                    }
            
           
             
        } 
        catch (ClassNotFoundException ex) {
        show.print("djfskajdf;dfj");
        } 
        catch (SQLException ex) {show.print("jkjdfsajfdsfdf");}
    }

}
