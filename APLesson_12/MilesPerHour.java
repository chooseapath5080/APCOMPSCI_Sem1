import java.lang.Math.*;
public class MilesPerHour
{
	//instance variables
	private int distance, hours, minutes;
	private double mph;
	
	//default constructor
	public MilesPerHour()
	{
		//default values for instance vars
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	
	//Constructor with params
	public MilesPerHour(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
		mph = 0;
	}
	
	//Modifier
	public void setValues(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
		mph = 0;
	}
	
	//Accessors
	public double getMPH()
	{
		mph = Math.round(distance / ( hours + minutes / 60.0));
		return mph;
	}
	
		public int getDistance()
	{
		return distance;
	}
	
		public int getHours()
	{
		return hours;
	}
}