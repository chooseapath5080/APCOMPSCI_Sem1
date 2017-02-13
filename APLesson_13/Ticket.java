public class Ticket
{
	private double price;
	
	public Ticket()
	{
		price = 0;
	}
	
	public int getSerialNo()
	{
		return (int)(Math.random()*10000000) + 1;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public String toString()
	{
		return "Serial #: " + getSerialNo() + "\n" + "Price: " + getPrice();
	}
}