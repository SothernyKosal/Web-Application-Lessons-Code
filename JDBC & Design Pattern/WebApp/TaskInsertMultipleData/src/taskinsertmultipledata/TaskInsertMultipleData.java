package taskinsertmultipledata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

//21.11.2019

public class TaskInsertMultipleData {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String id = "";
        String name = "";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            String url = "jdbc:mysql://localhost:3306/kit";
            String user = "root";
            String pass = "";
            int NoRecord, i ;
            Connection c = DriverManager.getConnection(url, user, pass);
            
            Statement st = c.createStatement();
//            String table = "create table SectionC (id varchar(20), name varchar(50))";
//            st.execute(table);
            
            System.out.println("Enter n.o of record: ");
            NoRecord = input.nextInt();
            
            ArrayList<SectionC> ar = new ArrayList<SectionC>(NoRecord);
            
            
            System.out.println("Enter id and name: ");
            for(i = 0; i<NoRecord; i++){
                SectionC dto = new SectionC();
                id = input.next();
                name = input.next();
                dto.setId(id);
                dto.setName(name);
                ar.add(dto); 
            }  
            
            for(SectionC a:ar){
                st.execute(" insert into SectionC values('"+a.getId()+"','"+a.getName()+"')");
            }
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    }    
}
