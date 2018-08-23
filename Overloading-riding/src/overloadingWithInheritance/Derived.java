package overloadingWithInheritance;

public class Derived extends Base {
	public double my_func(double x) {
		System.out.println("Inside Derived... ");
		return x+99.99;
	}
}
