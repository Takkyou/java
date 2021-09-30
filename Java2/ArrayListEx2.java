package Java2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx2 {

	public static void main(String[] args) {
			ArrayList<String> a = new ArrayList<String>();
			
			Scanner scanner = new Scanner(System.in);
			for(int i=0; i<4; i++) {
				System.out.println("Enter name >");
				String s = scanner.next();
				a.add(s);
			}
			
			for(int i=0; i<a.size();i++) {
				String name = a.get(i);
				System.out.print(name + " ");
			}
			int longestIndex = 0;
			for (int i=1; i<a.size(); i++) {
			if ( a.get(longestIndex).length() < a.get(i).length() )
			longestIndex = i;
			}
			System.out.println( "\nThe longest name : " + a.get(longestIndex) );
			}
			

	
	}


