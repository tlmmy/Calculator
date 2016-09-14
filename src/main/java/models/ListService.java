/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Tim
 */
public class ListService {
    private String userName = "Tim";
    private List<String> shoppingList;

    public ListService() {
        shoppingList = new ArrayList<>();
        shoppingList.add("Whiskey");
        shoppingList.add("Steak");
        shoppingList.add("Chips");
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<String> getShoppingList() {
        return shoppingList;
    }
    
    
}
