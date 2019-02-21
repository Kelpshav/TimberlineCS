/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardDealer;

/**
 *
 * @author timberlinepluska
 */
public class CardDealer extends DeckOfCards{
    
    private static int dealSize;
    private static Card[] dealt;
    
    
    /**
     *
     * @param args
     */
    public CardDealer(int d){
        super();
        dealSize = d;
        dealt = new Card[dealSize];
        buildDeck();
        shuffleCards();
        dealCards();

    }
        
    /**
     * Deals a hand of cards of size DEALSIZE
     * @return dealt, an array of cards
     */
    public Card[] dealCards(){
        
        for(int i = 0; i < dealSize; i++){
            dealt[i] = nextCard();
        }
        
        return dealt;
    }
    
    public void swapCards(Card a, Card b, int i, int k){
        Card temp = a;//temp is a
        a = b;//a is b
        b = temp;//b is a
        setCard(i, a);//set i with new a
        setCard(k, b);//set k with new b

    }
    public void swapCards2(int i, int k){
        Card c1 = getCard(i);
        Card c2 = getCard(k);
        setCard(i, c2);
        setCard(k, c1);
    }
    
    
    
    public void shuffleCards(){
        for(int i = 0; i < deckSize(); i++){
            int k = (int)(Math.random()*deckSize());
            swapCards(getCard(i), getCard(k), i, k);
        }
    }
     
     
}
