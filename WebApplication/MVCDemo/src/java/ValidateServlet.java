import Student.Student;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sotherny
 */
public class ValidateServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String idd = request.getParameter("id");
        int id = Integer.parseInt(idd);
        Student s = new Student();
        s.setId(id);
        s.setName(name);
        
        DBOperation dbop = new DBOperation();
        if(dbop.insertRecord(s)){
            System.out.println("data inserted successfully...");
            request.setAttribute("student", s);
            RequestDispatcher rd = request.getRequestDispatcher("/Result");
            rd.forward(request, response);
        }
        else{
            System.out.println("data insertion failed...");
        }
       
    }

}
