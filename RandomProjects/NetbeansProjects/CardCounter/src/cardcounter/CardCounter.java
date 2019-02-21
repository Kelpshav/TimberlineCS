/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardcounter;

/**
 *
 * @author timberlinepluska
 */
public class CardCounter extends CardDealer {
    
    public CardCounter(int d){
        super(d);
        
    }
    //Write a method called showDeal that displays the dealt cards
    public void showDeal(){
        
        Card dealtCards[] = getDealtCards();
        
        for(int i = 0; i < getDealtCards().length;i++){
            System.out.println(dealtCards[i].toString());
            
        }
    }
    
    //Write a method that finds the number of aces, twos, threes, etc
    
    
    
    //Write a method that finds the number of each suite
    
    

    
}
