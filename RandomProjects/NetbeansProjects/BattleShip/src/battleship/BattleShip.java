/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import javax.swing.JFrame;

/**
 *
 * @author timberlinepluska
 */
public class BattleShip {

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
