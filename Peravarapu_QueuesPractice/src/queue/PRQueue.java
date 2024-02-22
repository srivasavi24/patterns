package queue;

public abstract class PRQueue {

	public abstract void enqueue(int x);
	
	public abstract int dequeue();
	
	public abstract int getMax();
	
	public abstract int size();
	
}
