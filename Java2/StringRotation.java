package Java2;
import java.util.Scanner;

public class StringRotation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String rotateword;
		rotateword=scanner.nextLine();
		StringBuffer s = new StringBuffer(rotateword);

		char b;
		for(int i=0; i<s.length(); i++) {
			b = s.charAt(0);
			s.delete(0, 1);
			
			s.append(b);
			System.out.println(s);
		}
	}

}
