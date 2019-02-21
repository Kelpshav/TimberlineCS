package gridpractice;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.BevelBorder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timberlinepluska
 */
public class GridPane extends JPanel implements ActionListener {
    private JButton[][] tiles;
    private JButton oldTile;
    public int n, currentX, currentY, monsterX, monsterY;
    private Color currentColor = Color.lightGray;
    private Color blinkingColor = Color.yellow;
    private int delay = 500; //in ms
    private Timer timer;
    
    public GridPane(int n){
        this.n = n;

        tiles = new JButton[n][n];
        setLayout(new GridLayout(n, n));
    	setPreferredSize(new Dimension(800, 800));
        
        for (int i=0; i<tiles.length; i++){
            for (int j=0; j<tiles[i].length; j++) {
         	tiles[i][j] = new JButton();       
         	tiles[i][j].addActionListener(this);
         	add(tiles[i][j]);
            }
        }
        
        startAnimation();
  
    }

    public void actionPerformed(ActionEvent e) 
    {
        JButton clicked = (JButton) e.getSource();
        findLocation(clicked);
        
	
    }
    
    private void moveMonster(){
        //if((currentX == monsterX)&&(currentY == monsterY)){
            //tiles[currentX][monsterY].setText("GRRRR");
        //}
        monsterX = (int)(Math.random()*n);
        monsterY = (int)(Math.random()*n);
        
    }
    
    public void resetOldTiles(){
        for (int i=0; i < n; i++)
    		for (int j=0; j < n; j++)
    			if (tiles[i][j].getText()=="GRRRR") {
    				tiles[i][j].setText("");
    			}
    }

    private void findLocation(JButton clicked) 
    {
    	for (int i=0; i < n; i++)
    		for (int j=0; j < n; j++)
    			if (clicked == tiles[i][j]) {
    				currentX = i; currentY = j;
    			}
    }
    
    
        /**
     * Create an animation thread that runs once per second
     */
    private void startAnimation() 
    {
        TimerActionListener taskPerformer = new TimerActionListener();
		timer = new Timer(delay, taskPerformer);
		timer.start();
               
    }

    
    /**
     * Update the game display with blinking icons, scores, and status
     *
     */
    private class TimerActionListener implements ActionListener 
    {
        String msg = "GRRRR";

		@Override
		public void actionPerformed(ActionEvent arg0)
		{
                    moveMonster();
                    //resetOldTiles();
                        tiles[monsterX][monsterY].setBackground(currentColor);
                        tiles[monsterX][monsterY].setText(msg);
			if (currentColor == Color.white) {
                            currentColor = blinkingColor;
                            msg = "GRRRRR";
                        }
			else {
                            currentColor = Color.white;
                            msg= "";
                        }
                        
                        
		}
                
    }

}


