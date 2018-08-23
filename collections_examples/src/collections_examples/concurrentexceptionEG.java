package collections_examples;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class concurrentexceptionEG {
	// Java Collection classes are fail-fast, which means if 
	// the collection will be changed while some thread is 
	// traversing over it using iterator, the iterator.next() 
	// will throw ConcurrentModificationexception.
	
	// how Iterator checks for the modification, its 
	// implementation is present in AbstractList class where an int 
	// variable modCount is defined. modCount provides the number 
	// of times list size has been changed. modCount value is used 
	// in every next() call to check for any modifications in a 
	// function checkForComodification().
	
	public static void main(String[] args) {
		//List<String> myList = new ArrayList<String>();
		List<String> myList = new CopyOnWriteArrayList<String>();
		myList.add("N");
		myList.add("I");
		myList.add("T");
		myList.add("I");
		myList.add("N");
		
		Iterator<String> itr = myList.iterator();
		while(itr.hasNext()) {
			String value = itr.next();
			System.out.println("List Value: " + value);
			if (value.equals("N"))
				myList.remove(value);
		}
	}
}
