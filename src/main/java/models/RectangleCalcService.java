/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author trogers8
 */
public class RectangleCalcService {
   public final String ERROR_MESSAGE = "Error";
   public final String SQUARE_INCHES = " in" + "\u00b2";

   


    public final String calculateArea(String length, String width){
        try {
            if (length == null || width == null || Double.valueOf(length) <= 0 || Double.valueOf(width) <= 0) {
                return ERROR_MESSAGE;
            }
        } catch(IllegalArgumentException e) {
            return ERROR_MESSAGE;
        }
        Double area = Double.valueOf(length) * Double.valueOf(width);
        return area.toString()  + SQUARE_INCHES;
    }
    
    
    
    
}
