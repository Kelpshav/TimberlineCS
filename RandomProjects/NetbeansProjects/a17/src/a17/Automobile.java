/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a17;

/**
 *
 * @author timberlinepluska
 */
public class Automobile {
    
    private int mpg;
    private double gallons;
    
    public Automobile(int gasMilage){
        
        mpg = gasMilage;
        gallons = 0;
        
    }
    
    public void fillUp(int gas){
        
        gallons = gallons + gas;
    }
    
    public void takeTrip(double miles){
        
        gallons = gallons - miles/mpg;
        
    }
    
    public double reportFuel(){
        
        return gallons;
    }
    
}
