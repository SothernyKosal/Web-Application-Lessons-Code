
package assignmentunit1no7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class AssignmentUnit1No7 {
    public static Connection c = null;
    public static Statement st = null;
    public static ResultSet rs = null;
    
    public static String id,name, age, result;
    
    public static void main(String[] args) {
    
        readSingleRecord();
        System.out.println();
        readAllRecord();
        System.out.println();
        readSpecificRecord();
        
    }
    public static void getStatement() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mySQL://localhost:3306/kit";
        String user = "root";
        String password = "";
        c = DriverManager.getConnection(url, user, password);
        st = c.createStatement();
    }
    public static void readSingleRecord(){
        try{
            getStatement();
            String read = "select * from b6c limit 1";
            rs = st.executeQuery(read);
            while(rs.next()){
                id = rs.getString(1);
                name = rs.getString(2);
                age = rs.getString(3);
                result ="id : " +  id + ", name : " + name + ", age : " + age;
            }
            
            System.out.println("resutl of read single record is: \n" + result);
            
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    }
    
    public static void readAllRecord(){
        try{
            getStatement();
            String read = "select * from b6c";
            rs = st.executeQuery(read);
            
            System.out.println("the result of read all record: ");
            while(rs.next()){
                id = rs.getString(1);
                name = rs.getString(2);
                age = rs.getString(3);
                result ="id : " +  id + ", name : " + name + ", age : " + age;
                System.out.println(result);
            }
        }
        catch(ClassNotFoundException | SQLException ex){
            System.out.println(ex);
        }
    }
    
    public static void readSpecificRecord(){
        try{
            getStatement();
            String read = "select * from b6c where id = 3";
            rs = st.executeQuery(read);
            
            System.out.println("the result of read a specific record: ");
            while(rs.next()){
                id = rs.getString(1);
                name = rs.getString(2);
                age = rs.getString(3);
                result ="id : " +  id + ", name : " + name + ", age : " + age;
                System.out.println(result);
            }
        }
        catch(ClassNotFoundException | SQLException ex){
            System.out.println(ex);
        }
    }
    
}
