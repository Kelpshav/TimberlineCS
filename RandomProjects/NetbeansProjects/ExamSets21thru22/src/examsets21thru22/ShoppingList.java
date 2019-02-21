/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examsets21thru22;

/**
 *
 * @author timberlinepluska
 */
public class ShoppingList {
    
    String itemNames[];
    double itemPrices[];
    
    public ShoppingList(int l){
        //initalizes two arrays - one for the item names, one for the item prices
        //the default values for String array is null
        //the default values for double array is 0
        itemNames = new String[l];
        itemPrices = new double[l];
    }
    
    public void addItem(String n, double p){
        //this loop finds the first null value in the itemNames array
        //and sets it as the new item
        //this prevents us from going out of bounds 
        for(int i = 0; i < itemNames.length; i++){
            if(itemNames[i] == null){
                itemNames[i] = n;
                itemPrices[i] = p;
                break;
            }
        }

    }
    
    public double highestItemPrice;
    
    public String getHighestItemName(){
        
        highestItemPrice = itemPrices[0];
        String highestPricedName = itemNames[0];
        
        for(int i = 0; i < itemNames.length; i++){
            
            if(itemPrices[i] > highestItemPrice){
                highestItemPrice = itemPrices[i];
                highestPricedName = itemNames[i];
                
            }
        }
        return highestPricedName;
    }
    
    public double getHighestItemPrice(){
        return highestItemPrice;
    }
    
    public void displayList(){
        
        for(int i = 0; i < itemNames.length;i++){
            System.out.println(itemNames[i]);
        }
    }
    
    
    
}
