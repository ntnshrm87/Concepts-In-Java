package overloadingWithInheritance;

public class Test {
	public static void main(String[] args) {
		Derived d  = new Derived();
		System.out.println(d.my_func(1));
		System.out.println(d.my_func(1.1));
	}
}
