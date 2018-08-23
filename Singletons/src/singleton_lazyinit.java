
public class singleton_lazyinit {
	// Singleton using Lazy Initialization
	// Creating Singleton single_instance
	private static singleton_lazyinit single_instance = null;
	
	public String s;
	private singleton_lazyinit(){
	//	String s = "this is a singleton"; // gives NullPointerException 
		s = "this is a singleton...";
	}
	
	public static singleton_lazyinit getInstance() {
		if(single_instance==null)
			single_instance = new singleton_lazyinit();
		return single_instance;	
	}
	
}
