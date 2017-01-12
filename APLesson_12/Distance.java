import java.lang.Math.*;
public class Distance
{
	//instance variables
	private int xOne, yOne, xTwo, yTwo;
	private double distance;
	
	//default constructor
	public Distance()
	{
		//default values for instance vars
		xOne = 0;
		xTwo = 0;
		yOne = 0;
		yTwo = 0;
		distance = 0;
	}
	
	//Constructor with params
	public Distance(int x1, int x2, int y1, int y2)
	{
		xOne = x1;
		xTwo = x2;
		yOne = y1;
		yTwo = y2;
		distance = 0;
	}
	
	//Modifier
	public void setValues(int x1, int x2, int y1, int y2)
	{
		xOne = x1;
		xTwo = x2;
		yOne = y1;
		yTwo = y2;
		distance = 0;
	}
	
	//Accessors
	public double getDist()
	{
		distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
		return distance;
	}
	
}

