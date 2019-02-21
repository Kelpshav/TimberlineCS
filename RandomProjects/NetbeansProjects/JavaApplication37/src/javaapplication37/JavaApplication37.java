/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication37;

/**
 *
 * @author timberlinepluska
 */
public class JavaApplication37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String s = "Row, Row, Row";
        String[] sp = s.split("R|o");
        
        System.out.println(sp[0]);
        System.out.println(sp[1]);
        System.out.println(sp[2]);
    }
    
}
