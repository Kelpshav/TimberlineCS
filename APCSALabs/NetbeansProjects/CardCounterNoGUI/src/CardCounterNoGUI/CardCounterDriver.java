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
public class CardCounterDriver {
    
    public static void main(String args[]){
        CardCounter myGame = new CardCounter(10);
        myGame.showDeal();
        
        int valuesArray[] = myGame.countValues();
        String cardValues[] = myGame.getCardValues();
        int suiteValuesArray[] = myGame.countSuites();
        char suiteValues[] = myGame.getSuiteValues();
        
        for(int i = 0; i < valuesArray.length;i++){
            System.out.println(cardValues[i]);
            System.out.println(valuesArray[i]);
            System.out.println();
        }
        
        for(int i = 0; i < suiteValues.length;i++){
            System.out.println(suiteValues[i]);
            System.out.println(suiteValuesArray[i]);
            System.out.println();
        }
        
       
    }
    
}
