/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Tim
 */
public class TriangleCalcService {
    public final String ERROR_MESSAGE = "Error";
    public final String SQUARE_INCHES = " in" + "\u00b2";
    
     public final String calculateArea(String b, String h) {
        try {
            if (b == null || h == null || Double.valueOf(b) < 0 || Double.valueOf(h) < 0) {
                return ERROR_MESSAGE;
            }
        } catch(IllegalArgumentException e) {
            return ERROR_MESSAGE;
        }
        Double base = Double.valueOf(b);
        Double height = Double.valueOf(h);
        Double tArea = (base * height) / 2;
        
        return String.format("%.2f", tArea) + SQUARE_INCHES;
    }
}
