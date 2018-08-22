package collections_examples;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Enumeration;



public class ht {
	
	public static Hashtable<Integer,String> ht_impl(){
		Hashtable ht = new Hashtable();
		ht.put(1,"Nitin");
		ht.put(2, "Akhil");
		ht.put(3, "Ninja");
		ht.put(4, "Sherry");
	
		return ht;
	}
	
	public static void main(String[] args) {
		
		// 1. clone hashtable in ht_clone and iterate to find "Akhil"
		// 2. clear the clone once done
		// 3. check if ht_clone is cleared and remove the entry for "Nitin" from ht
		// 4. put one more entry for "Sukhe"
		
		Hashtable<Integer,String> ht = ht_impl();
		Hashtable<Integer,String> ht_clone = (Hashtable)ht.clone();
	    
		Enumeration e = ht_clone.elements();
		System.out.println("Elements in hashtable: ");
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		if (ht_clone.containsValue("Akhil")) {
	         System.out.println("Yes... Akhil is present...");
		}
		
		System.out.println("emptying ht_clone...");
		ht_clone.clear();
		
	    if (ht_clone.isEmpty()) {
	    	System.out.println("Yes... Clone is empty");
	    }
	    
	    ht.put(5, "Sukhe");
	    
	    Set<Entry<Integer, String>> st = ht.entrySet();
	    
	    System.out.println("final hash Table is: "+st);
	}
}
