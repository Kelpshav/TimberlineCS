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
public class ShoppingListDriver {
    
    public static void main(String args[]){
        
        Scanner sl = new Scanner(System.in);
        System.out.println("How many items do you want to buy?");
        
        int numItems = sl.nextInt();
        ShoppingList shoppingList[] = new ShoppingList[numItems];
        
        for(int i = 0; i < numItems; i++){
            
            System.out.println("enter item " + i);
            String item = sl.nextLine();
            System.out.println("enter item price");
            String price = sl.nextLine();
            shoppingList[i] = new ShoppingList(item, Double.parseDouble(price));

        }
        
        double high = 0;
        ShoppingList highestItem = null;
        ShoppingList lowestItem = null;
        
        for(int i = 0; i < shoppingList.length; i++){
            if(shoppingList[i].getPrice() > high){
                highestItem = shoppingList[i];
            }
            
        }
        
        for(int i = 0; i < shoppingList.length-1; i++){
            
            if(shoppingList[i].getPrice() < shoppingList[i + 1].getPrice()){
                lowestItem = shoppingList[i];
            }
        }
        
        System.out.println(highestItem.getPrice());
        System.out.println(lowestItem.getPrice());
        
        
    }
    
    
    
    
}
