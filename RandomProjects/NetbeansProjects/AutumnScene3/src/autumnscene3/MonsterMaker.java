/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autumnscene3;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
/**
 *
 * @author timberlinepluska
 */
public class MonsterMaker {
    
    public boolean hasEyes;
    Graphics2D g;
    public MonsterMaker(){
        
        Color green = new Color(107, 244, 66);
        g.fillOval(100,100,100,100);
    }
}
