/**
 * Represents a parking spot in a city.
 *
 * To create a new parking spot, you will use the Constructor. To print the
 * details of the spot, you just need to print the object.
 * <pre><code>
 * ParkingSpot spot = new ParkingSpot("Beacon St.", 1, 85);
 * System.out.println(spot);
 * </code></pre>
 *
 * @author CS121 Instructors
 * @author Pluska
 */
public class ParkingSpot
{
	private String street;
	private int locationX;
	private int locationY;
	private int distance;
	private boolean available;
	private double costPerInterval;
	private String totalCost;

	/**
	 * The minimum time interval which can be paid for.
	 */
	public final int INTERVAL = 10; // minutes

	/**
	 * The default costPerInterval for each INTERVAL minutes
	 */
	public final double DEFAULT_COST = 0.25;

	/**
	 * Constructor: creates a parking spot object with specified values.
	 * @param street is the street on which the parking spot is located
	 * @param locationX is the x (E-W) coordinate
	 * @param locationY is the Y (N-S) coordinate
	 */
	public ParkingSpot(String street, int locationX, int locationY)
	{
		this.street = street;
		this.locationX = locationX;
		this.locationY = locationY;
		available = true;
		costPerInterval = DEFAULT_COST;
	}

	/**
	 * Checks whether the parking spot is available
	 * @return true if spot is available
	 */
	public boolean isAvailable()
	{
		return available;
	}

	/**
	 * Returns the cost for one time interval
	 * @return the costPerInterval
	 */
	public double getCostPerInterval()
	{
		return costPerInterval;
	}

	/**
	 * Sets the cost for one time interval
	 * @param cost the cost for one time interval.
	 */
	public void setCostPerInterval(double cost)
	{
		this.costPerInterval = cost;
	}

	/**
	 * Sets the total cost for parking
	 * @param totalCost the total cost to park.
	 */
	public void setTotalCost(String totalCost)
	{
		this.totalCost = totalCost;
	}

	/**
	 * Sets the space to be available or not available
	 * @param available true is the parking spot is available, false otherwise
	 */
	public void setAvailable(boolean available)
	{
		this.available = available;
	}

	/**
	 * Get the street on which the parking space is located
	 * @return the street
	 */
	public String getStreet()
	{
		return street;
	}

	/**
	 * Get the east-west coordinate of the parking spot
	 * @return the locationX
	 */
	public int getLocationX()
	{
		return locationX;
	}

	/**
	 * Get the north-south coordinate of the parking spot
	 * @return the locationY
	 */
	public int getLocationY()
	{
		return locationY;
	}
	/**
	 * Sets the distance from the car 
	 * @param distance is the distance to the car
	 */
	public void setDistance(int distance)
	{
		this.distance = distance;
	}

	/**
	 * Get the distance to the parking spot
	 * @return the distance
	 */
	public int getDistance()
	{
		return distance;
	}

	/* Returns a String representation of the parking spot
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return street + "\t" + costPerInterval + "\t" + totalCost + "\t" + locationX + "\t" + locationY + "\t" + distance + "\t" + available;

	}
}