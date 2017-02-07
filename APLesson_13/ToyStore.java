import java.util.Scanner;
public class ToyStore
{
	private ArrayList <toyList> inventory;
	
	public ToyStore()
	{
		inventory = new ArrayList<>();
	}
	
	public ToyStore(String ts)
	{
		loadToys(ts);
	}
	
	public static void loadToys(String ts)
	{
		Scanner.kb = new Scanner(System.in);
		System.out.println("");
		
		String ArrayList<toyList> toys = new ArrayList(Arrays.aslist(ts.split(",")));
		for(int i = 0; i <= toys.size(); i++)
		{
			String name = toys.get(i);
			String type = toys.get(i+1);
			public Toy()
			{
				return getThatToy(name);
			}
		}
		if()
			
		else
			count = 1;
		
	}
	
	public static void getThatToy(String nm)
	{
		for(String ts: toyList)
		{
			if(nm.equals(nm))
			{
				return Toy;
			}
			else
				return null;
		}
	}
	
	public static void getMostFrequentToy(String nm)
	{
		new String name;
		new int max = Integer.MIN_Value;
		for(toy : toyList)
		{
			if(max < toy.count())
			{
				max = toy.count();
				name = toy.name();
			}
		}
		return name;
	}
	
	public static void getMostFrequentType()
	{
		new int cars = 0;
		new int figures = 0;
		for(toy : toyList)
		{
			if(toy.Type == car)
				cars ++;
			if(toy.type == AF)
				figures ++;
		}
		return "Cars";
		return "Action Figures";
		return "Equal amounts of action figures and cars!";
	}
	
	public ArrayList toString()
	{
		return toyList;
	}
}