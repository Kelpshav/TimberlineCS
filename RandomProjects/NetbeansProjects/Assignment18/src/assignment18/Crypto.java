/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment18;

/**
 *
 * @author timberlinepluska
 */
public class Crypto {
    
    public String encrypt(String sntnc){
        
        String finalSntnc = "";
        
        for(int j = 0; j < sntnc.length();j++){
            
            char nextChar = sntnc.charAt(j);
            
            switch(nextChar){
                case 'i':
                case 'I':
                {
                    finalSntnc = finalSntnc + "pee!";
                    break;
                }
                case 'e':
                case 'E':
                {
                    finalSntnc = finalSntnc + "e\'ew";
                    break;
                }
                default:
                {
                    finalSntnc = finalSntnc + nextChar;
                }
            }
      
        }//end for
        
        return finalSntnc;
    }//end method
        
    public String decrypt(String encryptSntnc){
        
        encryptSntnc = encryptSntnc.replace("pee!", "i");
        encryptSntnc = encryptSntnc.replace("pee!", "I");
        encryptSntnc = encryptSntnc.replace("e\'ww", "e");
        
        return encryptSntnc;
        
    }
    
    
}
