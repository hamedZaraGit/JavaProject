package date_06_12_22_ArrayList;

import java.util.ArrayList;

public class ArrayListSyntax {

	public static void main(String[] args) {
		
		
//		ArrayList
//		How to create an ArrayList
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		
//		<  > :  these are called generics.
//				it takes only reference data types
//				it can not store primitive data types
//				but using wrapper classes you can store your primitive classes
		
//		Wrapper classes:
//		will wrap primitive data types into reference data types
//		will have a lot of useful functions you could call
		
//		byte = Byte
//		short = Short
//		int = Integer
//		float = Float
//		double = Double
//		char = Character
//		boolean = Boolean	
		
		
		
//		to get the length - use the method size()
		System.out.println(names.size());
		
//		to add items - use the method add()
		names.add("name1");
		names.add("name2");
		names.add("name3");
		names.add("name4");
		names.add("name5");
		System.out.println(names.size());
		
//		to get a value - use the method get()
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		System.out.println(names.get(3));
		System.out.println(names.get(4));
		
		
//		to print the list - you can loop and use .size() instead of .length 
//							and use .get() instead of index number [] to get the index value
		for(String n : names) {
			System.out.println("for each method: " + n);
		}
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println("for loop method: " + names.get(i));
		}
		
		
//		or use the print the name of your list
		System.out.println(names);
		
		
//		Collection/ArrayList has a toString() method implemented
		
//		toString() is a method give to any classes, it is going to provide a String representation of a class or object
		
//		Ex:
		
		int [] nums = {12, 23, 12, 45, 76};
		System.out.println("only by calling the array: " + nums); // in here if we print this it will give us a has code or reference address
		
		ArrayList<Integer> num1 = new ArrayList<Integer>();
		
		num1.add(12);
		num1.add(23);
		num1.add(12);
		num1.add(45);
		num1.add(76);
		
		System.out.println("toString() method: " + num1); // In here it automatically format it in a toString() method, 
								  // because the ArrayList has the toString() method implemented in it
		
		
		
		
		
		
	}

}
