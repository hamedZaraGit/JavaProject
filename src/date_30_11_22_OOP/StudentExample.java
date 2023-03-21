package date_30_11_22_OOP;

public class StudentExample {

	// members of a class
	// 1 variables -- place holders, they will store your data
	// 2 methods -- functions or actions that your class will be able to perform
	// - Constructors = create an object of the class
	// - option 0 - the default constructor given to any class (as soon as you make
	// any constructor, you will no longer have access to this)
	// - option 1 - default constructor
	// - option 2 - parameterized constructor
	// - Other Methods = will perform any other actions that you define

	// step 1 - declare your variables
	String firstname;
	String lastName;
	int age;

	// step 2 - create constructors
	// constructor structure
	// Access-Modifier Name-Class(arguments / parameters) { body }

	// default constructor will not have any arguments. it will initialize all of
	// the variables to default values
	public StudentExample() {
		firstname = "";
		lastName = "";
		age = 0;
	}

	// Parameterized constructors - will have arguments or parameters
	// the idea is to take the value as parameters and assign them to the variables
	// of the class
	public StudentExample(String fn, String ln, int a) {
		firstname = fn;
		lastName = ln;
		age = a;
	}

	// method to format students info and print it

	// Access-Modifier Return-Type Identifier ( Args ) {}
	// every function must have a return type. if your function is not going to
	// return anything, use void
	public void printStudInfo() {
		System.out.println("Student [firstName: " + firstname + ", lastName: " + lastName + ", age: " + age + "]");
	}
	
	
	
}
