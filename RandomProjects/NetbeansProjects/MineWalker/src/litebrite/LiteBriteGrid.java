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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
    private int clickedX, clickedY, mineCount=0;
    private int delay = 1000; //in ms
    private Timer timer;
    private int gridDimensions;
    private Color[][] pictureColors;
    private LiteBriteControls controls;
    private Color buttonColor = null;
    private boolean[][] mines;
    private boolean[][] locatedMines;
    private ImageIcon flag = new ImageIcon("/home/timberlinepluska/Desktop/APCSA/MineWalker/src/Images/flag.jpg");
    private Color[] buttonColors = {Color.WHITE, Color.GRAY, Color.GREEN, Color.YELLOW, Color.PINK, Color.BLUE, Color.RED, Color.BLACK};
    public void doButtonAction(int i) {
        if(i == 0){
            resetGame();
        }
    }
    
    private void resetGame(){
        for(int rows = 0; rows < mines.length; rows++){
            for(int cols = 0; cols < mines[rows].length; cols++){
                mines[rows][cols]=false;
                locatedMines[rows][cols]=false;
                tiles[rows][cols].setBackground(null);
                tiles[rows][cols].setIcon(null);
            }
        }
        
        makeMines();
    }
    
    public LiteBriteGrid(int d){
        
        gridDimensions = d;
        pictureColors = new Color[gridDimensions][gridDimensions];
        tiles = new JButton[gridDimensions][gridDimensions];
        locatedMines = new boolean[gridDimensions][gridDimensions];
        makeMines();
        setLayout(new GridLayout(gridDimensions, gridDimensions));
    	setPreferredSize(new Dimension(800, 800));
        
        for (int i=0; i<tiles.length; i++){
            for (int j=0; j<tiles[i].length; j++) {
         	tiles[i][j] = new JButton();       
         	tiles[i][j].addActionListener(this);
                tiles[i][j].addMouseListener(new rightClickListener());
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
        if(x!=0){
            if(mines[x-1][y]){
                mineCount++;
            }
        }
        if(y!=0){
            if(mines[x][y-1] && y!=0){
                mineCount++;
            }
        }
        if(x!=gridDimensions-1){
            if(mines[x+1][y]){
                mineCount++;
            }
        }
        if(y!=gridDimensions-1){
            if(mines[x][y+1]){
                mineCount++;
            }
        }
        
        if(y!=0 && x!=0){
            if(mines[x-1][y-1]){
                mineCount++;
            }
        }
        
        if(x!=gridDimensions-1 && y!=gridDimensions-1){
            if(mines[x+1][y+1]){
                mineCount++;
            }
        }
        if(x!=gridDimensions-1 && y!=0){
            if(mines[x+1][y-1]){
                mineCount++;
            }
        }
        if(x!=0 && y!=gridDimensions-1){
            if(mines[x-1][y+1]){
                mineCount++;
            }
        }
        
        
        tiles[x][y].setBackground(buttonColors[mineCount]);
        mineCount = 0;
        
        
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        clicked = (JButton) e.getSource();
        locateClicked(clicked);
        paintTiles(clickedX, clickedY);
        checkForMine(clickedX, clickedY);
        
    }
    
    public void makeMines(){
        mines = new boolean[gridDimensions][gridDimensions];
        for(int rows = 0; rows < tiles.length; rows++){
            for(int cols = 0; cols < tiles[rows].length;cols++){
                int percentMines = (int)(Math.random()*100);
                if(percentMines>80){
                      mines[rows][cols] = true;
                }
            }
         
        }

    }
    
    
    public void showMines(){
        
        for(int rows = 0; rows < tiles.length; rows++){
            for(int cols = 0; cols < tiles[rows].length; cols++){
                if(mines[rows][cols]){
                    tiles[rows][cols].setBackground(Color.RED);
                }
            }
        }
    }
    
    public void checkForMine(int MineX, int MineY){
        
        if(mines[MineX][MineY]){
            System.out.println("You lose");
            showMines();
        }
        System.out.println("Keep playing");
    }
    
    
    public void identifyMines(int MineX, int MineY){
        if(!locatedMines[MineX][MineY]){
            tiles[MineX][MineY].setIcon(flag);
            locatedMines[MineX][MineY]=true;
        }else{
            tiles[MineX][MineY].setIcon(null);
            locatedMines[MineX][MineY]=false;
        }

    }
    
    private boolean isDone(){
        for(int rows = 0; rows < mines.length; rows++){
            for(int cols = 0; cols < mines[rows].length; cols++){
                if(mines[rows][cols]!=locatedMines[rows][cols]){
                    return false;
                }
            }
        }
        return true;
    }
    
    private class rightClickListener  extends MouseAdapter
    {
        public void mouseClicked (MouseEvent e) 
        {       			// write here your event handling code
            if (e.getModifiers() == MouseEvent.BUTTON3_MASK)
            {
                //System.out.println(e.getSource());
                locateClicked((JButton) e.getSource());
                identifyMines(clickedX, clickedY);
                if(isDone()){
                   System.out.println("YOU WIN!"); 
                }
                
                
            }
        }
    } 
    
}