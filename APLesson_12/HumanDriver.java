import java.util.Scanner;
public class HumanDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("hair?");
		String hair = kb.next();
		System.out.println("eyes?");
		String eyes = kb.next();
		System.out.println("skin?");
		String skin = kb.next();
		
		Human object = new Human(hair, eyes, skin);
		System.out.println("My info....");
		System.out.println("hair: "+object.getHair());
		System.out.println("eyes: "+object.getEyes());
		System.out.println("skin: "+object.getSkin());
		
		object.setHES("blonde","blue","white");
		System.out.println("Friend's info....");
		System.out.println("hair: "+object.getHair());
		System.out.println("eyes: "+object.getEyes());
		System.out.println("skin: "+object.getSkin());
	}
}