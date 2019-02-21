/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polygonmaker;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

/**
 *
 * @author timberlinepluska
 */
public class PolygonMaker{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Square s = new Square(100, 4);
            //DO NOT EDIT BELOW
    JFrame frame = new JFrame ("My Polygon");
    frame.setSize(new Dimension(700,500));
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(s);	
    frame.setVisible(true);
    }
    
}
