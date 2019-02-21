/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment18;

import java.util.Scanner;

/**
 *
 * @author timberlinepluska
 */
public class Assignment18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String s = "The weather outside is frighting!";
        String m = "he";
        int j = 3, z = 99;
        
        //Number 1
        //Part a
        int k = s.indexOf(m);
        System.out.println(k);  
        
        //part b
        k = s.indexOf(m, j);
        System.out.println(k);
        
        //part c
        String str = s.replace('e', 'o');
        System.out.println(str);
        
        //part d
        k = s.lastIndexOf(m, j + 3);
        System.out.println("Part d "+ k);
        
        //part e
        char p = s.charAt(7);
        System.out.println(p);
        
        //part f
        System.out.println(s.compareTo("E"));
        
        //part g
        System.out.println(s.compareTo("I"));
        
        //part h
        boolean b = s.contains("win");
        System.out.println(b);
        
        //part i
        String s2 = " JAVA ";
        System.out.println("X" + s2.trim() + "X");
        
        //Number 2
        Scanner sc = new Scanner("Let it snow, let it snow, let it snow!");
        
        //part a
        sc.useDelimiter(",\\s");
        System.out.println(sc.next());
        System.out.println(sc.next());
        
        //part b
        sc.useDelimiter("sn");
        System.out.println(sc.next());
        System.out.println(sc.next());
        
        //Number 3
        Scanner kbReader = new Scanner(System.in);
        System.out.println("Enter a sentence that is to be encrypted");
        String sntnc = kbReader.nextLine();
        System.out.println("Original sentence = " + sntnc);
        
        Crypto myCryptObj = new Crypto();
        String encryptSntnc = myCryptObj.encrypt(sntnc);
        System.out.println("Encrypted sentence = " + encryptSntnc);
        
        String decryptSntnc = myCryptObj.decrypt(encryptSntnc);
        System.out.println("Decrypted sentence = " + decryptSntnc);
    }
    
}
