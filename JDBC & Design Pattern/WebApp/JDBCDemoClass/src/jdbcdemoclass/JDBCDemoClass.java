package jdbcdemoclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



//20.11.2019

public class JDBCDemoClass {

    public static void main(String[] args) {
       try{
           String dburl = "jdbc:mysql://localhost:3306/kit";
           String user = "root";
           String password = "";
           
           Class.forName("com.mysql.jdbc.Driver");
           System.out.println("loading driver succeeded");
           
           Connection c = DriverManager.getConnection(dburl,user, password);
           System.out.println("Connected succesfully");
           
           Statement st = c.createStatement();
           System.out.println("statement created");
//           st.execute("insert into b6c values('2','Sothaknia','16')");
//           st.executeUpdate("update b6c set age = '18' where sname = 'Sotherny';");
       }
       catch(Exception e){
           System.out.println(e);
       }
    }
    
}
