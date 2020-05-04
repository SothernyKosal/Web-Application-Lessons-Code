<%-- 
    Document   : index
    Created on : Feb 5, 2020, 11:50:10 PM
    Author     : Sotherny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form method="post" action="ExchangeServlet">
            
            Currency US $: <input type="number" name="amt" placeholder="US Dollar" min=0><br>
            <label>To</label><br>
            <select name="currency_type">
                <option value="INR">INR</option>
                <option value="KHR">KHR</option>
                <option value="YEN">YEN</option>
            </select><br>
            <input type="submit" value="convert" name="convert specific" style="padding-left:50px">
        </form>
    </body>
</html>
