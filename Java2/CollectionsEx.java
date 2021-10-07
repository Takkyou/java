package Java2;

import java.util.Collections;
import java.util.LinkedList;

public class CollectionsEx {

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("Transformer");
		myList.add("Starwars");
		myList.add("Matrix");
		myList.add(0,"Terminator");
		myList.add(2,"Avatar");
		System.out.println(myList);
		
		Collections.sort(myList);
		System.out.println(myList);
		
		int index = Collections.binarySearch(myList, "Starwars");
		System.out.println("Starwars is at" + index);
		
		Collections.reverse(myList);
		System.out.println(myList);
	}

}
