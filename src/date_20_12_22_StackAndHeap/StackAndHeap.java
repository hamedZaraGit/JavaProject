package date_20_12_22_StackAndHeap;

public class StackAndHeap {

	public static void main(String[] args) {
		
//		Stack and Heap - Is the memory structure of Java
//						 Is the memory of the runtime (When we execute our code) of your application - which is temporary
//						 Once the runtime is done, Then your application is not using any of your memory anymore
		
		
//		Stack - a list of all instructions a system should perform
		
//		Heap - where data is being organized and stored
//			   Is your Runtime memory
		
//		The primitive data-types stores in Stack
//		The reference data-types stores in Heap
		
//		== equality operator --> will compare what you have in the stack, not in heap.
//		equality (==) for primitives will compare the values
//		equality (==) will compare the location the variables is stored at
		
		
//		.equals method --> will compare the values of your object
		
		
//		!!!!  String static pool  !!!!
//		When we create a string with literal values (the one's with double quotes) it will go to the static pool and store it
//		If we have a string with the same value, this variable will refer to that same address or location
//		If we don't have it, it will create one and refer to that
//		When you use the constructor of the class string ==> new String();
//		You are bypassing the string static pool and creating a new object
//		Regardless of having the same object in the static pool
//		Basically it will just go ahead and create a new reference number or address for you object/value
//		Is only for String class
		
		
		
//		
//		
//		!!!! Garbage Collection !!!!
//		Is the process of removing the variable that are not being referred to in the memory
//		Java manages that process automatically
//		
//		Method finalize() is a method from Garbage collection
//		Is what java calls before removing the variables
//		
//		Clear Vs remove Vs GC
//		clear or remove method will clear or remove values in a list
//		GC will remove the values from the memory if no variable refers to them
		
		
		
		
		
		
		
//		Notes:
//		== equality | compares the location in memory | compares the values in Stack
//		.equals()   | compares the values			  | compares the values in Heap
//		
//		Primitive values stores in stack
//		The reference data-type values will store in Heap, Their address will be stored in stack
//		
//		
//		String static pool:
//		When we are using literal values to create strings, They store in a separate place in memory called string static pool
//		The idea is when we use same value for several times,
//		Java does not store and create the same value for several times
//		But refers to the same value, if it's called upon
//		By doing so, saving memory
//		Java implements this structure for two reason
//		1. The Strings are immutable, meaning they will not change
//		2. Strings are repeated many times, so we save memory and not waste memory
//		
//		When you have null as a value, Then the only thing is that you break the connection between the address and object in the memory
//		
//		
//		
		
		
		
		
		int x =10;
		int y = x;
		String s1 = "test"; // In here s1 generates it address (reference number) in Heap section. ex: @123 is s1 reference number
		String s2 = s1; // In here s2 is pointing to the same location (reference number) that s1 is saved in the heap (@123)
		s1 = "testing"; // In here s1 generates a new address (reference number) in heap section, because it has a new value
		
		String s3 = "testing";
		String s4 = "test222";
		String s5 = "test222";
		String s6 = new String("testing");
		
//		What we have to remember when comparing one object against another with equality operator
//		Is if the two objects are stored in the same location
//		Which is different than saying are the values the same
//		So when or if you want to compare values, you should use .equals() method
		
		System.out.println("s1 == s2 " + (s1==s2)); // It will return false
													// In here what's happening is that in memory it does not compare the values in heap
													// But rather the reference number/location address that is stored in stack
													// If we follow the execution, s1 at the end is "testing" and s2 is "test"
													// So because they are different values in our heap
													// A separate reference number/location address will be generated for, in our stack
													// So when equality operator compares those numbers
													// They are different and will return false
		
		System.out.println("s3 == s1 " + (s3==s1)); // This will return true
													// Because we already have the location for object "testing" in our static pool in heap
													// And if we already have a location of a value in our static pool
													// The return will be the same location address for us
													// In here both s3 and s1 have the same location they are referring to
													// So Heap will pass the same location address for our stack to refer to
		
		System.out.println("s5 == s4 " + (s5==s4));
		
		System.out.println("s3 == s6 " + (s3==s6)); // This will return false
													// In here although the objects/values are the same
													// But, because s6 is using constructor of class string
													// it will bypass the static pool
													// And create a new address/Reference number for us
													// So when we compare those numbers in stack
													// They are different and will return false
													// It compares the location address, not the values
		
		
		System.out.println("s3.equals(s6) " + (s3.equals(s6)));
													// This will return true
													// Because although we are using String class constructor and creating new object
													// But we are comparing values, not the location
		
		
		
		
		
		
		
		
		
	}

}
