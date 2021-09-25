package Java2;

import java.util.Scanner;
import java.util.Vector;

class customer{
	String name;
	int point;
	customer(String name){
		this.name= name;
		
	//	this.point= point;
	}

	public String toString() {
		return name;
	}
}
public class Customer {
	public static void  main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름과 포인트 입력> ");
		
		String s = scanner.next();

	Vector<customer> v = new Vector<customer>();
	v.add(new customer(s));
	
	 for(int i=0; i<v.size(); i++) {
		 customer p = v.get(i);
		 System.out.println(p);
	 }
	}
}
