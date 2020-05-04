package dbproj;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//21.11.2019
public class DBProj {
    public static void main(String[] args){
//        String id = "";
//        String name = "";
//        String age = "";
        String id1 = "";
        String name1 = "";
        String age1 = "";
        Scanner scan = new Scanner(System.in);
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/kit","root","");
//            Statement st = c.createStatement();
           System.out.println("Enter id and name");
//            id = scan.next();
//            name = scan.next();
//            age = scan.next();
//            st.execute("insert into b6c values('"+id+"','"+name+"','"+age+"')");            
            id1 = scan.next();
            name1 = scan.next();
            age1 = scan.next();
            b6c dto = new b6c();
            dto.setId(id1);
            dto.setSname(name1);
            dto.setAge(age1);
            insertRecord(dto);
//            st.execute("insert into b6c values('"+id1+"','"+name1+"','"+age1+"')");
            
            System.out.println("Data successfully inserted");
        }
//        catch(ClassNotFoundException | SQLException e){
//            System.out.println(e);
//        }
    private static void insertRecord(b6c dto){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/kit","root","");
            Statement st = c.createStatement();
            st.execute("insert into b6c values('"+dto.getId()+"','"+dto.getSname()+"','"+dto.getAge()+"')");
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        
    }
}
    

