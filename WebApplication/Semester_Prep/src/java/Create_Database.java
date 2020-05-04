import java.sql.*;


public class Create_Database {
    
    static String jdbc_driver = "com.mysql.jdbc.Driver";
//    static String db_url = "jdbc:mysql://localhost:3306";
    static String db_url = "jdbc:mysql://localhost:3306/semester_prep";
    static String user = "root";
    static String password = "";
    
    public static void main(String[] args){
        Connection con = null;
        Statement st = null;
        try{
            Class.forName(jdbc_driver);
            con = DriverManager.getConnection(db_url,user,password);
            st = con.createStatement();
            
            //Create database
//            String sql_create_db = "create database semester_prep;";
//            st.executeUpdate(sql_create_db);
//            System.out.println("database created successfully");


            //create table
//            String sql_create_tbl = "create table student("
//                    + "id varchar(10),"
//                    + "name varchar(100))";
//            st.executeUpdate(sql_create_tbl);
//            System.out.println("database created successfully");
            
        
        }catch(ClassNotFoundException |SQLException e){
            System.out.println(e);
        }
    } 
}
