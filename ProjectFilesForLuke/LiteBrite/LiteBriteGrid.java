/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package litebrite;


import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.System.console;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author timberlinepluska
 */
public class LiteBriteGrid extends JPanel implements ActionListener {
    
    private JButton[][] tiles;
    private JButton clicked;
    private int clickedX, clickedY;
    private int delay = 1000; //in ms
    private Timer timer;
    private int gridDimensions;
    private Color[][] pictureColors;
    private LiteBriteControls controls;
    private Color buttonColor = Color.red;

    public void setButtonColor(Color newButtonColor) {
        buttonColor = newButtonColor;
    }
    
    public LiteBriteGrid(int d){
        
        gridDimensions = d;
        pictureColors = new Color[gridDimensions][gridDimensions];
        tiles = new JButton[gridDimensions][gridDimensions];
        setLayout(new GridLayout(gridDimensions, gridDimensions));
    	setPreferredSize(new Dimension(800, 800));
        
        for (int i=0; i<tiles.length; i++){
            for (int j=0; j<tiles[i].length; j++) {
         	tiles[i][j] = new JButton();       
         	tiles[i][j].addActionListener(this);
         	add(tiles[i][j]);
            }
        }

    }
    

    private void locateClicked(JButton c){
        
        for(int rows = 0; rows < tiles.length; rows++){
            for(int cols = 0; cols < tiles[rows].length; cols++){
                if(c == tiles[rows][cols]){
                
                clicked = c;
                clickedX = rows;
                clickedY = cols;
                }
            }
        }
        
    }
    
    private void paintTiles(int x, int y){
        
        tiles[x][y].setBackground(buttonColor);
        tiles[x + 1][y + 1].setBackground(buttonColor);
        tiles[x - 1][y - 1].setBackground(buttonColor);
        tiles[x + 1][y - 1].setBackground(buttonColor);
        tiles[x - 1][y + 1].setBackground(buttonColor);
        tiles[x][y + 1].setBackground(buttonColor);
        tiles[x][y - 1].setBackground(buttonColor);
        tiles[x+1][y].setBackground(buttonColor);
        tiles[x-1][y].setBackground(buttonColor);
        
    }
    int redTiles = 0;
    public void countTiles(){
        for(int rows = 0; rows < tiles.length; rows++){
            for(int cols = 0; cols < tiles[rows].length;cols++){
                if(tiles[rows][cols].getBackground().getRGB()==-65536){
                      redTiles++;
                }
            }
        }
        System.out.println(redTiles);
        redTiles= 0;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        clicked = (JButton) e.getSource();
        locateClicked(clicked);
        paintTiles(clickedX, clickedY);
        countTiles();
        
    }
    
}