import java.util.*;
import java.util.regex.Pattern; //credit: blog.liveedu.tv/java-split-string/
/**
 * Project 2: FindParking
 *
 * Organizes parking spots based off the distance from the parking spot to your car.
 *
 * @author Pluska
 * @author Hannah Kim
 */
public class FindParking {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.println("String value for amount of parking time needed in hh:mm");
    String time = in.nextLine();

    System.out.println("String name for name of car's location");
    String location = in.nextLine();


    int firstX = (int) (Math.random() * 100);
    int firstY = (int) (Math.random() * 100);

    System.out.println("*****************************************************************************************************");
    System.out.println("My car's location: " + location + "\t" + "x-coordinate: " + firstX + "\t" + "y-coordinate " + firstY);
    System.out.println("*****************************************************************************************************");
    System.out.println("Parking Spot" + "\t" + "Unit Cost" + "\t" + "Total Cost" + "\t" + "x-location" + "\t" + "y-location" + "\t" + "Distance" + "\t" + "Available");
    System.out.println("*****************************************************************************************************");


    ParkingSpot Spot1 = new ParkingSpot("1st and Main    ", (int) (Math.random() * 100), (int) (Math.random() * 100));
    ParkingSpot Spot2 = new ParkingSpot("Downtown Library", (int) (Math.random()) * 100, (int) (Math.random() * 100));
    ParkingSpot Spot3 = new ParkingSpot("Capitol Building", (int) (Math.random() * 100), (int)(Math.random() * 100));

    Spot1.setCostPerInterval(12);
    Spot2.setCostPerInterval(25);

    String[] splitTime = time.split(Pattern.quote(":"));  //credit: blog.liveedu.tv/java-split-string/

    String hours = (splitTime[0]);
    int hoursToMin = (Integer.parseInt(hours)) * 60; //credit: www.mkyong.com/java/java-convert-string-to-int/  converting hours to minutes

    String min = splitTime[1];
    int minutes = Integer.parseInt(min); // hh:mm this is the mm

    int totalTime = (hoursToMin + minutes);

    double total1 = Math.ceil(Spot1.getCostPerInterval()) * totalTime;
    String totalCost1 = ("$" + total1);
    Spot1.setTotalCost(totalCost1); //total cost of parking spot 1

    double total2 = Math.ceil(Spot2.getCostPerInterval()) * totalTime;
    String totalCost2 = ("$" + total2);
    Spot2.setTotalCost(totalCost2);// total cost of parking spot 2

    double total3 = Math.ceil(Spot3.getCostPerInterval()) * totalTime;
    String totalCost3 = ("$" + total3);
    Spot3.setTotalCost(totalCost3);// total cost of parking spot 3

    double getX1 = Spot1.getLocationX();
    double getX2 = Spot2.getLocationX();
    double getX3 = Spot3.getLocationX();

    double getY1 = Spot1.getLocationY();
    double getY2 = Spot2.getLocationY();
    double getY3 = Spot3.getLocationY();

    double distance1 = (Math.abs(firstX - getX1)) + (Math.abs(firstY - getY1)); // distance from car to spot 1
    Spot1.setDistance((int) distance1);
    double distance2 = (Math.abs(firstX - getX2)) + (Math.abs(firstY - getY2)); // distance from car to spot 2
    Spot2.setDistance((int) distance2);
    double distance3 = Math.abs(firstX - getX3) + (Math.abs(firstY - getY3)); // distance from car to spot 3
    Spot3.setDistance((int) distance3);

    int d1 = Spot1.getDistance();
    int d2 = Spot2.getDistance();
    int d3 = Spot3.getDistance();

