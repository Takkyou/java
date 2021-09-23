package Java2;
import java.util.Scanner;
import java.util.StringTokenizer;
public class SplitAndSort {

	public static void main(String[] args) {
		int count =0;
		Scanner scanner = new Scanner(System.in);
		String a;
		int s = 1;
		
		
		
		while(s != 0){
		a= scanner.nextLine();
		StringTokenizer b = new StringTokenizer(a," ");
			if(a=="exit") break;
			while(b.hasMoreTokens())
			System.out.println(b.nextToken());
		}	
		
	}	
}
