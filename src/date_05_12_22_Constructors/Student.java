package date_05_12_22_Constructors;

public class Student {

	
	
//	Step 1: Declare your variables
	String firstName;
	
	
//	Step 2: Create Constructors
	
//	default constructor, which means with no arguments
	public Student() {
		firstName = " ";  // In here we have initialized our variable in the constructor
		
	}
	
	
//	Parameterized constructor, which means we will have arguments and parameters for it
	public Student(String fn) {
		firstName = fn; // In here we have initialized our variable and stored it in our parameter/ in our input of our constructor
	}
	
	
//	Step3: Create methods
	
	
	
	
	
//	toString() method:
//						toString() method is going to give you a string representation of your object in your Runner class
//						its a special method used generally on java
	
//	example:
	
	public String toString() {
		return "This is toString() method useage";
	}
	
	
	
}
