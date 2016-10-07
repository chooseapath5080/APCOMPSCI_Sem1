import java.util.Random;
public class Lesson_05RI
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		//gives numbers 0-99
		int num = rand.nextInt(100);
		//int num = (int)(1+Math.random()*101);
		System.out.println(num);
	}
}