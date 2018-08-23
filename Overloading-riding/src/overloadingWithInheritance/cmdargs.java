package overloadingWithInheritance;

public class cmdargs {
	public static void main(String args[]) {
		if (args.length > 0) {
			System.out.println("Yes, args are present...");
			for(int i=0; i<args.length; i++)
			{
				System.out.println(args[i]);
			}
		}
		else {
			System.out.println("No cmdargs found...");
		}
	}
}
