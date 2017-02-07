import java.util.ArrayList;
public class CountingMachine
{
	public static void main(String[]args)
	{
		double total = 0;
		ArrayList<Money> inventory = new ArrayList<Money>();
		<add inventory here>
		
		for(Money x : inventory)
		{
			System.out.println(x);
		}
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your bills and coins...");
		String cash = kb.nextLine();
		Scanner scan = new Scanner(cash);
		
		while(scan.hasNext())
		{
			String x = scan.next();
			
			for(Money b : inventory)
			{
				if(b.scan().(x) || b.getName().equals(x))
				{
					b.setCount(b.getCount()+1);
				}
			}
		}
		
		for(Money x : inventory)
		{
			total += x.getValue() * x.getCount();
		}
		System.out.println(total);
	}

	
}