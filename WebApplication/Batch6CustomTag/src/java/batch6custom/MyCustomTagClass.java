/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch6custom;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;


public class MyCustomTagClass extends TagSupport{

    int num = 0;
    String userName = "";
    
    public void setNum(int num){
        this.num = num;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    
    @Override
    public int doEndTag() throws JspException {
        try{
            JspWriter out = pageContext.getOut();
            out.println("close tag");
            for(int i = 0; i< num; i++){
                out.print(userName+"<br>");
            }
        }catch(Exception e){}
        return super.doEndTag(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int doStartTag() throws JspException {
        try{
            JspWriter out = pageContext.getOut();
            out.println("open tag Batch6 Rock...");
        }catch(Exception e){}
        return super.doStartTag(); //To change body of generated methods, choose Tools | Templates.
    }            
}
