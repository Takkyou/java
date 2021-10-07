package Java2;

import java.util.Iterator;
import java.util.Vector;

public class IteratorVector {

	public static void main(String[] args) {

			
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(-1);
		v.add(-2);
		v.add(10);
		System.out.println("before:" + v);
		
		for(int i=0; i<v.size(); i++) {
			if(v.get(i)<0) {
				v.remove(i);
				i--;
			}			
		}
		System.out.println("after:" + v);
		
		Iterator<Integer>  it = v.iterator();
		while(it.hasNext()) {
			if(it.next() < 0)
				it.remove();
		}
		System.out.println("after:" + v);
	}

}
