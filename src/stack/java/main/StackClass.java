package stack.java.main;
import java.util.Stack;

public class StackClass {
	
	public static void main(String [] str) {
		
		// Creating stack
		Stack<String> myStack = new Stack<>();
		
		// Adding elements to the stack
		myStack.push("Schampoo");
		myStack.push("Shower Gel");
		myStack.push("Soap");
		myStack.push("Foam");
		myStack.push("Conditioner");
		myStack.push("Scrab");
		myStack.push("Razor");
		
		// Printing all elements of the Stack
		while(!myStack.empty()) {
			System.out.println(myStack.pop());
		}
		
		// Checking that myStack is empty
		System.out.println("Stack is empty after pop method: " + myStack.isEmpty());
		
		// Adding elements back to myStack
		myStack.push("Shampoo");
		myStack.push("Shower Gel");
		myStack.push("Soap");
		myStack.push("Foam");
		myStack.push("Conditioner");
		myStack.push("Scrab");
		myStack.push("Razor");
		
		//First element of the stack
		System.out.println("First element is: " + myStack.peek());
		
		// Checking that myStack is not empty
		System.out.println("Stack is empty: " + myStack.isEmpty());
		
		// Checking if myStack contains element Scrab
		System.out.println("Stack has element Scrab: " + myStack.contains("Scrab"));
		
		// Checking if myStack contains element Soap
		System.out.println("Stack has element Soap: " + myStack.contains("Soap"));
		
		// Checking if myStack contains element Shampoo
		System.out.println("Stack has element Shampoo: " + myStack.contains("Shampoo"));
		
		// Checking if myStack contains element Towel
		System.out.println("Stack has element Towel: " + myStack.contains("Towel"));
		
	}

}
