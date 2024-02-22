package stack;
import java.util.*;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stack= new Stack<>();
		Queue<Integer> queue = new LinkedList<>();
		ArrayDeque<Integer> deq = new ArrayDeque<>();
		
		for(int i=1;i<=9;i=i+2) {
			queue.add(i);
			deq.addLast(i);
		}
		while(!queue.isEmpty()) {
			stack.push(queue.poll());
		}
		//System.out.println(stack);
		while(!stack.isEmpty()) {
			queue.add(stack.pop());
		}
		System.out.println("Stack: "+stack);
		System.out.println("Queue: "+queue);
		System.out.println("Dequeue: "+deq);

	}

}
