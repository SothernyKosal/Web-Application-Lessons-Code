
package insertmultiplerecord;

import java.util.ArrayList;
import java.util.Scanner;

//22.11.2019

public class InsertMultipleRecord {

    public static void main(String[] args) {
       
        String id, name;
        int i;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter n.o record: ");
        int noRecord = input.nextInt();
        ArrayList<SectionC> ar = new ArrayList<>(noRecord);
        
        System.out.println("Enter id and name:");
        
        for (i = 0; i<noRecord; i++){
            id = input.next();
            name = input.next();
            SectionC dto = new SectionC();
            dto.setId(id);
            dto.setName(name);
            ar.add(dto);
        }
        dbOperation dbo = new dbOperation();
        dbo.insertMultipleRecord(ar);
        
        
        
    }
    
}
