/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examsets1112;

import java.util.Scanner;

/**
 *
 * @author timberlinepluska
 */
public class ExamSets1112 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //number 1     
        Scanner kbInput = new Scanner(System.in);
        System.out.println("Type a message to encode");
        String c1 = kbInput.nextLine();
        String e1 = "";
        
        for(int i = 0;i < c1.length();i++){
            
            e1 = (int)c1.charAt(i) + "" + e1;
            
            
        }
        System.out.println(e1);
        //number 2a
        char c;
        for(int j = 97; j<100;j++){
            c = (char)(j-32);
            
            System.out.print(c + ",");//PRINTS A, B, C,
        }
        //number 2b
        String s = "Alfred E. Neuman";
        char ch;
  
        for(int x = 0; x < s.length(); x++){
            ch = s.charAt(x);

            if(ch == 65)//finds the upper case A
                ch = (char)(ch+32);//converts upper case A to lower case a
            
            System.out.print(ch + ",");
            //prints a, l, f, r, e, d, E, ., , N, e, u, m, a, n
            
        }
        
        
        
        
        
    }
    
}
