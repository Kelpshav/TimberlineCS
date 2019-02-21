/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gridmaker;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author pluska
 */
public class Grid extends JPanel {
    
    private JButton[][] tiles;
    private int gridDimensions;
    
    public Grid(int d){
        gridDimensions = d;
        tiles = new JButton[gridDimensions][gridDimensions];
        setLayout(new GridLayout(gridDimensions, gridDimensions));
        setPreferredSize(new Dimension(500,500));
        
        for(int row = 0; row < tiles.length; row++){
            
            for(int col = 0; col < tiles[row].length; col++){
                 tiles[row][col] = new JButton();
                //tiles[row][col].setPreferredSize(new Dimension(25,25));
                add(tiles[row][col]);
            }
                     
        //System.out.println();
        }
        
    }
    
    public void colorAllButtons(Color c){
        for(int row = 0; row < tiles.length; row++){
            
            for(int col = 0; col < tiles[row].length; col++){
                tiles[row][col].setBackground(c);
            }
        } 
        
    }
    
    
    public void checkerBoard(Color c){
        int count = 0;
        for(int row = 0; row < tiles.length; row++){
            for(int col = 0; col < tiles[row].length;col++){
                count++;
               if(count%2!=0){
                   tiles[row][col].setBackground(c);
                   System.out.println(count);
               }
            
            
            }
            if(tiles.length%2==0){
                count++;
            }
            
        }
        
    }
    
    public void verticalLines(Color c){

        for(int row = 0; row < tiles.length; row++){
            for(int col = 0; col < tiles[row].length;col+=2){
 
                   tiles[row][col].setBackground(c);

            }

        }
    }
    
    public void horizontalLines(Color c){
        
        for(int row = 0; row < tiles.length; row+=2){
            
            for(int col = 0; col < tiles[row].length;col++){
               
                   tiles[row][col].setBackground(c);

            }
        
        }
    }
    
    public void stepRight(Color c){
        
        for(int row = 0; row < tiles.length; row++){
            
            for(int col = 0; col <= row;col++){
               
                   tiles[row][col].setBackground(c);

            }
        
        }
    }
    
    public void stepLeft(Color c){
        
        for(int row = 0; row <tiles.length; row++){
            
            for(int col =0;col<=row;col++){
               
                   tiles[row][tiles.length-col-1].setBackground(c);

            }
        
        }
    }

    
    
}