/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardCounterNoGUI;

/**
 *
 * @author timberlinepluska
 */
public class CardCounter extends CardDealer {
    
    //TODO: Write the constructor and pass in the appropriate parameter
    public CardCounter(int d){
        super(d);
        
    }
    //TODO: Write a method called show deal that displays the dealt cards
    public void showDeal(){
        Card[] dealt = getDealtCards();
        for(int i = 0; i < dealt.length;i++){
            System.out.println(dealt[i].toString());
            
        }
    }
    
    //TODO: Write a method called countValues that finds the number of aces, twos, threes, etc
    //This method should return an array of the stored values
    public int[] countValues(){
    int values[] = new int[13];
    Card[] dealtCards = getDealtCards();
        for(int c = 0; c < dealtCards.length;c++){
            values[dealtCards[c].getValue()]++;
        }
        return values;
    }

    //TODO: Write a method that finds the number of each suite
    public int[] countSuites(){
    int values[] = new int[4];
    Card[] dealtCards = getDealtCards();
        for(int c = 0; c < dealtCards.length;c++){
            if(dealtCards[c].getSuite().charAt(dealtCards[c].getSuite().length()-1)=='\u2660'){
                values[0]++;
            }
            if(dealtCards[c].getSuite().charAt(dealtCards[c].getSuite().length()-1)=='\u2666'){
                values[1]++;
            }
            if(dealtCards[c].getSuite().charAt(dealtCards[c].getSuite().length()-1)=='\u2663'){
                values[2]++;
            }
            if(dealtCards[c].getSuite().charAt(dealtCards[c].getSuite().length()-1)=='\u2764'){
                values[3]++;
            }
        }
        return values;
    }
    
    
}
