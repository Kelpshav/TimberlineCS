/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketoutthedoorset24;

/**
 *
 * @author timberlinepluska
 */
public class TicketOutTheDoorSet24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int s[] = {1, 2, 3, 4, 5, 6};
        for(int g = 0; g < s.length; g++){
            System.out.print(s[g]+ " ");
        }
        
        System.out.print("\n");
        
        testMethod(s);
        
        for(int g = 0; g < s.length;g++){
            System.out.print(s[g] + " ");
        }
        
                
    }
    
    public static void testMethod(int pp[]){
        
        int len = pp.length;
        int t2[] = new int[len];
        for(int j = 0; j < len; j++){
            t2[j] = pp[len-j-1];
        }
        for(int k = 0; k < t2.length; k++){
            System.out.print(t2[k] + " ");
        }
        
        System.out.print("\n");
        pp = t2;
    }
    
}
