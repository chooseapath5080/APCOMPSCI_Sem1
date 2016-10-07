public class Lesson_05
{
	public static void main(String[]args)
	{
		if(tOrf())
		{
			System.out.println("It is true!");
		}
		//! means not
		if(!tOrf())
		{
			System.out.println("It is false!");
		}
	}
	
	//return type is boolean
	public static boolean tOrf()
	{
		return 2<=5;
	}
}