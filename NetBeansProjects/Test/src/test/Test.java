
package test;

import java.sql.SQLException;

public class Test {

       public static void main(String[] args) {
    
          
        dbOperation dbo = new dbOperation();
//        dbo.readData

//        PrepareStatement ps = new PrepareStatement();
//        try{
//            ps.insert();
//        }
//        catch(ClassNotFoundException | SQLException e){
//            System.out.println(e);
//        }

//        StWithBatchUpdate stu = new StWithBatchUpdate();
//        
//        try{
//            stu.usingBatch();
//        }
//        catch(ClassNotFoundException | SQLException e){
//            System.out.println(e);
//        }
//        
//        Transaction tr = new Transaction();
//        tr.transaction();
//        
//        CarBuilder car = new CarBuilder.carBuilder().
//                setBrand("audi").
//                setColor("white").
//                setEngine("pedroliam").
//                build();
//           System.out.println(car);
//        


                   
            Car c = CarFactory.getCar("audi");
            c.printInfo(); 
     
       }    
}
