package finfinfin;
import java.util.*;
import java.io.*;

public final class finalfinallyfinalize // a final class 
{
	static int j = 20;
	
	public final int fin() // a final function
	{
		int x = 0;
		// static int x = 21;
		// Error: Illegal modifier for parameter x; only final is permitted
		return x;
	}
	
	public static void main(String[] args) {
		
		final int n = 20;  // a final variable
		
		// n = 200; 
	    // Error: The final local variable n cannot be assigned. 
		//        It must be blank and not using a compound assignment
	    
		System.out.println("n is: "+n);
	    j += n;
		System.out.println("Value of j is: "+ j);
		
		// finally will run whether the exception is caught or not
		try{
			System.out.println("this is try block...");
			int y = j/0;
		}
		catch(ArithmeticException e){
			System.out.println("this is catch block...");
		}
		finally {
			System.out.println("This is finally block...");
		}
		
		// String s = "4hathacker";
		// s = null;
		// System.gc();  // finalize() not called... 
		
		finalfinallyfinalize fff = new finalfinallyfinalize();
		fff = null;
		System.gc(); // finalize called by GC
		System.out.println("Main Completes...");
		
		// finalize working:
		// 1. GC calls only the finalize method on that class object which is eligible for Garbage collection.
		// 2. Explicit calls to finalize cannot delete/destroy the object for garbage collection.
		// 3. In case if any error occur in implicit finalize call by GC, normal execution will take place.
		
	}
	
	public void finalize() {
		System.out.println("Finalize is called... ");
		System.out.println(10/0);
	}
}
