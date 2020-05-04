package jdbctransaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//27.11.2019
public class JDBCTransaction {    
    public static void main(String[] args) throws SQLException {
        JDBCTransaction transaction = new JDBCTransaction();
        transaction.transact();
    }
    public void transact() throws SQLException{
        Connection con = null;
        Statement st = null;
        Scanner s = new Scanner(System.in);
        
        int debId, creId, amt;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kit","root","");
            con.setAutoCommit(false);
            st = con.createStatement();
            
            System.out.println("Enter the id to debit money: ");
            debId = s.nextInt();
            System.out.println("Enter the amount to transfer: ");
            amt = s.nextInt();
            System.out.println("Enter the account to credit money: ");
            creId = s.nextInt();
            
            st.executeUpdate("update bank set amt = amt - '"+amt+"' where id = '"+debId+"'");
            st.executeUpdate("update bank set amt = amt + '"+amt+"' where id = '"+creId+"'");
            
            con.commit();
            System.out.println("Transaction completed thank you for using our service");
        }catch(ClassNotFoundException ex){
            System.out.println("Driver loading failed");
        }catch(SQLException e){
            try{
                con.rollback();
                System.out.println("Transaction failed..thank you for using our service");
            }catch(SQLException  ex){
                System.out.println("RollBack failed..Thank you for using our service");
            }
            
        }
        
    }
    
}
