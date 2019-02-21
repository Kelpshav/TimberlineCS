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
public class A17Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Problem 1
        MoonRock myRock = new MoonRock(3, "Xeon");
        MoonRock yourRock = new MoonRock(2, "Kyptonite");
        MoonRock ourRock = new MoonRock(3, "Xeon");
        MoonRock theRock;
        theRock = ourRock;
        
        //Part a
        System.out.println(theRock.equals(ourRock));

        
        //Part b
        System.out.println(theRock.equals(yourRock));
        
        //Part c
        System.out.println(theRock.equals(myRock));
        
        //Part d
        System.out.println("MemMyRock =  " + myRock);
        System.out.println("MemourRock = " + ourRock);
        System.out.println(myRock == ourRock);
        
        //Part e
        System.out.println(myRock.equals(yourRock));
        
        //Problem 2
        Weenie oscarMayer = new Weenie();
        
        //part a
        //int zz = oscarMayer.method1(4);//A string cannot be assigned to an int
        
        //part b
        //oscarMayer.method2("Hello");//method2 is private
        
        //part c
        //int cv = oscarMayer.method3();
        
        //part d 
        //int cv = oscarMayer.method3(14);//no parameter allowed
        
        //part e
        //oscarMayer.z = "hotdog";//z is private
        
        //part f
        //method2("BarBQ");//no object specified, also private
        
        
        //Problem 3
        Automobile myBMW = new Automobile(24);
        myBMW.fillUp(20);
        myBMW.takeTrip(100.0);
        double fuel_left = myBMW.reportFuel();
        System.out.println("Fuel Left: " + fuel_left);
       
        
    }
    
}
