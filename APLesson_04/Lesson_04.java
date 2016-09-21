public class Lesson_04
{
	public static void main(String[]args)
	{
		Lesson_04 form = new Lesson_04();
		
		String word1 = "blaah";
		double number1 = 543.21;
		
		form.format(word1, number1);
		
		String word2 = "yaaassss";
		double number2 = 12.43516;
		form.format(word2, number2);
	}
	
	public void format(String word, double number)
	{
		System.out.printf("\n%10s  %10.3f", word, number);		
	}
}