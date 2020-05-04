/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author Sotherny
 */
public class MyJDBCTag extends TagSupport{
    String driver, url, dbUserName,dbPassword, user, age;

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setDbUserName(String dbUserName) {
        this.dbUserName = dbUserName;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public int doEndTag() throws JspException {
        
        return super.doEndTag(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int doStartTag() throws JspException {
        JspWriter out = pageContext.getOut();
        try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url,dbUserName,dbPassword);
            PreparedStatement ps = con.prepareStatement("insert into student values(?,?)");
            ps.setString(1, user);
            ps.setString(2, age);
            ps.execute();
            out.println("register success...");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyJDBCTag.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MyJDBCTag.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MyJDBCTag.class.getName()).log(Level.SEVERE, null, ex);
        }
        return super.doStartTag(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
