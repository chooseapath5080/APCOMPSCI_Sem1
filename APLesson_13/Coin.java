public class Coin extends Money
//coin is a subclass of the superclass Money
{
	private double weight;
	
	public Coin()
	{
		super();
		this.weight=0;
	}
	
	public Coin(String n, double w, double v)
	{
		super(n, v);
		this.weight = w;
	}
	
	public String scan()
	{
		return weight;
	}
	public String toString()
	{
		return "Weight: "+weight+"g\n"+
				super.toString();
	}
}