package linkedlist;

public class CarLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node Toyota = new Node("Toyota");
		Node Honda = new Node("Honda");
		Node Ford = new Node("Ford");
		Node Chevrolet = new Node("Chevrolet");
		Node Lamborghini = new Node("Lamborghini");
		
		Toyota.next=Honda;
		Honda.next=Ford;
		Ford.next=Chevrolet;
		Chevrolet.next=Lamborghini;
			
		print(Toyota);
		addElement(Toyota);
		deleteNode(Toyota,"Honda");
		printReverse(Toyota);
		

	}

	public static void printReverse(Node toyota) {
		// TODO Auto-generated method stub
		
		
		
	}

	public static Node deleteNode(Node Tesla,String value) {
		Node head=Tesla;
		// TODO Auto-generated method stub
		Node current = head;
		Node prevNode = null;
		while(current.carmodel != value) {
			prevNode = current;
			current = current.next;
		}
	    prevNode.next = current.next;
	    System.out.println();
		System.out.print("After Removing Elements: ");
	    print(head);
	    return head;
		
	}

	public static void addElement(Node Toyota) {
		// TODO Auto-generated method stub
		Node head=Toyota;
		Node Tesla=new Node("Tesla");
		Tesla.next=Toyota;
		head=Tesla;
		System.out.println();
		System.out.print("After Adding Elements: ");
		print(Tesla);
		
	}

	public static void print(Node Toyota) {
		// TODO Auto-generated method stub
		Node head = Toyota;
		while(head!=null) {
			System.out.print(head.carmodel+" -> ");
			head = head.next;

		}
		
		
	}

}
