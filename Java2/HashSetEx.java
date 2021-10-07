package Java2;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<Integer> v = new HashSet<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(100);
		v.add(5);
		
		Iterator<Integer> it = v.iterator();
		while(it.hasNext() ) {
			int n= it.next();
			System.out.println(n);
		}
		
		it = v.iterator();
		int sum =0;
		while(it.hasNext()) {
			int n= it.next();
			sum +=n;
			System.out.println(sum);
		}
	}
	
	

}
