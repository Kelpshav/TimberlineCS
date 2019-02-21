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
public class ExamSets21thru22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShoppingList[] list = new ShoppingList[3];
        list[0] = new ShoppingList(3);
        list[1] = new ShoppingList(3);
        list[2] = new ShoppingList(3);
        
        list[0].addItem("eggs", 5.00);
        list[0].addItem("bread", 3.00);
        list[0].addItem("milk", 4.00);
        
        System.out.println(list[0].getHighestItemName());
        System.out.println(list[0].getHighestItemPrice());
        
        list[0].displayList();

    }
    
}
