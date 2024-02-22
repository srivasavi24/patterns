package stack;
import java.util.*;

public class Stacks1 {
	
//	Stack<String> stack = new Stack<>();
//	int top=-1;
//	stack.push("Hi");
	public static void main(String args[]) {
	
	Stack<String> myStack = new Stack<String>();
	myStack.push("Fun");
	myStack.push("Is");
	myStack.push("Science");
	myStack.push("Computer");
	System.out.print(myStack.peek() + " "); 
	myStack.pop();
	System.out.print(myStack.peek() + " "); 
	myStack.pop();
	System.out.print(myStack.peek() + " "); 
	myStack.pop();
	System.out.print(myStack.peek()); 
	myStack.pop();
	System.out.println();
	myStack.pop();
	

	}
}
