
public class test_lazyinit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variable x of singleton
		singleton_lazyinit x = singleton_lazyinit.getInstance();
		
		// Variable x of singleton
		singleton_lazyinit y = singleton_lazyinit.getInstance();
				
		// Variable x of singleton
		singleton_lazyinit z = singleton_lazyinit.getInstance();
		
		x.s = (x.s).toLowerCase();
		
	    System.out.println("var x has string: "+ x.s);
	    System.out.println("var y has string: "+ y.s);
	    System.out.println("var z has string: "+ z.s);
	    
        z.s = (x.s).toUpperCase();
		
	    System.out.println("var x has string: "+ x.s);
	    System.out.println("var y has string: "+ y.s);
	    System.out.println("var z has string: "+ z.s);
		
	}

}
