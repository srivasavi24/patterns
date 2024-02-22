package queue;

import java.util.*;

//import linkedlist.Node;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListQueue pr = new LinkedListQueue();

		Scanner scanner = new Scanner(System.in);

		char ch = 'n';
		
		Node add;
		do {
			
			System.out.print("1.Enqueue \n2.Dequeue\n3.max size\n4.size\n5.Exit ");
			System.out.print("Enter option: ");

			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				System.out.print("Enter an element to insert: ");
				int num = scanner.nextInt();
				pr.enqueue(num);
				break;
			case 2:
				int rem = pr.dequeue();
				if (rem == -1) {
					continue;
				} else
					System.out.println(rem + " is removed from queue");
				break;
			case 3:
				System.out.println("Maximum element "+pr.getMax());
				
				break;
			case 4:
				System.out.println();
				pr.size();
				break;
			default:
				System.out.println("Enter valid option");
				System.exit(0);
				break;
			}
//
		} while (true);


	}

}
