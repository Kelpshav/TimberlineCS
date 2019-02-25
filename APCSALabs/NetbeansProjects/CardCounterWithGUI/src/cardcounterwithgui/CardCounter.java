/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardcounterwithgui;

/**
 *
 * @author Pluska
 */
public class CardCounter extends CardDealer{
    
    public CardCounter(int d){
        super(d);
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

    //TODO: Write a method called countSuites that finds the number of cards in each suite
    //This method should return an array of the stored values
    public int[] countSuites(){
    int values[] = new int[4];
    Card[] dealtCards = getDealtCards();
        for(int c = 0; c < dealtCards.length;c++){
            System.out.println(dealtCards[c].getSuite());
            if(dealtCards[c].getSuite().toLowerCase().equals("spades")){
                values[0]++;
            }
            if(dealtCards[c].getSuite().toLowerCase().equals("diamonds")){
                values[1]++;
            }
            if(dealtCards[c].getSuite().toLowerCase().equals("clubs")){
                values[2]++;
            }
            if(dealtCards[c].getSuite().toLowerCase().equals("hearts")){
                values[3]++;
            }
        }
        return values;
    }
       //TODO: Write a method called show sumDeal that returns the sum of all the cards dealt 
    public int sumDeal(){
    int sum = 0;
    Card[] dealtCards = getDealtCards();
        for(int c = 0; c < dealtCards.length;c++){
            sum += dealtCards[c].getValue();
        }
        return sum;
    }
    
}
