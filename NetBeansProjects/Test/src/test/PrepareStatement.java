/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class PrepareStatement {
    public void insert() throws SQLException, ClassNotFoundException{
        
            String url = "jdbc:mysql://localhost:3306/kit";
            String user = "root";
            String password = "";
            String id, name ,age;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("insert into b6c values(?,?,?)");
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number of record you want to insert: ");
            int num = input.nextInt();
            for(int i = 0; i < num; i++){
                System.out.print("Enter id: "); 
                id = input.next();
                System.out.print("Enter name: ");
                name = input.next();
                System.out.print("Enter age: ");
                age = input.next();
                ps.setString(1, id);
                ps.setString(2, name);
                ps.setString(3, age);
                ps.addBatch();
            }
            ps.executeBatch();
    }
    
}
