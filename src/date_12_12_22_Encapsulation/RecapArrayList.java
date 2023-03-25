package date_12_12_22_Encapsulation;

import java.util.ArrayList;

public class RecapArrayList {

	public static void main(String[] args) {
		
		// array list
		ArrayList<String> temp1 = new ArrayList<String>();
		
		// array list has toString() method already in it
		System.out.println(temp1);
		
		temp1.add("string1");
		temp1.add("string2");
		temp1.add("string3");
		temp1.add("string4");
		temp1.add("string5");
		
		
		System.out.println(temp1.size());
		
		System.out.println(temp1.get(1));
		
		System.out.println(temp1.remove(2));
		
		for (int i = 0; i < temp1.size(); i++) {
			System.out.println("for loop: " + temp1.get(i));
			
		}
		
		for(String s : temp1) { // for each loop or enhanced for loops
			System.out.println("for each loop: " + s);
		}
		
		
		
		
	}

}
