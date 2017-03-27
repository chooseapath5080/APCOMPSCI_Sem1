import java.util.Arrays;
public class GMC implements Location
{
	private double x, y;
	
	public GMC()
	{
		x = 0;
		y = 0;
	}
	
	public GMC(double x1, double y1)
	{
		x = x1;
		y = y1;
	}
	
	public int getID()
	{
		return (int)(Math.random()*1000000)+1;
	}
	
	public void move(double x1, double y1)
	{
		x = x1;
		y = y1;
	}
	
	public double [] getLoc()
	{
		double [] loc = new double[2];
		loc[0] = x;
		loc[1] = y;
		return loc;
	}
}