/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;


import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.System.console;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author timberlinepluska
 */
public class BattleShipGrid extends JPanel implements ActionListener{
    
    private JButton[][] tiles;
    private JButton clicked;
    private int gridDimensions, clickedX, clickedY, hits=0, misses=0, sunk;
    private boolean[][] shipGrid;
    private Ship[] shipArray;
    
    public BattleShipGrid(){
        
        //do{

        //System.out.println("Enter the grid size (must be greater than 10)");
        //Scanner sc = new Scanner(System.in);
        //gridDimensions = sc.nextInt();
        //}while(gridDimensions < 11);
        
        gridDimensions = 12;
        
        tiles = new JButton[gridDimensions][gridDimensions];
        shipGrid = new boolean[gridDimensions][gridDimensions];
        
        setLayout(new GridLayout(gridDimensions, gridDimensions));
    	setPreferredSize(new Dimension(400, 400));
        
        for (int i=0; i<tiles.length; i++){
            for (int j=0; j<tiles[i].length; j++) {
         	tiles[i][j] = new JButton();       
         	tiles[i][j].addActionListener(this);
         	add(tiles[i][j]);
            }
        }
        
        makeShips();
        
    }
    
    public void makeShips(){
        
        shipArray = new Ship[5];
        
        shipArray[0] = new Ship(5);
        shipArray[1] = new Ship(4);
        shipArray[2] = new Ship(3);
        shipArray[3] = new Ship(3);
        shipArray[4] = new Ship(2);
        
        for(int i = 0; i < shipArray.length; i++){
            //int direction = 0;
            int direction = (int)(Math.random()*2);//0=down, 1=across
            Point shipLocation[] = new Point[shipArray[i].getSquares()];
            
            //BEGIN ACROSS
            if(direction == 0){

                int shipRow = 0;
                int shipCol = 0;
                int availableSquares = 0;
                boolean canPlaceShip = false;
                while(!canPlaceShip){
                    shipRow = (int)(Math.random()*gridDimensions-1);
                    shipCol = (int)(Math.random()*gridDimensions-1);
                    
                    if(shipCol >= shipArray[i].getSquares() && shipCol < (gridDimensions - shipArray[i].getSquares())){
                        for(int loc = shipCol; loc<shipCol+shipArray[i].getSquares();loc++){
                            if(shipGrid[shipRow][loc]==true){
                                availableSquares = 0;
                            }else{
                                availableSquares++;
                            }
                        }//end for loop
                        if(availableSquares >=shipArray[i].getSquares()){
                            canPlaceShip = true;
                            for(int j = 0; j < shipArray[i].getSquares();j++){
                                shipGrid[shipRow][shipCol+j] = true;
                                shipLocation[j] = new Point(shipRow,shipCol+j);
                                //tiles[shipRow][shipCol+j].setBackground(Color.red);
                            }
                            
                            shipArray[i].setShip(shipLocation);

                        }
                        
                    }

                }
            
            }else if(direction == 1){//going down
                int shipRow = 0;
                int shipCol = 0;
                int availableSquares = 0;
                boolean canPlaceShip = false;
                while(!canPlaceShip){
                    shipRow = (int)(Math.random()*gridDimensions-1);
                    shipCol = (int)(Math.random()*gridDimensions-1);
                    
                    if(shipRow >= shipArray[i].getSquares() && shipRow < (gridDimensions - shipArray[i].getSquares())){
                        for(int loc = shipRow; loc<shipRow+shipArray[i].getSquares();loc++){
                            if(shipGrid[loc][shipCol]==true){
                                availableSquares = 0;
                            }else{
                                availableSquares++;
                            }
                        }//end for loop
                        if(availableSquares >=shipArray[i].getSquares()){
                            canPlaceShip = true;
                            for(int j = 0; j < shipArray[i].getSquares();j++){
                                shipGrid[shipRow+j][shipCol] = true;
                                shipLocation[j] = new Point(shipRow+j,shipCol);
                                //tiles[shipRow+j][shipCol].setBackground(Color.black);
                            }
                            shipArray[i].setShip(shipLocation);
                        }
                        
                    }

                }
                
            }//end if statement

        }//end for loop

    }
    
    public void checkHit(int xLoc, int yLoc){
        
        if(shipGrid[xLoc][yLoc]){

            //find out which ship is hit
            for(int s = 0; s < shipArray.length;s++){
                Point tempShip[] = shipArray[s].getShipLocation();

                for(int rows = 0; rows < tempShip.length;rows++){
                    if((int)tempShip[rows].getX() == xLoc && (int)tempShip[rows].getY() == yLoc){
                        System.out.println("You hit ship " + s);
                        shipArray[s].isHit();
                        hits++;
                        tiles[xLoc][yLoc].setBackground(Color.red);
                        if(shipArray[s].isSunk()){
                            sunk++;
                            System.out.println("SUNK boat " + sunk + " of " + shipArray.length);
                            if(sunk == shipArray.length){
                                System.out.println("You win!");
                                System.out.println("total shots = " + (hits + misses));
                                System.out.println("total misses = " + misses);
                                System.out.println("total hits = " + hits);
                                System.out.println("percent hits = " + (int)(((double)hits/(double)(hits+misses))*100) + "%");
                            }
                        }
                        
                    }
                    
                }

            }//end for shipArray
        }else{
            misses++;
            tiles[xLoc][yLoc].setBackground(Color.white);
        }
        
    }
    
    public void locateClicked(JButton b){
        for(int rows = 0; rows < tiles.length; rows++){
            for(int cols = 0; cols < tiles[rows].length; cols++){
                if(b == tiles[rows][cols]){
                
                clicked = b;
                clickedX = rows;
                clickedY = cols;
                }
            }
        }
    }    

    @Override
    public void actionPerformed(ActionEvent e) {
        clicked = (JButton) e.getSource();
        locateClicked(clicked);
        checkHit(clickedX, clickedY);
        
    }
    
}
