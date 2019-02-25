/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author timberlinepluska
 */
public class BattleShip extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                JFrame frame = new JFrame("Battle Ship");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new BattleShipPane());
		frame.pack();
		frame.setVisible(true);
    }
    
   
    
    
}
