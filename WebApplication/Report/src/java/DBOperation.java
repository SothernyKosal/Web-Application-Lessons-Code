
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class DBOperation {
//    Connection con = null;
    public Connection getCon() throws ClassNotFoundException, SQLException{
        System.out.println("Loading to connection");
        String url = "jdbc:mysql://localhost:3306/report";
        String username = "root";
        String password = "";
  
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection is ok....");
        
        return con;
    }
}
