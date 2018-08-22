package staticNfinal;

public class outerClass {
	public static String msg = "Yeah!!! Its static msg..."; // A static String variable
	
	
	public static class nestedStaticClass // a static nested class
	{ 
		public void printmsg() {
			System.out.println("This is nested static class and "+ msg);
		}
	}
	
	public class innerClass  // a static inner class
	{
		public void printmsg() {
			System.out.println("This is inner static class and "+ msg);
		}
	}
}
