package myStack;
import java.util.Stack;

public class stackTest {
	
	public void stack_push(Stack<Integer> st, int n) {
		System.out.println("Stack Push..."+n);
		st.push(n);
	}
	
	public void stack_pop(Stack<Integer> st) {
		System.out.println("Stack Pop...");
		st.pop();
	}
	
	public void stack_peek(Stack<Integer> st) {
		// Displaying element on the top of the stack
		System.out.println("Peeking on Stack...");
		System.out.println("Top of the Stack is: "+st.peek());
	}
	
	public void stack_search(Stack<Integer> st, int find) {
		// Search the integer in the stack returning the position of the element
		System.out.println("Searching inside the stack...");
		Integer pos = (Integer) st.search(find);
		if (pos==-1)
			System.out.println("Element not found...");
		else
			System.out.println("Element is found at index: "+pos);
	}
	
	public void stack_isEmpty(Stack<Integer> st) {
		if (st.empty()) 
			System.out.println("Stack is empty...");
		else
			System.out.println("Stack is not empty...");
		
	}
	
	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<Integer>();
		stackTest sts = new stackTest();
		sts.stack_isEmpty(st);
		sts.stack_push(st,100);
		sts.stack_push(st, 20);
		sts.stack_pop(st);
		sts.stack_push(st,345);
		sts.stack_push(st,230);
		sts.stack_push(st,140);
		sts.stack_peek(st);
		sts.stack_search(st, 579);
		sts.stack_push(st,10);
		sts.stack_pop(st);
		sts.stack_isEmpty(st);
		sts.stack_push(st,480);
		sts.stack_push(st,78);
		sts.stack_push(st,54);
		sts.stack_search(st,100);
		System.out.println("Stack is: "+st);
	}
}
