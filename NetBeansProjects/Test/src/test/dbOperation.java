
package test;


import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class dbOperation {
    Connection c = null;
    Statement st = null;
    ResultSet rs = null;
    public void getStatement()throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/kit";
        String user = "root";
        String password = "";
        Class.forName("com.mysql.jdbc.Driver");
        c = DriverManager.getConnection(url, user, password);
        st = c.createStatement();
        
    }
    public void readData(){
        String name,id,age;
        try{
            getStatement();
            String select = "select * from b6c";
            rs = st.executeQuery(select);
            while(rs.next()){
                b6c dto = new b6c();
                id = rs.getString(1);
                name = rs.getString(2);
                age = rs.getString(3);
                System.out.println("id: '"+id+"' name: '"+name+"' age: '"+age+"'");
            }
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.print(e);
        }
        
        
    }
}
