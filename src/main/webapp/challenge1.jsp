<%-- 
    Document   : challenge1
    Created on : Sep 7, 2016, 9:07:55 PM
    Author     : trogers8
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Challenge 1</title>
    </head>
    <body>
        <h1>Area of a Rectangle</h1>
        <form id="rectangleForm" name="rectangleForm" method="POST" action="/calc1">
            Length(in):<input type="text" name="length" value="">
            Width(in): <input type="text" name="width" value="">
            <input type="submit" name="rectangleSubmit" value="Submit">
        </form>
    </body>
</html>
