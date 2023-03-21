package date_07_12_22_ProductsExample;

public class Product {
	
//	Variables
	String name;
	double price;
	int quantity;
	
	
//	Constructors
	
//	default constructor
	public Product() {
		this.name = "";
		this.price = 0;
		this.quantity = 0;
		
		
	}
	
	
//	parameterized constructor
	public Product(String name, double price, int quantity) { // arguments of the method in here is actually an input of your mehtod
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	
//	other Methods
	
	
	
	
//	toString() method:
//	toString() method is going to give you a string representation of your object in your Runner class
//	its a special method used generally on java
	
	
	public String toString() {
//		Example
//		this is how we want to a return/format our return
//		(M&M 8.99 8pcs)
		return "(" + name + "$ " +  price + " " + quantity + " pcs)";
	}
	

}
