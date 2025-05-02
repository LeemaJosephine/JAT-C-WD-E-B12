package day14;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> stk = new Stack<String>();
		
		// To add elements in the stack
		
		stk.push("Apple");
		stk.push("Orange");
		stk.push("Banana");
		stk.push("Grapes");
		
		System.out.println("Stack: "+stk);
		
//		Iterator<String> itr = stk.iterator();
//		while(itr.hasNext()) {
//			
//			System.out.println(itr.next());
//		}
		
		stk.pop(); // TO remove the top element
		
		System.out.println("Stack after removing: "+stk);
		
		System.out.println("The top most element is " + stk.peek()); // to reterive the top element
		
		int pos = stk.search("Orange");
		System.out.println("Orange is in position: " +pos);
	}

}
