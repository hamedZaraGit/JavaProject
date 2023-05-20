package collectionsPractice;

import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {
		
//		Iterable class has 3 interfaces: List, Queue, Set
		
		
//		ArrayList  | for smaller data sets | good for retrieving data		| Increases the size when full by 50% | non-syncronised, faster at getting data
//		LinkedList | for larger data sets  | good for modification of data	| does not need to increase
//		Vector	   | 					   |								| Increases the size by 100%		  | syncronised, slow at getting data
		
//		All of these 4 classes are under of List Interface of iterable class
//		So the implementation of the methods will be the same for all of them
		
		LinkedList<String> li = new LinkedList<String>();
		
		li.add("value 1");
		li.add("value 2");
		li.add("value 3");
		li.add("value 4");
		li.add("value 5");
		
		System.out.println(li);
		
		for(int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}
		
		
		for(String s : li) {
			System.out.println(s);
		}
		
		
	}

}
