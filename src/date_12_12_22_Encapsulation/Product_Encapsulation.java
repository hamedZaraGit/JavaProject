package date_12_12_22_Encapsulation;

public class Product_Encapsulation {
	
	// Bean Class:
	// Is a design pattern/standard of how things are
	// In here what we mean by Bean class is if our class have
	// variables
	// Access modifiers
	// Constructors
	// toString() Method
	// getters/setters
	// So all of this is part of a design pattern or we call it Bean class
	
	
	
	// Encapsulation/Data Hiding
	// Is the idea of making your variables private or not easily access able
	// How we can do that is through Access modifiers
	
	// Access Modifiers :- we use them to define our level of access to our classes, methods and variables
	// there 4 types :- public, protected, default, private
	
	// public : you can access it in the entire project
	// private : you can only access it within the same class
	
	
	
	// So everything we create (class, method, variables) will have access modifiers
	// Even if it does not have or you do not mention one
	// By default the access modifier will be default
	// And we don't have a keyword for default access modifier
	// But for the rest we have keywords like (public, protected, private)
	// And we have to define that in the beginning of creating our class, method or variables
	
	
	
	String name; // In here our variable access modifier is default
				 // But if I make the access modifier private in here
				 // I will no longer be able to access this variable in my Runner class
				 // Because in private modifier we can only have access in this same class, not outside of this class
	
	private String lastName; // In here we have defined our variable access ability to private
							 // Which means we only have access to it in this class and that is it
							 // But there is a way that we can access these private (variables, methods, classes)
							 // By setting up getters and setters method
	
	public Product_Encapsulation() { // In here the access modifier is public and we have defined it with the keyword (public)
					   // And this constructor is access able in all our project
		this.name = "";
		this.lastName = ""; // Remember this is private variable
	}
	
	public Product_Encapsulation(String name) {
		this.name = name;
		
	}
	
	
	// getters and setters / accessor's or mutators
	
	// These are public methods that will help us return or change a variable if it is set to private or access ability to it is limited
	// The logic how we can get/access our private variable is
	// First our get method is public in this class, which will help us if we want to access it in our project
	// Second its at the same class as where our private variable (lastName) is located
	// Which means we can still access our private class in our other classes in project through getter method
	// So we can think of it as a security bridge between our protected and private (variables, methods, classes) 
	// And our other classes in the project which wants to access those (variables, methods and classes)
	
	// The logic of how we can set/change our private variable value is the same as how the getter method works
	// The only difference is that in this method we actually set a value or change it
	// Whereas in getter method, we return a value.
	
	public String getLastName() { // This is a getter, which will return our variable value as a String, because the return type is String
							  // We can think about it as an extra step before accessing our variable
							  // It seems as a unnecessary the way its defined in here
							  // But we can still have conditions put to it before it returns anything
							  // For example, we can say check and see if the accessor is admin.
							  // If yes, return the value, If not do not return anything
		return lastName;
	}
	
	public void setLastName(String LastName) { // This is a setter, which will help us change our variable value
		this.lastName = LastName;
	}
	
	
	
	
	
	
	
	
	
}
