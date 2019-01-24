# Project Overview
In this project, you will develop an application that creates an array of Dixie Cups.  Each Dixie Cup in the array can hold a specific number of items, which will also be stored as an array.  

# Objectives

- Write a class with a main method (DixieCupMaker).
- Write a class from which DixieCup objects can be created (DixieCup).
- Use classes from the Java standard library.
- Work with arrays
- Work with standard input and output.

# Specification

- Classes you will create: DixieCup and DixieCupMaker

# DixieCup Class

The Dixie cup class, once written, will enable you to keep track of the contents of each Dixie Cup.  You will write the following methods in the DixieCup class, 

	* public DixieCup(int i) - the constructor
	* public void addItem(String n)
	* public void removeItem(String n)
	* public String getItem(int i)
	* public void setItem(int index, String n)
	* public void swap(DixieCup b, int i1, int i2)
	* public int mostItems()
	* public int leastItems()
	* public String toString()
	* public int numItems()

You will also write the DixieCupMaker class.  This class will have a scanner that prompts the user for the number of cups.  The scanner must also prompt the user for the number of items allowed in each cup.  Finally, your scanner will prompt the user for different items, along with the Dixie cup in which to place the items.  

Once the cups are populated with items, your program will have a menu which prompts the user with the following options, 

- Change an item
- Remove an item
- Swap items
- Display the contents of a Dixie cup
- Summary of all Dixie cups
- Quit

Once the option is selected, you must collect the necessary information from the user to execute the task.  

# Your Tasks




- [ ] Begin a project in NetBeans called FindParking
- [ ] Locate the ParkingSpot class in the "stubs" folder of this project folder [https://github.com/hpluska/TimberlineCS/blob/master/APCSA/Project2/Stubs/ParkingSpot.java](https://github.com/hpluska/TimberlineCS/blob/master/APCSA/Project2/Stubs/ParkingSpot.java)
- [ ] Save the ParkingSpot class and place it in your NetBeans project folder
- [ ] Write the class called FindParking. It is the driver class, meaning, it will contain the main method.

In this class you must, 

- [ ] Create a Scanner using the standard input as follows, 

```
Scanner in = new Scanner(System.in);
```

- [ ] Your scanner should prompt the user for a String value for the amount of parking time needed in the following format, hh:mm
- [ ] Your scanner should prompt the user for a String value for the name of the car's location (for example, "Timberline HS")
- [ ] Once you have collected the necessary information from the user,  your program should generate random x and y starting coordinates for the car.  These values will range from 0 to 100 (100 not inclusive). 
- [ ] Create three ParkingSpot objects with random x and y location coordinates ranging from 0 to 100 (100 not inclusive).  You will also need to provide names for the parking spots (for example, "1st and main").  See the constructor
in the ParkingSpot class for expected parameters. 
- [ ] Change the default parking cost for two of the parking spots using the setCostPerInterval() method in the ParkingSpot class.  
	* For example if you created a parking spot called "spot1", you can set the interval using spot1.setCostPerInterval(40);
- [ ] Calculate how much it costs to park at each of the spots you created.  
	* You can get the cost to park per 10 minutes using the getCostPerInterval() method (for example, spot1.getCostPerInterval());  
	* You will need to convert the time in hh:mm to total time in minutes 
	* You will then need to figure out the total cost to park at each spot. (parking meters do not round down!)
	* The total cost will need to be converted to a String so it prints as expected (for example, $1.50);
	* Once you figure out the total cost you need to set the total cost (for example, spot1.setTotalCost("$1.50"))
		* Note: there are other ways to do the above using the NumberFormat class, but just use Strings here. 
- [ ] Calculate the distance from the driver for each spot using Manhattan geometry: 
	* for two points (x1, y1) and (x2, y2) the distance is |x1 − x2| + |y1 − y2|
	* Once you figure out the total distance you need to set the total distance (for example, spot1.setDistance(65));
- [ ] Use if statements to figure out which spot is closest, which is second closest, which is third closest. 
	* You can access the distance for each spot using the getDistance() method (for examples, spot1.getDistance());
- [ ] You will print out the locations in order from closest to farthest in a table like the one shown below, 

```

***************************************************************************************************************************
My cars location: Timberline High School     x-coordinate: 88           y-coordinate:77
***************************************************************************************************************************
Parking Spot        unit cost       total cost       x-location          y-location           distance          available
***************************************************************************************************************************
1st and main            25             $1.50             65                   45                  55               true
downtown library        30             $3.00             77                   56                  58               true
Capital building        10             $ .75             35                   85                  61               true
```






