import java.util.Scanner;
public class MilesPerHourRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("distance?");
		int distance = kb.nextInt();
		System.out.println("hours?");
		int hours = kb.nextInt();
		System.out.println("minutes?");
		int minutes = kb.nextInt();
		
		MilesPerHour object = new MilesPerHour(distance, hours, minutes);
		
		System.out.println(object.getDistance()+" miles in "+object.getHours() +" = "+object.getMPH());
	}
}