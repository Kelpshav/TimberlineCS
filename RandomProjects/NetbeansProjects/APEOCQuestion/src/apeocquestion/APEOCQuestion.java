/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apeocquestion;

/**
 *
 * @author timberlinepluska
 */
public class APEOCQuestion {
    static int a = 1, b = 2;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Position p = new Position(1,2);
        swap(p);
        System.out.println(a);
        
    }
    
    public static void swap(Position pair){
        int temp = pair.getFirst();
        pair.setFirst(pair.getSecond());
        pair.setSecond(temp);
    }
    
}
