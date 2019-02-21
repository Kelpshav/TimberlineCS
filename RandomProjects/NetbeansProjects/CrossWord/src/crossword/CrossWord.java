/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crossword;

import javax.swing.JFrame;

/**
 *
 * @author timberlinepluska
 */
public class CrossWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sizeOfGrid = 400;
        
        JFrame frame = new JFrame("Cross Word Puzzle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().add(new CrossWordPane(sizeOfGrid));
	frame.pack();
	frame.setVisible(true);
    }
    
}
