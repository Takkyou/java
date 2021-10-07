package Java2;

import java.util.LinkedList;

public class CollectionsEx2 {

	public static void main(String[] args) {
		
		
		LinkedList<String> c1 = new LinkedList<>();
		c1.add("Transformer");
		c1.add("Starwars");
		c1.add("Matrix");
		System.out.println("C1=" + c1);	
		
		ArrayList<String> c2= new ArrayList<>();
		c2.add("Transformer");
		c2.add("Avatar");
		c2.add("Starwars");
		System.out.println("C2=" + c2);
		
		boolean d = Collections.disjoint(c1,c2);
		System.out.println("disjoint():" + d);
	}

}
