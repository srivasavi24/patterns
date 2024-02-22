package queue;
import java.util.*;
		
public class QueueDriver {
	Queue<String> myQueue = new Queue<String>();
	myQueue.add("Fun");
	myQueue.add("Is");
	myQueue.add("Science");
	myQueue.add("Computer");
	System.out.print(myQueue.front() + " "); 
	myQueue.remove();
	System.out.print(myQueue.front() + " "); 
	myQueue.remove();
	System.out.print(myQueue.front() + " "); 
	myQueue.remove();
	System.out.print(myQueue.front()); 
	myQueue.remove();
	System.out.println();


}
