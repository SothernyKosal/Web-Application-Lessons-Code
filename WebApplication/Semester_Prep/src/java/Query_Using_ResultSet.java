import java.sql.*;


public class Query_Using_ResultSet {
    static String jdbc_driver = "com.mysql.jdbc.Driver";
    static String db_url = "jdbc:mysql://localhost:3306/semester_prep";
    static String user = "root";
    static String password = "";
    
    public static void main(String[] args){
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try{
            Class.forName(jdbc_driver);
            con = DriverManager.getConnection(db_url,user,password);
            st = con.createStatement();
            
            String sql_queries = "select * from student";
            rs = st.executeQuery(sql_queries);
            while(rs.next()){
                String id = rs.getString("id");
                String name = rs.getString(2);
                System.out.println(id + " : " + name);
                System.out.println("____________________________");
            }
        }catch(ClassNotFoundException |SQLException e){
            System.out.println(e);
        }
    }
}