  //ordering the parking spots by distances
    if (d1 < d2 && d1 < d3) {
      System.out.println(Spot1.getStreet() + "\t" + Spot1.getCostPerInterval() + "\t\t" + totalCost1 + "\t\t" + Spot1.getLocationX() + "\t\t\t" + Spot1.getLocationY() + "\t\t\t" + Spot1.getDistance() + "\t\t" + Spot1.isAvailable());
      if (d2 < d3) {
        System.out.println(Spot2.getStreet() + "\t" + Spot2.getCostPerInterval() + "\t\t" + totalCost2 + "\t\t" + Spot2.getLocationX() + "\t\t\t" + Spot2.getLocationY() + "\t\t\t" + Spot2.getDistance() + "\t\t" + Spot2.isAvailable());
        System.out.println(Spot3.getStreet() + "\t" + Spot3.getCostPerInterval() + "\t\t" + totalCost3 + "\t\t" + Spot3.getLocationX() + "\t\t\t" + Spot3.getLocationY() + "\t\t\t" + Spot3.getDistance() + "\t\t" + Spot3.isAvailable());
      } else if (d3 < d2) {
        System.out.println(Spot3.getStreet() + "\t" + Spot3.getCostPerInterval() + "\t\t" + totalCost3 + "\t\t" + Spot3.getLocationX() + "\t\t\t" + Spot3.getLocationY() + "\t\t\t" + Spot3.getDistance() + "\t\t" + Spot3.isAvailable());
        System.out.println(Spot2.getStreet() + "\t" + Spot2.getCostPerInterval() + "\t\t" + totalCost2 + "\t\t" + Spot2.getLocationX() + "\t\t\t" + Spot2.getLocationY() + "\t\t\t" + Spot2.getDistance() + "\t\t" + Spot2.isAvailable());
      }
    }

    if (d2 < d1 && d2 < d3) {
      System.out.println(Spot2.getStreet() + "\t" + Spot2.getCostPerInterval() + "\t\t" + totalCost2 + "\t\t" + Spot2.getLocationX() + "\t\t\t" + Spot2.getLocationY() + "\t\t\t" + Spot2.getDistance() + "\t\t" + Spot2.isAvailable());
      if (d1 < d3) {
        System.out.println(Spot1.getStreet() + "\t" + Spot1.getCostPerInterval() + "\t\t" + totalCost1 + "\t\t" + Spot1.getLocationX() + "\t\t\t" + Spot1.getLocationY() + "\t\t\t" + Spot1.getDistance() + "\t\t" + Spot1.isAvailable());
        System.out.println(Spot3.getStreet() + "\t" + Spot3.getCostPerInterval() + "\t\t" + totalCost3 + "\t\t" + Spot3.getLocationX() + "\t\t\t" + Spot3.getLocationY() + "\t\t\t" + Spot3.getDistance() + "\t\t" + Spot3.isAvailable());
      } else if (d3 < d1) {
        System.out.println(Spot3.getStreet() + "\t" + Spot3.getCostPerInterval() + "\t\t" + totalCost3 + "\t\t" + Spot3.getLocationX() + "\t\t\t" + Spot3.getLocationY() + "\t\t\t" + Spot3.getDistance() + "\t\t" + Spot3.isAvailable());
        System.out.println(Spot1.getStreet() + "\t" + Spot1.getCostPerInterval() + "\t\t" + totalCost1 + "\t\t" + Spot1.getLocationX() + "\t\t\t" + Spot1.getLocationY() + "\t\t\t" + Spot1.getDistance() + "\t\t" + Spot1.isAvailable());
      }
    }

    if (d3 < d2 && d3 < d1) {
      System.out.println(Spot3.getStreet() + "\t" + Spot3.getCostPerInterval() + "\t\t" + totalCost3 + "\t\t" + Spot3.getLocationX() + "\t\t\t" + Spot3.getLocationY() + "\t\t\t" + Spot3.getDistance() + "\t\t" + Spot3.isAvailable());
      if (d1 < d2) {
        System.out.println(Spot1.getStreet() + "\t" + Spot1.getCostPerInterval() + "\t\t" + totalCost1 + "\t\t" + Spot1.getLocationX() + "\t\t\t" + Spot1.getLocationY() + "\t\t\t" + Spot1.getDistance() + "\t\t" + Spot1.isAvailable());
        System.out.println(Spot2.getStreet() + "\t" + Spot2.getCostPerInterval() + "\t\t" + totalCost2 + "\t\t" + Spot2.getLocationX() + "\t\t\t" + Spot2.getLocationY() + "\t\t\t" + Spot2.getDistance() + "\t\t" + Spot2.isAvailable());
      } else if (d2 < d1) {
        System.out.println(Spot2.getStreet() + "\t" + Spot2.getCostPerInterval() + "\t\t" + totalCost2 + "\t\t" + Spot2.getLocationX() + "\t\t\t" + Spot2.getLocationY() + "\t\t\t" + Spot2.getDistance() + "\t\t" + Spot2.isAvailable());
        System.out.println(Spot1.getStreet() + "\t" + Spot1.getCostPerInterval() + "\t\t" + totalCost1 + "\t\t" + Spot1.getLocationX() + "\t\t\t" + Spot1.getLocationY() + "\t\t\t" + Spot1.getDistance() + "\t\t" + Spot1.isAvailable());
      }
    }

  }
}







