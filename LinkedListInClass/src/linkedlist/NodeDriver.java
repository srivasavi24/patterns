package linkedlist;

public class NodeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node redNode = new Node("Red");
		Node yellowNode = new Node("Yellow");
		Node orangeNode = new Node("Orange");
		Node pinkNode = new Node("Pink");
		Node blackNode = new Node("Black");
		Node whiteNode = new Node("White");
		Node blueNode = new Node("Blue");
		Node greenNode = new Node("Green");
		
		redNode.next=yellowNode;
		yellowNode.next=orangeNode;
		orangeNode.next=pinkNode;
		pinkNode.next=blackNode;
		blackNode.next=whiteNode;
		whiteNode.next=blueNode;
		blueNode.next=greenNode;

		Node head = redNode;
		//Node current=head;
		//Node current=redNode;
		while(head!=null) {
			
			System.out.print(head.color+" -> ");
			head = head.next;

		}
		
		addNodeAtStart(redNode);
		
	}

	private static void addNodeAtStart(Node redNode) {
		// TODO Auto-generated method stub
		
	}

//	private static void addNodeAtStart(Node redNode) {
//		// TODO Auto-generated method stub
//		
//	}

}
