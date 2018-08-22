package thisnsuper;

public class B extends A{
	B(){
		this("");
		System.out.println("B's no arg constructor");
	}
	
	B(String args){
		super("");
		System.out.println("B's one arg constructor");
	}
}
