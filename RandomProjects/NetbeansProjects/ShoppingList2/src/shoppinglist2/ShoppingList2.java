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
public class ShoppingList2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShoppingList sl = new ShoppingList(3);
        sl.addItem("eggs", 3.00);
        sl.addItem("bread", 2.25);
        sl.addItem("potatoes", 2.00);
        System.out.println("highest name = " + sl.getHighestItemName());
        System.out.println(sl.getHighestItemPrice());
        sl.displayList();
        
    }
    
}
