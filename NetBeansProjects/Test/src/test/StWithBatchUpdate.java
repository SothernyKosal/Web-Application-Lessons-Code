package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StWithBatchUpdate {
    public void usingBatch() throws ClassNotFoundException, SQLException{
        String url = "jdbc:mysql://localhost:3306/kit";
        String user = "root";
        String pass = "";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);
        Statement st = con.createStatement();
        st.addBatch("insert into b6c values('008', 'Ali', '1')");
        st.addBatch("insert into b6c values('009', 'Brook', '1')");
//        st.addBatch("update b6c set sname = 'Sreysa' where id = '006'");
//        st.addBatch("delete from b6c where id = '008' ");
//        st.addBatch("delete from b6c where id = '009' ");
        st.executeBatch();
        st.close();
        con.close();
        System.out.println("close connection");
    }
}
