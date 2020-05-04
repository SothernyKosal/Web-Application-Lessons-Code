

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sotherny
 */
public class Servlet1 extends HttpServlet {
    Connection con = null;
    PreparedStatement ps = null;
    
    
   
    
//    String url = "jdbc:mysql://localhost:3306/webapplication";
//    String loadDriver = "com.mysql.jdbc.Driver";
//    String user = "root";
    
    public void init(){
        ServletConfig sc = getServletConfig();
        String loadDriver = sc.getInitParameter("driverName");
        String user = sc.getInitParameter("username");
        String pass = sc.getInitParameter("password");
        String url = sc.getInitParameter("db_url");
        
        try {
            Class.forName(loadDriver);
            con = DriverManager.getConnection(url, user, pass);
            
        } catch (ClassNotFoundException |SQLException ex) {
            System.out.println(ex);
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("user");
        String email = request.getParameter("email");
        PrintWriter show = response.getWriter();
        
        show.println(username);
        show.println(email);
        
        try {
            ps = con.prepareStatement("insert into batch6c values(?,?)");
            ps.setString(1, username);
            ps.setString(2, email);
            ps.execute();
            
                     
            
            
            ResultSet result = ps.executeQuery("select * from batch6c where id="+username +" and email="+email);
            
            
            
            
            
        } catch (SQLException ex) {
        
            System.out.println(ex);}
    }
    public void destroy(){
        try {
            con.close();
        } catch (SQLException ex){
            System.out.println(ex);}
    }

  

}
