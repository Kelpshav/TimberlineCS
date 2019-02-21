/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dixiecupmaker;

import java.util.Scanner;

/**
 *
 * @author timberlinepluska
 */
public class DixieCupMaker {
    /**
     * @param args the command line arguments
     */
    public static Scanner in = new Scanner(System.in);
    public static int numCups = 0, numItems = 0;
    public static DixieCup[] cupsArray;
    
    public static void main(String[] args) {

        do{
        System.out.println("How many cups?  Enter 2 or 3");
        
        String numCupsTemp = in.nextLine();
        numCups = Integer.parseInt(numCupsTemp);
        
            if(numCups<2 || numCups >3){
                System.out.println("Invalid number of cups");
            }
        }while(numCups < 2 || numCups >3);
        
        cupsArray = new DixieCup[numCups];
        
        for(int cups = 0; cups < cupsArray.length; cups++){
            
            do{
            
            System.out.println("How many items can cup " + cups + " have?");
            String numItemsTemp = in.nextLine();
            numItems = Integer.parseInt(numItemsTemp);
            
                if(numItems < 1){
                    System.out.println("Invalid number of things");
                }
            
            }while(numItems < 1);
            
            cupsArray[cups] = new DixieCup(numItems);
            
        }
        int selection = 8;
        
        do{
            
        System.out.println("Enter a selection from the menu below:");
        System.out.println("0: Add an item");
        System.out.println("1: Get an item");
        System.out.println("2: Remove an item");
        System.out.println("3: Change an item");
        System.out.println("4: Swap items");        
        System.out.println("5: Display the contents of a Dixie cup"); 
        System.out.println("6: Summary of all Dixie cups"); 
        System.out.println("7: Quit"); 
        
        String selectionTemp = in.nextLine();
        selection = Integer.parseInt(selectionTemp);
        
            if(selection > 7){
                System.out.println("invalid selection");
            }

        switch(selection){
            case 0:
                selection0();
                break; 
            case 1:
                selection1();
                break;
            case 2:
                selection2();
                break;
            case 3:
                selection3();
                break;
            case 4:
                selection4();
                break;
            case 5:
                selection5();
                break;
            case 6:
                selection6();
                break;
            
        }
            
            
            
        }while(selection != 7);
        
        

    }
    
    public static void selection0(){
        int cupNum=0;
        do{
        System.out.println("Enter the cup you want to add something to");
        String cupNumTemp = in.nextLine();
        cupNum = Integer.parseInt(cupNumTemp);
        
            if(cupNum>numCups-1){
                System.out.println("invalid cup number");
            }
        
        }while(cupNum>numCups-1);
        
    System.out.println("What do you want to add?");
    String itemToAdd = in.nextLine();
    cupsArray[cupNum].addItem(itemToAdd);
    }
    
    public static void selection1(){
        int cupNum=0;
        int itemNum = 0;
        do{
        System.out.println("Enter the cup you want to get an item from");
        String cupNumTemp = in.nextLine();
        cupNum = Integer.parseInt(cupNumTemp);
        
            if(cupNum>numCups-1){
                System.out.println("invalid cup number");
            }
        
        }while(cupNum>numCups-1);
        
        do{
            System.out.println("Enter the item number");
            String itemNumTemp = in.nextLine();
            itemNum = Integer.parseInt(itemNumTemp);
                if(itemNum>cupsArray[cupNum].numItems()-1){
                    System.out.println("invalid item number");
                }
            
        }while(itemNum > cupsArray[cupNum].numItems()-1);
        
        System.out.println(cupsArray[cupNum].getItem(itemNum));
    }
    
    public static void selection2(){
        int cupNum=0;
        do{
        System.out.println("Enter the cup you want to remove something from");
        String cupNumTemp = in.nextLine();
        cupNum = Integer.parseInt(cupNumTemp);
        
            if(cupNum>numCups-1){
                System.out.println("invalid cup number");
            }
        
        }while(cupNum>numCups-1);
        
        System.out.println("Enter the name of the item you want to remove");
        String itemName = in.nextLine();
        cupsArray[cupNum].removeItem(itemName);
        
    }
    
