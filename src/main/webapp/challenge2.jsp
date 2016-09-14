<%-- 
    Document   : challenge2
    Created on : Sep 14, 2016, 11:53:57 AM
    Author     : Tim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Challenge 2</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    </head>
    <body>
        
        
        <div id="rectangleCalc">
            <h2>Rectangle Area Calculator</h2>
            <img class="img" id="rectangleImgage" src="images/area-of-rectangle.png" alt=""/>
            <form name="rectangleCalc" id="rectangleCalc" type="POST" action="calc">
                <label for="width">Width(in):</label><input type="text" id="width" name="width">
                <label for="length">Length(in):</label><input type="text" id="length" name="length">
                <input type="hidden" id="shape" name="shape" value="rectangle">
                <input type="submit" value="Calculate" class="calculateButton">
                <div class="resultBox">
                   
                    <h2>Area of this rectangle:${rectangleArea}</span></h2>
                </div>
            </form>
        </div>
                
        <div id="circleCalc">
            <h2>Circle Area Calculator</h2>
            <img class="img" id="circleImgage" src="images/circle-diagram.png" alt=""/>
            <form name="circCalc" id="circCalc" type="POST" action="calc">
                <label for="radius">Radius(in):</label><input type="text" id="radius" name="radius">
                <input type="hidden" id="shape" name="shape" value="circle">
                <input type="submit" value="Calculate" class="calculateButton">
                <div class="resultBox">
                    
                    <h2>Area of this circle:${circleArea}</h2>
                </div>
            </form>
        </div>
                
        <div id="tCalc">
            <h2>Triangle Area Calculator</h2>
            <img class="img" id="triangleImgage" src="images/area-of-triangle.png" alt=""/>
            <form name="triCalc" id="triCalc" type="POST" action="calc">
                <label for="tBase">Base(in):</label><input type="text" id="base" name="base">
                <label for="tHeight">Height(in):</label><input type="text" id="height" name="height">
                <input type="hidden" id="shape" name="shape" value="triangle">
                <input type="submit" value="Calculate" class="calculateButton">
                <div class="resultBox">
                    
                    <h2>Area of this triangle:${triangleArea}</span></h2>
                </div>
            </form>
        </div>        
                    
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>        
    </body>
</html>
