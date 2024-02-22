package stack;
import java.util.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackImp randomStack = new StackImp(10);
		StackImp oddStack = new StackImp(10);
		int num;
		Random random= new Random();
		
		for(int i=0;i<10;i++) {
			num=random.nextInt(10,30);
			randomStack.myPush(num);
		}
		randomStack.print();	
		
		
	}

}
