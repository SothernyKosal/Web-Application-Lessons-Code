package insertrecord;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

//22.11.2019

public class InsertRecord {

    public static void main(String[] args) throws SQLException {
        b6c dto = new b6c();
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter id, name and age: ");
//        String id = input.next();
//        String name = input.next();
//        String age = input.next();
//        dto.setId(id);
//        dto.setSname(name);
//        dto.setAge(age);
        
        dbOperation dbo = new dbOperation();
//        dbo.insertRecord(dto);
        
        System.out.println("Enter id to read the data: ");
        String Id = input.next();
        dbo.readData(Id);
        
        ArrayList<b6c> result = dbo.readAllData();
        
        for(b6c a:result){
            System.out.println(a.getId()+ " " + a.getSname() + " " + a.getAge());
        }   
    }    
}
