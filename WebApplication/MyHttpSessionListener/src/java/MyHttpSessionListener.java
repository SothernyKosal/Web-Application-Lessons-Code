
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sotherny
 */
public class MyHttpSessionListener implements HttpSessionListener{
    int count=0;
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("session created");
        count++;
        System.out.println("active session: "+count);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        count--;
        System.out.println("session destroyed");
        System.out.println("active user: "+count);
    }
    
}
