public class GameRunner
{
	public static void main(String[]args)
	{
		XBox XBox = new XBox("XBox");
		System.out.println(XBox);
		
		PlayStation PlayStation = new PlayStation("PlayStation");
		System.out.println(PlayStation);
		
		PC PC = new PC("PC");
		System.out.println(PC);
	}
}