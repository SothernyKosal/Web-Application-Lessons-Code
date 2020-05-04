
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class dboperation {
    Connection con = null;
    
    public Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/report";
            String user = "root";
            String pass = "";
            
            if(con == null){
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            }
            
        } 
        catch (ClassNotFoundException | SQLException ex) 
        {
            System.out.println(ex);
        }
        return con;
    }
    public boolean validateLogin(String username, String password) throws ClassNotFoundException,SQLException{
        
            getConnection();
            Statement s = con.createStatement();
            String sql = String.format("select username,password from register where username = '%s' and password = '%s'",username,password);
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){
                return true;
            }    
        return false;
    }
}
