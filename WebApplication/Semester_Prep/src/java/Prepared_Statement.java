
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class Prepared_Statement {
    public static void main(String[] args) throws SQLException{
        Connection con = CRUD_using_JDBC.getCon();
        String sql = "insert into student values(?,?)";
        PreparedStatement  ps = con.prepareStatement(sql);
        
        //preparedstatement with batch processing
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the n.o time to insert:");
        int no_time = input.nextInt(),i;
        String id,name;
        for(i=0; i<no_time; i++){
            System.out.println("Enter id:");
            id = input.next();
            System.out.println("Enter name");
            name = input.next();
            ps.setString(1, id);
            ps.setString(2, name);
            ps.addBatch();
        }
        ps.executeBatch();
        
        //preparedstatement
//        ps.setString(1, "17");
//        ps.setString(2, "Sotherny Kosal");
//        ps.execute();
        System.out.println("insert data successfully"); 
    }
}
