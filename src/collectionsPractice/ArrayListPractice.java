package collectionsPractice;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		
//		Collections class has 3 interfaces: List, Queue, Set
		
		
//		ArrayList  | for smaller data sets | good for retrieving data		| Increases the size when full by 50% | non-syncronised, faster at getting data
//		LinkedList | for larger data sets  | good for modification of data	| does not need to increase
//		Vector	   | 					   |								| Increases the size by 100%		  | syncronised, slow at getting data
		
//		These 3 classes are part of under Interface of iterable class
//		So the implementation of the methods will be the same for all of them
		
		ArrayList<String> ary = new ArrayList<String>();
		
		ary.add("value 1");
		ary.add("value 2");
		ary.add("value 3");
		ary.add("value 4");
		ary.add("value 5");
		
		System.out.println(ary);
		
		System.out.println(ary.contains("value3"));
		
		for(int i = 0; i < ary.size(); i++) {
			System.out.println(ary.get(i));
		}
		
		for(String s : ary) {
			System.out.println(s);
		}
		
		
		
	}

}
