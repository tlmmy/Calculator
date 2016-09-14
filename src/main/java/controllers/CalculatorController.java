/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.CircleCalcService;
import models.RectangleCalcService;
import models.Shape;
import models.ShapeSelector;
import models.TriangleCalcService;

/**
 *
 * @author Tim
 */
@WebServlet(name = "CalculatorController", urlPatterns = {"/calc"})
public class CalculatorController extends HttpServlet {
    private final String DESTINATION_VIEW = "/challenge2.jsp";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String shape = request.getParameter("shape");
        Shape gShape = new ShapeSelector().chooseShape(shape);
       
        switch (gShape) {
            case RECTANGLE: 
                String width = request.getParameter("width");
                String length = request.getParameter("length");
                String rectangleArea = new RectangleCalcService().calculateArea(width, length);
                request.setAttribute("rectangleArea", rectangleArea);
                RequestDispatcher view = request.getRequestDispatcher(DESTINATION_VIEW);
                view.forward(request, response);
            break;
            
            case CIRCLE: 
                String radius = request.getParameter("radius");
                String circleArea = new CircleCalcService().calculateArea(radius);
                request.setAttribute("circleArea", circleArea);
                RequestDispatcher view1 = request.getRequestDispatcher(DESTINATION_VIEW);
                view1.forward(request, response);
            break;
            
            case TRIANGLE: 
                String base = request.getParameter("base");
                String height = request.getParameter("height");
                String areaTriangle = new TriangleCalcService().calculateArea(base, height);
                request.setAttribute("triangleArea", areaTriangle);
                RequestDispatcher view2 = request.getRequestDispatcher(DESTINATION_VIEW);
                view2.forward(request, response);
            break;
        }
    }
        
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
