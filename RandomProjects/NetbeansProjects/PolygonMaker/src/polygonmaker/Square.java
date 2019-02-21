/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polygonmaker;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author timberlinepluska
 */
public class Square extends Polygon {
    Graphics2D g;
    public Square(int sides, int length){
        super(100);
        
        //g = (Graphics2D) g0;
       //g.drawRect(100, 100, 100, 100);
        
    }
    
    public void paint(Graphics g0) {
    g = (Graphics2D) g0;
    g.drawRect(100, 100, 100, 100);
    }

    
    
    

    
    
}
