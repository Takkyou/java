package Java2;

import java.util.LinkedList;

public class StringReverse {
public static void main(String[] args) {
	String s = "abcdef";
	LinkedList<Character> stack = new LinkedList<Character>();
	
	for(int i=0; i < s.length(); i++) {
			stack.push(s.charAt(i));
	}
	while(stack.isEmpty()==false)
		System.out.print(stack.pop());
	System.out.println();
}
}
