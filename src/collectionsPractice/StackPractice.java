package collectionsPractice;

import java.util.Stack;

public class StackPractice {

	public static void main(String[] args) {
		
		
		
//		Stack is sub class of Vector class, which is part of the List class
//		It functions as a (LIFO) meaning first last value in first value out
		
		
		Stack<String> stc = new Stack<String>();
		
		
		stc.add("A1");
		stc.add("A2");
		stc.add("A3");
		stc.add("A4");
		stc.add("A5");
		
		System.out.println(stc);
		System.out.println("Peek: " + stc.peek()); // returns the value thats on top of the stack
		System.out.println("FirstELement: " + stc.firstElement());
		System.out.println("POP: " + stc.pop()); // removes the value thats on top of the stack and returns that value
		System.out.println(stc);
		
		
		
		

	}

}
