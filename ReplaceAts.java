import java.util.Scanner;
public class ReplaceAts
{

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your sentence");
		String sentence = kb.nextLine();
		System.out.print(replace(sentence));
	}
	
	public static String replace(String sentence)
	{
		while(sentence.indexOf("a") >= 0)
		{
			sentence = sentence.substring(0,sentence.indexOf("a")) + "@" + sentence.substring(sentence.indexOf("a")+1, sentence.length());
		}
		return sentence;
	}
}