package queue;

public class Queue<E> {
	private LinkedList<E> queue;
	public Queue();	
	public void add(E element);
	public E remove();
	public E front();
	public boolean isEmpty();
	public int size();


}
