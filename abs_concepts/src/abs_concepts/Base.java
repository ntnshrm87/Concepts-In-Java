package abs_concepts;

public abstract class Base {
	// abstract void func();
	final void func1() {
		System.out.println("func1 final is called... ");
	}
	Base(){
		System.out.println("Constructor is called in Base... ");
	}
}
