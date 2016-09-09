import java.util.Scanner; 
//for this program start everything the same w this statement and public class/void etc

public class RudeAI
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hi, my name is RudeAI.");
		System.out.println("I'd like to ask you a few questions.");
		System.out.println("What is your name?");
		String name = keyboard.next();
		System.out.println(name + "????! Why would anyone name a baby that?");
		System.out.println("Okay well preposterous name aside...");
		
		System.out.println("How old are you, " + name + "?");
		int age = keyboard.nextInt();
		System.out.println("Ooo!! " + age + " is getting pretty up there!!");
		
		System.out.println("What do you do for fun, " + name + "?");
		String fun = keyboard.next();
		System.out.println("I thought that only nerds like to " + fun + " ?");
		
		System.out.println("What kind of music do you like?");
		String music = keyboard.next();
		System.out.println("Booo!! I wouldn't wish " + music + " on my worst enemy!");
		
		System.out.println("How many siblings do you have?");
		String siblings = keyboard.next();
		System.out.println(siblings + "? Wow, I hope the rest of your family is better looking.");
		
		System.out.println("What do you want to be when you grow up?");
		String job = keyboard.next();
		System.out.println("I think you'd have to be smarter to be a " + job + "!");
		
		System.out.println("So " + name + ", you're " + age+"...");
		System.out.println("You like to " + fun + " and listen to " +music+"...");
		System.out.println("Good luck becoming a  "+job+"!");
		System.out.println("Thanks for taking my jokes in good taste, "+name+".");
	}
}
