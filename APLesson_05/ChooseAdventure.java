import java.util.Scanner;
public class ChooseAdventure
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("You're in a dark forest. Do you choose to follow the goblin or the witch?");
		String choice1 = kb.nextLine();
		
		if(choice1.equals("goblin"))
		{
			System.out.println("You've followed the goblin. Suddenly, he runs away. Do you follow or stay?");
			String choice2 = kb.nextLine();
			if(choice2.equals("follow"))
			{
				System.out.println("You follow in hot pursuit, but the goblin disappears. Do you go left or right?");
				String choice3 = kb.nextLine();
					if(choice3.equals("left"))
						System.out.println("You blink at the bright sun shines--you've escaped the forest and are back to civilization! Well done!");
					else
						System.out.println("You run straight into quicksand. You're dead!");
			}
			else
			{
				System.out.println("You've chosen to stay. Suddenly, floating lights surround you. Do you leave--passing through the mysterious lights--or stay?");
				String choice4 = kb.nextLine();
				if(choice4.equals("leave"))
					System.out.println("The lights are vengeful spirits who destroy your soul. Dead!");
				else
				System.out.println("A wild jabberwocky swoops you up and eats you. You're dead!");
			}
		}
		else
		{
			System.out.println("You've followed the witch. Suddenly, she disappears. Do you stay or follow?");
			String choice5 = kb.nextLine();
			if(choice5.equals("stay"))
			{
				System.out.println("Blue light envelopes you. Do you fight or stay?");
				String choice6 = kb.nextLine();
					if(choice6.equals("fight"))
						System.out.println("Sensing your desperation, the light burns brighter. The last thing you see is a hazy blue. Dead!");
					else
						System.out.println("The blue light leaves. Shaken, you run away and eventually find your way back home. Well done!");
			}
			else
			{
				System.out.println("You've chosen to follow, but you trip and fall. Do you continue or give up?");
				String choice7 = kb.nextLine();
					if(choice7.equals("continue"))
						System.out.println("Though you do not find the witch, you discover an escape route. Well done!");
					else
						System.out.println("You have cravenly surrendered. You die alone in the forest.");
			}
		}
	}
}