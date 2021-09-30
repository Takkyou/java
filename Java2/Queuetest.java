package Java2;

import java.util.LinkedList;

public class Queuetest {

	public static void main(String[] args) {
		LinkedList <String> myQueue = new LinkedList<>();
		
		System.out.println("myQueue.empty() -->" + myQueue.isEmpty() );
		System.out.println();
		
		myQueue.offer("1st"); System.out.println(myQueue);
		myQueue.offer("2st"); System.out.println(myQueue);
		myQueue.offer("3st"); System.out.println(myQueue);
		myQueue.offer("4st"); System.out.println(myQueue);
		System.out.println();
		
		System.out.println( "myQueue.peek()--> " + myQueue.peek() );
		System.out.println();
		String element;
		System.out.println( myQueue );
		element = myQueue.poll();
		System.out.println( "myQueue.poll() --> " + element );
		System.out.println();
		System.out.println( myQueue );
		element = myQueue.poll();
		System.out.println( "myQueue.poll() --> " + element );
		System.out.println();
		myQueue.offer( "5th" ); System.out.println( myQueue );
	}

}
