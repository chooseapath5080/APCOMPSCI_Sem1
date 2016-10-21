import java.util.Scanner;
public class GraphTable
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your integer: ");
		int integer = kb.nextInt();
		System.out.println("Enter your table size: ");
		int tablesize = kb.nextInt();
		
		for(int i = 1; i <= tablesize; i++)
		{
			System.out.printf("%5d         %5d\n", i, i*integer);
		}
	}
}