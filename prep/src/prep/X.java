package prep;
import java.util.*;
// import java.io.*;

public class X {
    public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	int i, k;
	public X() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside X contructor...");
		i = 1;
		k = 3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // Input value from a user
		System.out.print("Enter a random integer: ");
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        
        // Creating class instance
        X x = new X();
        
        // Accessing class variables in Java
        x.i = 3;
        x.k = x.i + j;
        System.out.println("Added value is: " + x.k);
        
	}

}
