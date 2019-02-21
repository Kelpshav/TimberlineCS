/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 *
 * @author timberlinepluska
 */
public class Key extends JPanel{
    
    public Key(){
    
        setLayout(new GridLayout(1,5));
    	setPreferredSize(new Dimension(800, 100));
    }
    
}
