
import Student.Student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


public class DBOperation {
    Connection conn = null;
    public Connection getCon() throws ClassNotFoundException, SQLException{
        if(conn == null){
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kit","root","");
        }
        return conn;
    }
    public boolean insertRecord(Student s){
        int id = s.getId();
        String name = s.getName();
        try{
            getCon();
            PreparedStatement ps = conn.prepareStatement("insert into student values(?,?)");
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.execute();
            return true;
                
        }
        catch(ClassNotFoundException |SQLException e){}
        return false;
    }
    public int insertMultipleRecord(List<Student> studentList){
        int count = 0;
        try{
            getCon();
            PreparedStatement ps = conn.prepareStatement("insert into student values(?,?)");
            for (Student student:studentList){
               ps.setInt(1,student.getId());
               ps.setString(2,student.getName());
               ps.addBatch();
               count++;
            }
            ps.executeBatch();
        }
        catch(ClassNotFoundException | SQLException e){}
        return count;
    }
}
