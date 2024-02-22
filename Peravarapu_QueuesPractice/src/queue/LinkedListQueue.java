package queue;

//import linkedlist.Node;

public class LinkedListQueue extends PRQueue{
	public Node head;
	
	public void enqueue(int x) {
		Node newnode= new Node(x);
		if(head==null) {
			head=newnode;
			
		}
		else if(x<head.data){
			newnode.next=head;
			head=newnode;
		}
		
		else {
			Node temp=head;
			while(temp.next!=null && x<temp.next.data) {
				temp=temp.next;
			}
			newnode.next=temp.next;
			temp.next=newnode;			
		}
		
	}

	@Override
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		else {
			int rand=head.data;
			head = head.next;
			return rand;
		
		}
		// TODO Auto-generated method stub
	}
	
	@Override
	public int getMax() {
		int max=head.data;
		Node temp=head;
		while(temp.next!=null) {
			if(temp.data>max) {
			max=temp.data;
			}
			temp=temp.next;
		}
		System.out.println("max"+max);
		// TODO Auto-generated method stub
		return max;
	}

	@Override
	public int size() {
		int s=0;
		Node tem=head;
		while(head!=null) {
			s=s+1;
			tem=tem.next;
		}
		// TODO Auto-generated method stub
		return s;
	}
		
		
	public boolean isEmpty() {
		if(head==null) {
			return true;
		}
		else
			return false;
	}
	
	public void print(Node add) {
		Node head=add;
		System.out.println("Elements of Linkedlist");
		//Node temp=head;
		while(head!=null) {
			System.out.println(head.data+"->");
			head=head.next;
		}
		//return 1;
		
	}

}
