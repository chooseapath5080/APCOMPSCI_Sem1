import java.util.Arrays;
public class Toyota extends Car
{
	public Toyota(String l)
	{
		location = new double[2];
		String[] c = l.split(", ");
		location[0] = Double.parseDouble(c[0]);
		location[1] = Double.parseDouble(c[1]);
	}
}