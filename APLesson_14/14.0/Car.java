import java.util.Arrays;
public class Car implements Location
{
	private static double [] location;
	public final static int ID;
	
	public static void Car()
	{
		location = new double[2];
	}
	
	public static void move(double x, double y)
	{
		location[0] += x;
		location[1] += y;
	}
	
	public int getID(int ID)
	{
		ID = (int)(Math.random()*1000000)+1;
		return ID;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}