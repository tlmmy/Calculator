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
public class ShapeSelector {
        
    public final Shape chooseShape(String s) {
        if (s.equalsIgnoreCase("rectangle")) {
            return Shape.RECTANGLE;
        } else if (s.equalsIgnoreCase("circle")) {
            return Shape.CIRCLE;
        } else {
            return Shape.TRIANGLE;
        }
    }
}
