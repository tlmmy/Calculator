<%-- 
    Document   : challenge1Resutls
    Created on : Sep 7, 2016, 9:28:32 PM
    Author     : trogers8
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Challenge 1 Results</title>
    </head>
    <body>
        <%
            String answer = "ERROR";
            Object answerInt = request.getAttribute("message");
            if(answerInt != null){
                answer = answerInt.toString();
            }
        %>    
        <p>Your result is <%= answer %></p>
    </body>
</html>
