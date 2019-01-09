/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package monstermash;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.System.console;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author timberlinepluska
 */
public class MonsterGrid extends JPanel implements ActionListener {
    
    private JButton[][] tiles;
    private JButton monster;
    private int gridDimensions, monsterX, monsterY, deadMonsters = 0;
    boolean active;
    private int delay = 1000; //in ms
    private Timer timer;
    private boolean[] monsters;
    private ImageIcon image;
    private String images[] = {"ghost.jpeg", "tyrannosaurus.png", "Blue-Monster-icon.png"};
    
    public MonsterGrid(int d, int m){
        monsters = new boolean[m];
        gridDimensions = d;
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
        startAnimation();
    }
    
    /**
     * Create an animation thread 
     */
    private void startAnimation() 
    {
        TimerActionListener taskPerformer = new TimerActionListener();
	timer = new Timer(delay, taskPerformer);
	timer.start();
               
    }
    
    private void moveMonsters(){
            monsterX = (int)(Math.random()*gridDimensions);
            monsterY = (int)(Math.random()*gridDimensions);
    }
    
    private void checkMonsters(String text){
        
        monsters[Integer.parseInt(text)] = true;
        deadMonsters++;
        if(deadMonsters == monsters.length){
            System.out.println("YOU WIN!"); 
        }
    }
        
    /**
     * Update the game display with blinking icons, scores, and status
     *
     */
    
    private class TimerActionListener implements ActionListener 
    {
		@Override
		public void actionPerformed(ActionEvent arg0)
		{   
			if (!active) {
                            active = true;
                            for(int i = 0; i < monsters.length; i++){
                            
                                moveMonsters();
                                if(monsters[i] == false){
                                image = new ImageIcon("/images/" + images[i]);
                                tiles[monsterX][monsterY].setIcon(image);
                                tiles[monsterX][monsterY].setSelected(true);
                                tiles[monsterX][monsterY].setText(i+"");//Probably not the best fix for keeping track of the images clicked
                                
                                }
  
                            }
                        }
			else {
                            active= false;
                            for(int row = 0; row < tiles.length; row++){
                                for(int col = 0; col < tiles[row].length; col++){
                                    tiles[row][col].setIcon(null);
                                    tiles[row][col].setSelected(false);
                                    tiles[row][col].setText("");
                                }
                            }
                        }    
		}
                
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();
       
        if(clicked.isSelected()){
            checkMonsters(clicked.getText());
            
        }else{
            System.out.println("Missed");
        }
        
    }
    
}
