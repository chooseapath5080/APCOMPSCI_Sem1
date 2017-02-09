import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class ToyStore
{
	private ArrayList <Toy> toyList;
	
	public ToyStore()
	{
		toyList = new ArrayList<>();
	}
	
	public ToyStore(String ts)
	{
		loadToys(ts);
	}
	
	public void loadToys(String ts)
	{
		
		System.out.println("");
		
		ArrayList <String> toys = new ArrayList(Arrays.asList(ts.split(",")));
		for(int i = 0; i <= toys.size(); i++)
		{
			String name = toys.get(i);
			String type = toys.get(i+1);
			Toy object = getThatToy(name);
			
			if(object == null)
			{
				if(type.equals("Car"))
					toyList.add(new Car(name));
				else
					toyList.add(new AFigure(name));
			}	
			else
				object.setCount(1);
		}
		
	}
	
	public Toy getThatToy(String nm)
	{
		for(Toy ts: toyList)
		{
			if(ts.getName().equals(nm))
			{
				return ts;
			}
		}
		
				return null;
	}
	
	public String getMostFrequentToy(String nm)
	{
		String name;
		int max = Integer.MIN_VALUE;
		for(Toy ts : toyList)
		{
			if(max < ts.getCount())
			{
				max = ts.getCount();
				name = ts.getName();
			}
		}
		return nm;
	}
	
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		for(Toy ts : toyList)
		{
			if(ts.getType().equals("Car"))
				cars ++;
			if(ts.getType().equals("AF"))
				figures ++;
		}
		
		if(cars > figures)
			return "Cars";
		if(figures > cars)
			return "Action Figures";
		else
			return "Equal amounts of action figures and cars!";
	}
	
	public String toString()
	{
		return ""+toyList;
	}
}