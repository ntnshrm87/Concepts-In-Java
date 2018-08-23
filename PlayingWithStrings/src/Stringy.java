
public class Stringy {
	public static void main(String[] args) {
		String s = "Hi! This is 4hathacker revising Java concepts...";
		
		System.out.println("Length of String is: "+s.length());
		System.out.println("Character at 3rd position is: "+s.charAt(2));
		System.out.println("Taking out '4hathacker' is it: "+s.substring(12,23));
		System.out.println("Concatenating once: "+s.concat("Ohh really!!!"));
		System.out.println("Replacing the '4hathacker' with user: "+s.replace("4hathacker", "nitin"));
		
		// There are some more methods like startswith(), endswith(), inedxOf(), lastIndexOf().
		
		CharSequence cs = "Java";
		System.out.println("Is 'Java' present is s1: "+s.contains(cs) );
		
		// StringBuilder
		StringBuilder sbr = new StringBuilder(s);
		sbr.append("I have to do it ASAP");
		System.out.println(sbr);
		
		// StringBuffer
		StringBuffer sbf = new StringBuffer(sbr.toString());
		sbf.delete(sbf.length()-4, sbf.length());
		System.out.println(sbf);
		
	}
}
