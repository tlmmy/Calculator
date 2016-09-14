<%-- 
    Document   : listTest
    Created on : Sep 14, 2016, 1:15:30 PM
    Author     : Tim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%
    Object obj = request.getAttribute("shoppingList");
    if(obj == null){
        response.sendRedirect("ListController");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Test</title>
    </head>
    <body>
        <h1>List Test</h1>
        
        <ul>
            <c:forEach var="item" items="${shoppingList}">
                <li>${item}</li>
            </c:forEach>
        </ul>
    </body>
</html>
