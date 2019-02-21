/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.awt.Point;

/**
 *
 * @author timberlinepluska
 */
public class Ship {
    private int squares, hits = 0;
    private Point[] shipLocation;
    
    public Ship(int s){
        squares = s;
    }
    
    public boolean isSunk(){
        if(hits == squares){
            return true;
        }
        return false;
    }
    
    
    public void isHit(){
        hits++;
        isSunk();        
    }
    
    public int getSquares(){
        return squares;
    }
    
    public void setShip(Point[] location){
        shipLocation = location;
    }
    
    public Point[] getShipLocation(){
        return shipLocation;
    }
    
}
