package staticNfinal;

public class Test extends outerClass {
	
	public static void main(String[] args) {
		
		// Calling a static nested class
		outerClass.nestedStaticClass nSC = new outerClass.nestedStaticClass(); // important step
		nSC.printmsg();
		
		// Calling a normal inner class
		outerClass oc = new outerClass();
		outerClass.innerClass oci = oc.new innerClass(); // important step
		oci.printmsg();
	}
	
}
