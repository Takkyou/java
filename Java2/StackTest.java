package Java2;
import java.util.Stack;
public class StackTest {

	public static void main(String[] args) {
		Stack <String> myStack = new Stack <String>();
		
		System.out.println("myStack.empty()" + myStack.empty());
		System.out.println();
		
		myStack.push("1st"); System.out.println(myStack);
		myStack.push("2st"); System.out.println(myStack);
		myStack.push("3st"); System.out.println(myStack);
		myStack.push("4st"); System.out.println(myStack);
		System.out.println();
		
		System.out.println("myStack.peek()-->" + myStack.peek());
		
		String elements;
		
		elements = myStack.pop();
		
		System.out.println("myStack.pop()" + elements);
		
		
		elements = myStack.pop();
		System.out.println("myStack.pop()" + elements);
		
	}

}
