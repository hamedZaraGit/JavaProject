package collectionsPractice;

import java.util.Vector;

public class VectorPractice {

	public static void main(String[] args) {
		
//		Iterable class has 3 interfaces: List, Queue, Set
		
		
//		ArrayList  | for smaller data sets | good for retrieving data		| Increases the size when full by 50% | non-syncronised, faster at getting data
//		LinkedList | for larger data sets  | good for modification of data	| does not need to increase
//		Vector	   | 					   |								| Increases the size by 100%		  | syncronised, slow at getting data
		
//		All of these 3 classes are under of List Interface of iterable class
//		So the implementation of the methods will be the same for all of them
//		And they all have toString() method implemented inside them, meaning when you print it will print in a toString() method format
		
		
		Vector<String> vec = new Vector<String>();
		
		vec.add("value 1");
		vec.add("value 2");
		vec.add("value 3");
		vec.add("value 4");
		vec.add("value 5");
		
		System.out.println(vec);
		
		System.out.println(vec.capacity());
		
		vec.add("value 1");
		vec.add("value 2");
		vec.add("value 3");
		vec.add("value 4");
		vec.add("value 5");
		vec.add("value 6");
		vec.add("value 7");
		vec.add("value 8");
		vec.add("value 9");
		vec.add("value 10");
		
		System.out.println(vec.capacity());
		
	}

}
