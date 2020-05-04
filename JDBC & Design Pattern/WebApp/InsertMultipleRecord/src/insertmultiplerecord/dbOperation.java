
               
package insertmultiplerecord;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class dbOperation {
    Connection c = null;
    Statement st = null;
    
    public void getStatement() throws ClassNotFoundException, SQLException{
        String url = "jdbc:mysql://localhost:3306/kit";
        String user = "root";
        String pass = "";
        
        Class.forName("com.mysql.jdbc.Driver");
        c = DriverManager.getConnection(url,user,pass);
        st = c.createStatement();
    }
    public void insertMultipleRecord(ArrayList<SectionC> dto){
        try{
            getStatement();
            for(SectionC ele: dto){
                st.execute("insert into SectionC values('"+ele.getId()+"','"+ele.getName()+"')");
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
