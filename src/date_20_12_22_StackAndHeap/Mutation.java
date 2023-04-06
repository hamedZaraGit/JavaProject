package date_20_12_22_StackAndHeap;

import java.util.Iterator;

public class Mutation {

	public static void main(String[] args) {
		
		
//		Mutation is part of the Memory concept
		
//		Notes:
//		
//		String 		  | Is not mutable / not changeable | 
//		StringBuilder | Is mutable / changeable			| Is Thread Safe
//		StringBuffer  | Is mutable / changeable			| Is not Thread safe
		
		
//		What we mean by Mutable and not Mutable ?
//		
//		- Mutable - 	means when we bring a change to our variable or object value
//						It goes to the same location in the memory and changes our value in the same location/address
		
//		- non mutable - means when we bring change to our variable or object value
//						It does not change our value in the same location/address
//						But rather automatically creates a new address and assigns the value to it
	
		
		
		
		
		String x = "test"; // String is non mutable,
						   // we can change the value for sure
		x = "testing";
						   // But what we mean by not change able is that when we bring change to it
						   // The changed value is not stored in the same location as "test" is stored
						   // But rather a new location address will be created for our new given value and stored in that new location
						   // And our variable will refer to that new location
		System.out.println(x);
					
		
		StringBuilder sb = new StringBuilder("Testing is fun");
		sb.append(", test");
						// StringBuilder is mutable
						// Meaning we can assign new value to our object
						// But the changed value is stored in the same location as previous value that was stored for that object
		
		System.out.println(sb);
		
		
		
		
		
		
		
		
		
	}

}
