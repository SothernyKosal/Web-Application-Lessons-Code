
import com.mysql.jdbc.Driver;
import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CRUD_using_JDBC {
    static String url = "jdbc:mysql://localhost:3306/semester_prep";
    static String user = "root";
    static String password = "";
    static String Driver = "com.mysql.jdbc.Driver";
    static Connection con = null;
    static Statement st = null;
    static ResultSet rs = null;
    
    public static Connection getCon(){
        try{
            Class.forName(Driver);
            con = DriverManager.getConnection(url,user,password);     
        }
        catch(ClassNotFoundException |SQLException e){
            System.out.println(e);
        }
        return con;
    }
    public static void insert(student dto){
        String sql_insert = "insert into student values('"+dto.getId()+"','"+dto.getName()+"')";
        try {
            getCon();
            st = con.createStatement();
            st.execute(sql_insert);
            System.out.println("inserted '"+dto.getId()+"' : '"+dto.getName()+"' successfully");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    public static void select(student dto){
        String sql_select = "select name from student where id = " +dto.getId();
        try {
            getCon();
            st = con.createStatement();
            rs = st.executeQuery(sql_select);
            System.out.println("resutl: ");
            if (rs.next() == false){
                System.out.println("None");
            }
            else{
                while(rs.next()){
                    String name = rs.getString("name");
                    System.out.println(name);
                    System.out.println("______________");
            }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    public static void update(student dto){
        String sql_update = "update student set name = '"+dto.getName()+"' where id = '"+dto.getId()+"'";
        try {
            getCon();
            st = con.createStatement();
            st.executeUpdate(sql_update);
            System.out.println("updated id = '"+dto.getId()+"' to new name is '"+dto.getName()+"'");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    public static void delete(student dto){
        String sql_delete = "delete from student where id = "+dto.getId();
        try {
            getCon();
            st = con.createStatement();
            st.executeUpdate(sql_delete);
            System.out.println("deleted id = '"+dto.getId()+" successfully");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your choice:\n"
                + "1. insert\n"
                + "2. select\n"
                + "3. update\n"
                + "4. delete");
        int choice = input.nextInt();
        student dto = new student();
        String id = "";
        String name = "";
        
        if(choice == 1){
            System.out.println("Enter id and name:");
            id = input.next();
            name = input.next();
            dto.setId(id);
            dto.setName(name);
            insert(dto);
        } 
        if(choice == 2){
            System.out.println("Enter id to select:");
            id = input.next();
            dto.setId(id);
            select(dto);
        }
        if(choice == 3){
            System.out.println("Enter id and new name:");
            id = input.next();
            name = input.next();
            dto.setId(id);
            dto.setName(name);
            update(dto);
        }
        if(choice == 4){
            System.out.println("Enter id to delete:");
            id = input.next();
            dto.setId(id);
            delete(dto);
        }  
    }
}
