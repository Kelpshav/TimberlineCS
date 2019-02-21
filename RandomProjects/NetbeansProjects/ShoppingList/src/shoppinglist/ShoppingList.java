/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppinglist;

import java.util.Scanner;

/**
 *
 * @author timberlinepluska
 */
public class ShoppingList {
    String item;
    double price;

    public ShoppingList(String i, double p){
        
        item = i;
        price = p;

    }
    
    public double getPrice(){
        
        return price;
    }
    
    public String getItem(){
        
        return item;
    }
    
}
