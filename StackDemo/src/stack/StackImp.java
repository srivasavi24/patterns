package stack;

import java.util.Arrays;

public class StackImp {

	int top=-1;
	int maxsize;
	int[] myStack;
	int[] oddStack;
	
	public StackImp(int size) {
		top = -1;
		maxsize = 10;
		myStack = new int[10];
		oddStack=new int[10];
	}

	public boolean isEmpty() {
		if (top == -1) {
			// stack is empty
			return true;
		} else {
			return false;
		}
	}

	public boolean isFull() {
		if (top == maxsize - 1) {
			// stack is full
			return true;
		} else {
			return false;
		}
	}

	public void myPush(int num) {
		if(isFull()==false) {
		top=top+1;
		myStack[top]=num;
		}
		else {
			System.out.println("Cannot push the elements as Stack is Full");
		}
	}
	
	public int myPop() {
		if(isEmpty()==true) {
			
			System.out.println("Cannot perform pop as stack is empty");
			return -1;
		}
		else {
			int popvalue=myStack[top];
			top=top-1;
			return popvalue;
//			if(popvalue%2!=0) {
//				oddStack.myPush(popvalue);
//			}
		}
	}
	public void print() {
		System.out.println(Arrays.toString(myStack));
		System.out.println(Arrays.toString(oddStack));
	}
}
