/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Transaction {
    public void transaction(){
        Connection con = null;
        Statement st = null;
        Scanner s = new Scanner(System.in);
        
        int debId = 0;
        int creId = 0;
        int amt = 0;
        
        try{
            String url = "jdbc:mysql://localhost:3306/kit";
            String user = "root";
            String pass = "";
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            
            con.setAutoCommit(false);
            
            
            st = con.createStatement();
            
            System.out.println("Enter id to debit money: ");
            debId = s.nextInt();
            
            System.out.println("Enter the amount to transfer: ");
            amt = s.nextInt();
            
            System.out.println("Enter account to credit money: ");
            creId = s.nextInt();
            
            st.executeUpdate("update bank set amt = amt - '"+amt+"' where id = '"+debId+"' ");
            st.executeUpdate("update bank set amt = amt + '"+amt+"' where id = '"+creId+"' ");
            
            con.commit();
            System.out.println("Transaction completed");
            
        }
        catch(ClassNotFoundException ee ){
            System.out.println("loading driver failed...");
        }
        catch(SQLException e){
            try{
                con.rollback();
                System.out.println("transaction failed...");
            }
            catch(SQLException ex){
                System.out.println("rollback failed...");
            }
        }
        
        
    }
    
}
