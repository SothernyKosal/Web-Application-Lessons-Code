<%-- 
    Document   : index
    Created on : Mar 25, 2020, 9:43:00 AM
    Author     : Sotherny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<c:set var="lang" value="${param.langPref}"/>
<c:if test="${not empty lang}">
    <fmt:setLocale value="${lang}"/>
</c:if>
<fmt:setBundle basename="com.myResource"/>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><fmt:message key="title"/></title>
    </head>
    <body>
        
        <form action="#">
            <h3><fmt:message key="lang"/></h3>
            <select name="langPref">
                <option>English</option>
                <option value="kh_KR">ភាសាខ្មែរ​</option>
                <option value="ja_JP">にほんご</option>
                <!--<option value="fr_FR">Français</option>-->              
                <!--<option value="ta_IN">தமிழ் </option>-->
                <br>
                <input type="submit" value="<fmt:message key='button'/>">    
            </select>
                <h4><fmt:message key="message"/></h4>
        </form>
      </body>
</html>
