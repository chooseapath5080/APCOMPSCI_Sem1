import java.util.Scanner;
public class GPACalc
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Math grade?");
		String grade1 = kb.next();
		
		System.out.println("APES grade?");
		String grade2 = kb.next();
		
		System.out.println("Physics grade?");
		String grade3 = kb.next();
		
		System.out.println("Comp Sci grade?");
		String grade4 = kb.next();
		
		System.out.println("Euro grade?");
		String grade5 = kb.next();
		
		System.out.println("Econ grade?");
		String grade6 = kb.next();
		
		System.out.println("English grade?");
		String grade7 = kb.next();
		
		double gPoints = calcPoints(grade1) + calcPoints(grade2) + calcPoints(grade3) + calcPoints(grade4) + calcPoints(grade5) + calcPoints(grade6) + calcPoints(grade7);
	
		System.out.println("Your gpa is " + gPoints/7);
	}
	
	public static double calcPoints(String grade)
	{
		if(grade.equals("a"))
			return 4.0;
		if(grade.equals("b"))
			return 3.0;
		if(grade.equals("c"))
			return 2.0;
		if(grade.equals("d"))
			return 1.0;
		else
			return 0.0;
	}
}