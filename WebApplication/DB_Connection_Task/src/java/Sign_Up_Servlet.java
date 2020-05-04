

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
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
public class Sign_Up_Servlet extends HttpServlet {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String tableName = "sectionc";
    public void init(){
   
        String driver = getInitParameter("driver");
        String url = getInitParameter("url");
        String user = getInitParameter("user");
        String password = getInitParameter("password");
        
        try {
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url, user, password);
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
        
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter display = response.getWriter();
        
        
        String insert = "insert into "+tableName+" values(?,?,?) ";
        String select = "select * from "+tableName+"";
        String name, Email, pass;
        
        String username = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        String submit = request.getParameter("submit");
        
        if(submit.equals("Sign Up")){
            try {
                ps = (PreparedStatement) con.prepareStatement(insert);
                ps.setString(3, username);
                ps.setString(1, email);
                ps.setString(2, password);
                ps.execute();
                display.println("sign up successful ^_^");

            } catch (SQLException ex) {
              System.out.println(ex);
            }
        }
        
        if(submit.equals("Sign in")){
            try {
                ps = (PreparedStatement) con.prepareStatement(select);
                rs = ps.executeQuery();
                while(rs.next()){
                    name = rs.getString(3);
                    Email = rs.getString(1);
                    pass = rs.getString(2);
                    if(name.equals(username) && Email.equals(email) && password.equals(pass)){
                        display.println("sign in successful");
                        break;
                    }else{
                        continue;
                    }
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
           
    }
    
    public void destroy(){
        try {
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

  

}
