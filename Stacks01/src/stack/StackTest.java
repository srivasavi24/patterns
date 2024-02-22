package stack;
import java.util.*;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> dogStack = new Stack<>();
		dogStack.push("Bas");
		dogStack.push("Bird");
		dogStack.push("Luci");
		System.out.println("Removed Element: "+dogStack.pop());
		System.out.println("Current Top Element: "+dogStack.peek());
		dogStack.push("Fudge");dogStack.push("Blonkie");dogStack.push("Audrey");
		dogStack.push("Zelda");dogStack.push("Midge");dogStack.push("Carmen");
		System.out.println("Current Top Element: "+dogStack.peek());
		while(!dogStack.isEmpty()) {
			System.out.println("Remove Element: "+dogStack.pop());
		}
		System.out.println();
	}

}
