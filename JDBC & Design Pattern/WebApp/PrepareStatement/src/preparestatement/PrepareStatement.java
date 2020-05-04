package preparestatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


//  26.11.2019
public class PrepareStatement {
    public static void main(String[] args) throws SQLException {
//      String id = "";
//      String name = "Sreysa";
//      String age = "18";
      String id;
      String name ;
      String age;
      int number,i;
      Scanner s = new Scanner(System.in);
      try{
      Class.forName("com.mysql.jdbc.Driver");
      Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/kit", "root", "");
      PreparedStatement ps = c.prepareStatement("insert into b6c values(?,?,?)");
      
      //addBatch()
      System.out.println("Enter the number of record u what to insert:");
      number = s.nextInt();
      
      for(i=0; i<number; i++){
          System.out.print("Enter id: ");
          id = s.next();
          System.out.print("Enter name: ");
          name = s.next();
          System.out.print("Enter age: ");
          age = s.next();
          ps.setString(1, id);
          ps.setString(2, name);
          ps.setString(3, age);
          ps.addBatch();
      }
      ps.executeBatch();
      
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