    public static void selection3(){
        int cupNum=0;
        int itemNum = 0;
        do{
        System.out.println("Enter the cup you want to change");
        String cupNumTemp = in.nextLine();
        cupNum = Integer.parseInt(cupNumTemp);
        
            if(cupNum>numCups-1){
                System.out.println("invalid cup number");
            }
        
        }while(cupNum>numCups-1); 
        
        do{
            System.out.println("Enter the item number");
            String itemNumTemp = in.nextLine();
            itemNum = Integer.parseInt(itemNumTemp);
                if(itemNum>cupsArray[cupNum].numItems()-1){
                    System.out.println("invalid item number");
                }
            
        }while(itemNum > cupsArray[cupNum].numItems()-1);
        
        System.out.println("What do you want to change this item to?");
        String itemName = in.nextLine();
        cupsArray[cupNum].setItem(itemNum, itemName);
    }
    
    public static void selection4(){
        int cupNum1=0;
        int cupNum2=0;
        int itemNum1 = 0;
        int itemNum2 = 0;
        do{
        System.out.println("Enter first cup");
        String cupNumTemp = in.nextLine();
        cupNum1 = Integer.parseInt(cupNumTemp);
        
            if(cupNum1>numCups-1){
                System.out.println("invalid cup number");
            }
        
        }while(cupNum1>numCups-1);
        
        do{
            System.out.println("Enter the item number in cup 1");
            String itemNumTemp = in.nextLine();
            itemNum1 = Integer.parseInt(itemNumTemp);
                if(itemNum1>cupsArray[cupNum1].numItems()-1){
                    System.out.println("invalid item number");
                }
            
        }while(itemNum1 > cupsArray[cupNum1].numItems()-1);
        
        do{
        System.out.println("Enter second cup");
        String cupNumTemp = in.nextLine();
        cupNum1 = Integer.parseInt(cupNumTemp);
        
            if(cupNum1>numCups-1){
                System.out.println("invalid cup number");
            }
        
        }while(cupNum1>numCups-1);
        
        do{
            System.out.println("Enter the item number in cup 2");
            String itemNumTemp = in.nextLine();
            itemNum2 = Integer.parseInt(itemNumTemp);
                if(itemNum2>cupsArray[cupNum2].numItems()-1){
                    System.out.println("invalid item number");
                }
            
        }while(itemNum2 > cupsArray[cupNum2].numItems()-1);
        
        cupsArray[cupNum1].swap(cupsArray[cupNum2],itemNum1, itemNum2);
        
    }
    
    public static void selection5(){
        int cupNum=0;
        do{
        System.out.println("Enter the cup you want to display");
        String cupNumTemp = in.nextLine();
        cupNum = Integer.parseInt(cupNumTemp);
        
            if(cupNum>numCups-1){
                System.out.println("invalid cup number");
            }
        
        }while(cupNum>numCups-1);
        
        
        System.out.println(cupsArray[cupNum]);
    }
    
    public static void selection6(){
        int highest = 0;
        int highestIndex = 0;
        int lowest = cupsArray[0].numItems();
        int lowestIndex = 0;
        //Find Cup with the most items
        for(int i = 0; i < cupsArray.length;i++ ){
            if(cupsArray[i].numItems() > highest){
                highest = cupsArray[i].numItems();
                highestIndex = i;
            }
            
        }
        //Find Cup with the least items
        for(int i = 0; i < cupsArray.length-1;i++ ){

            if(cupsArray[i].numItems() < lowest){
                lowest = cupsArray[i].numItems();
                lowestIndex = i;
            }
            
        }
        
        if(cupsArray.length == 2){
        DixieCup first = cupsArray[lowestIndex];
        DixieCup second = cupsArray[highestIndex];
        }else{
        DixieCup first = cupsArray[lowestIndex];
        DixieCup third = cupsArray[highestIndex];
        DixieCup second = cupsArray[3 - lowestIndex -highestIndex];
        }
        
        System.out.println("********************************************************************************");
        System.out.print("The cup with the most items is cup " + highestIndex);
        System.out.println("     The cup with the least items is cup " + lowestIndex);
        System.out.println("********************************************************************************");
        System.out.println("cup            number of items");
        System.out.println("********************************************************************************");        
        System.out.println(lowestIndex + "                 " + cupsArray[lowestIndex].numItems());
        if(cupsArray.length>2)
             System.out.println((3-lowestIndex-highestIndex) + "                 " + cupsArray[3-lowestIndex-highestIndex].numItems());
        System.out.println(highestIndex + "                 " + cupsArray[highestIndex].numItems());
    }
    
    
}
