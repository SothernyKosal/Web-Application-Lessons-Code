package statementwithbatchupdate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


//26.11.2019

public class StatementWithBatchUpdate {

    public static void main(String[] args) {
      try{
          Class.forName("com.mysql.jdbc.Driver");
          Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/kit", "root", "");
          Statement st = c.createStatement();
      
          st.addBatch("insert into b6c values('1239','Nhim Sovichea','17')");
          st.addBatch("insert into b6c values('1238','Thy Makra','17')");
          st.addBatch("update b6c set sname = 'Sa' where id = '006'");
//      st.addBatch("create table mytable (id varchar(50), name varchar(200))");
//      st.addBatch("delete from b6c where id = '1236'");
//      st.addBatch("delete from b6c where id = '1237'");
          st.executeBatch();
     
          st.close();
          c.close();
      
//      ps.setString(1, id);
//      ps.setString(2, name);
//      ps.setString(3, age);
//      ps.execute();
        }
        catch(ClassNotFoundException | SQLException e){
          System.out.println(e);
        
        }
    

    }
}