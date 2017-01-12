import java.util.Scanner;
public class DistanceRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("x1?");
		int x1 = kb.nextInt();
		System.out.println("x2?");
		int x2 = kb.nextInt();
		System.out.println("y1?");
		int y1 = kb.nextInt();
		System.out.println("y2?");
		int y2 = kb.nextInt();
		
		System.out.println("With constructor");
		Distance object = new Distance(x1, x2, y1, y2);
		System.out.println("distance: "+object.getDist());
		
		System.out.println("With modifier");
		object.setValues(5, 6, 7, 9);
		System.out.println("distance: "+object.getDist());
	}
}