package arrays;
import java.util.*;
import java.io.*;

public class ar {
	public static void main(String args[]) {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the number: ");
		
		//int n = sc.nextInt();
		int[] ar1 = {1,2,3,4,5};
		int[] ar2 = {1,2,4,3,5};
		int[] ar3 = {1,2,3,4,5};
		
		/*for(int i = 0; i<n; i++)
			ar[i] = sc.nextInt();
		
		for(int i = 0; i<n; i++)
			System.out.print(ar[i]);*/
		if(Arrays.equals(ar1, ar2))
			System.out.println("ar1 same as ar2");
		
		if(Arrays.equals(ar1, ar3))
			System.out.println("ar1 same as ar3");
		
		Object[] ob1 = {ar1,ar2};
		Object[] ob2 = {ar2};
		Object[] ob3 = {ar1,ar2};
		
		if(Arrays.deepEquals(ob1, ob2))
			System.out.println("ob1 same as ob2");
		
		if(Arrays.deepEquals(ob1, ob3))
			System.out.println("ob1 same as ob3");
		
		//sc.close();
		
		// Copying one array to another
		int[] b = ar1.clone();
		for(int i = 0; i<b.length; i++)
			System.out.print(b[i]);
		
		// Copying array elements starting and ending specified
		int[] c = new int[ar1.length];
		System.arraycopy(ar1, 1, c , 2 , 3);
		for(int i = 0; i<c.length; i++)
			System.out.print(c[i]);
	}
}
