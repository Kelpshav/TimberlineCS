/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dixiecupmaker;

/**
 *
 * @author timberlinepluska
 */
public class DixieCup {
    private String[] items;
    private int itemNumber = 0;
    
    /**
     * Constructor
     * @param i number of cups
     */
    public DixieCup(int i){
        items = new String[i];
    }
    
    /**
     * Adds an item to the cup
     * @param n name of the item to be added
     */
    public void addItem(String n){
        int numCupItems = 0;
        
        for(int i = 0; i < items.length;i++){
            
            if(items[i]==null){
                items[i] = n;
                break;
            }else{
                numCupItems++;
            }
            
        }
        if(numCupItems < itemNumber){
        items[itemNumber]= n;
        itemNumber++;
        }
    }
    
    /**
     *
     * @param n
     */
    public void removeItem(String n){
        for(int i = 0; i < items.length;i++){
            if(items[i].equals(n)){
                items[i] = null;
            }
        }
    }
 
    /**
     *
     * @param i
     * @return
     */
    public String getItem(int i){
        
        return items[i];
    }
    
    /**
     *
     * @param index
     * @param n
     */
    public void setItem(int index, String n){
        items[index] = n;
    }
    
    /**
     *
     * @param b the cup to swap with
     * @param i1 the location of the item in the first cup
     * @param i2 the location of the item in the second cup
     */
    public void swap(DixieCup b, int i1, int i2){

        String temp = getItem(i1);
        setItem(i1, b.getItem(i2));
        b.setItem(i2, temp);  
    }
    
    /**
     *
     * @return
     */
    public int numItems(){
        int numItems = 0;
        for(int i = 0; i < items.length;i++){
            if(items[i]!=null){
                numItems++;
            }
        }
        
        return numItems;
    }
    
    public String toString(){
        
        String cupContents = "";
        for(int i = 0; i < items.length;i++){
            cupContents += items[i] + ",";
        }
        return cupContents;
    }
    
}
