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
public class CircleCalcService {
    public final String ERROR_MESSAGE = "Error";
    public final String SQUARE_INCHES = " in" + "\u00b2";
    
    public final String calculateArea(String r) {
        try {
            if (r == null || Double.valueOf(r) <= 0) {
                return ERROR_MESSAGE;
            }
        } catch(IllegalArgumentException e) {
            return ERROR_MESSAGE;
        }
        Double radius = Double.valueOf(r);
        Double cArea =  Math.PI * Math.pow(radius, 2);
        return String.format("%.2f", cArea)  + SQUARE_INCHES;
    }
}
