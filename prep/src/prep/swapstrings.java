package prep;

public class swapstrings {
	
	static String x = "Nitin";
	String y = "Sharma";
	
	public swapstrings() {
		// TODO Auto-generated constructor stub
		
		System.out.println("Inside constructor... Before swapping...");
		System.out.println("x is: " + x);
		System.out.println("y is: " + y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside main... Doing swapping");
		swapstrings ss = new swapstrings();
		String z = x + ss.y;
		String y = z.substring(0, z.length() - ss.y.length());
		System.out.println("y is: "+ y);
		String x = z.substring(ss.y.length()-1);
		System.out.println("x is: "+ x);
	}

}
