/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardcounterwithgui;

import javax.swing.JFrame;

/**
 *
 * @author Pluska
 */
public class CardMain {
    
    public static void main(String args[]){

        JFrame frame = new JFrame("Card Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new CardPane());
		frame.pack();
		frame.setVisible(true);
 
    }
    
}
