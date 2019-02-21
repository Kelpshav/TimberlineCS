/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppinglist2;

/**
 *
 * @author timberlinepluska
 */
public class ShoppingList {
    
    private String itemNames[];
    private double itemPrices[];
    private int itemNum = 0;
    
    public ShoppingList(int i){
        itemNames = new String[i];
        itemPrices = new double[i];
        
    }
    
    public void addItem(String i, double p){
        
        itemNames[itemNum] = i;
        itemPrices[itemNum] = p;
        itemNum++;
        
        
    }
    
    public String getHighestItemName(){
        String highestPricedItem = null;
        double highPrice = 0;
        
        for(int i = 0; i < itemNames.length;i++){
            if(itemPrices[i]>highPrice){
                highestPricedItem = itemNames[i];
                highPrice = itemPrices[i];
            }
        }
        
        return highestPricedItem;
    }
    
    public double getHighestItemPrice(){
        double highPrice = 0;
        
        for(int i = 0; i < itemPrices.length;i++){
            if(itemPrices[i]>highPrice){
                highPrice = itemPrices[i];
            }
        }
        
        return highPrice;
    }
    
    public void displayList(){
        
        for(int i = 0; i < itemPrices.length; i++){
            System.out.println(itemNames[i] + "\t\t" + itemPrices[i]);
        }
    }
    
}
