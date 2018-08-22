package enum_itrs_litrs;
import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class vec_al {
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
	    
		for(int i = 0; i<10; i++) {
	    	v.add(i);
	    }
	    
		System.out.println("Vector is: "+v);
		System.out.println("----Enumeration----");
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println("element with enum is: "+e.nextElement());
		}
		
		System.out.println("----Listiterator----");
		ListIterator litr = v.listIterator();
		while(litr.hasNext()) {
			if (litr.previousIndex() == 8) {
				litr.add(88);
			}
			System.out.println("elements via litr: "+(Integer)(litr.next()));
		}
		litr.remove();
		
		System.out.println("----Univeral Iterator----");
		Iterator itr = v.iterator();
		
		while(itr.hasNext()) {
			System.out.println("elements via itr: "+itr.next());
			// itr.remove();
		}
		
		
	}
}
