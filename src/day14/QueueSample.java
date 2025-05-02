package day14;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> obj = new LinkedList<String>();
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Banana");
		obj.add("Grapes");
		
		//To take the top most element
		System.out.println(obj.peek());

		// To remove the element 
		obj.poll();
		
		System.out.println(obj);
		
				
		
	}

}
