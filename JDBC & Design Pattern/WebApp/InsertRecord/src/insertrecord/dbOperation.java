package insertrecord;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class dbOperation {
    Connection c = null;
    Statement st = null;
    ResultSet rs = null;
    public void getStatement() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/kit", "root", "");
        st = c.createStatement();
    }
    public void insertRecord(b6c dto){
        try{
            getStatement();
            st.execute("insert into b6c values('"+dto.getId()+"','"+dto.getSname()+"','"+dto.getAge()+"')");
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println("ex "+e);
        }
    }
    
    public void readData(String Id){
       
        try {
            getStatement();
            String select = String.format("select * from b6c where id = %s",Id );
            //below line query all
//            String select = String.format("select * from b6c");
            System.out.println(select);
            rs = st.executeQuery(select);
            String rId,rName, rAge;
//            rId = rs.getString("id");
            
            
            while(rs.next()){
                rId = rs.getString(1);
                rName = rs.getString(2);
                rAge = rs.getString(3);
//                b6c data = new b6c();
//                data.setId(rId);
//                data.setSname(rName);
//                data.setAge(rAge);
            System.out.println("Id: "+rId+" Name:"+rName+" Age:"+rAge);
            
            }    
        } 
        catch (ClassNotFoundException | SQLException ex) {
           System.out.println(ex);
        }
//        b6c dto = new b6c();
//        dto.setId(rs.getString("id"));
//        dto.setSname(rs.getString("sname"));
//        dto.setAge(rs.getString("age"));
//        System.out.println(dto.getId() + " " + dto.getSname() + " " + dto.getAge());       
        
    }
    
    public ArrayList<b6c> readAllData(){
        ArrayList<b6c> arr = new ArrayList<b6c>();
        try{
            getStatement();
            String select = String.format("select * from b6c");
            System.out.println(select);
            rs = st.executeQuery(select);
            b6c data = new b6c();
            while(rs.next()){
                data.setId(rs.getString(1));
                data.setSname(rs.getString(2));
                data.setAge(rs.getString(3));
                arr.add(data);
//                System.out.println(data);
                
            }
            
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
//        System.out.println(arr);
        return arr;
    }
}


