/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication32;

/**
 *
 * @author timberlinepluska
 */
public class JavaApplication32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] c = {1, 2, 3, 4};
        String ss = ">>>";
        int len = ss.length();
        for(int j = 0; j < len; j++){
            ss+=c[j];
        }
        System.out.println(ss);
    }
    
}
