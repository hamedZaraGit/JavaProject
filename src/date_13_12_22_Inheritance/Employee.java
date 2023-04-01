package date_13_12_22_Inheritance;

public class Employee extends Person{

//	create a class to store employee information
	
//	choose 5 variables/attributes that you want to store
//	encapsulate your class
	
	
	private String position;
	private int employeeID;
	
//	create 2 constructors
//	Helps us create object of our class in other classes
//	also helps us initialize our variables in this class
	
	
//	default constructor - does not ask to pass any value in other classes through our class object in other class
	
//	Constructor chaining
//	Means in this constructor I am going to call another constructor, like a chain 
//	!!!! constructor chaining must be the first statement of your constructor !!!!, or else it would not work
//	You have an option to call another constructor of either current or immediate parent class
//	You use the keyword (this or super) and then match the signature
	
	public Employee() {
		super();
//		In here by using (super) keyword, we are initializing all our variables from our parent class to this class
//		Through calling the default constructor from our parent class, which is (Person) class
		this.position = "";
//		this keyword - addresses the variables of the current scope
		this.employeeID = 0;
	}
	
	
	public Employee(String position, int employeeID) {
		this(); // calls this current class default constructor above
				// which means you actually chained this constructor to the default constructor above
				// And constructor above is chained to parent class using super keyword.
				// So if anything changes in super class, it will change in here automatically
		this.position = position;
		this.employeeID = employeeID;
	}
	
//	parameterized constructors - asks for values to pass if called through our class object in other classes
	public Employee(String firstName, String lastName, String email, String gender, int age, String position, int employeeID) {
		super(firstName, lastName, email, gender, age);
//		In here super keyword inherits the arguments from parent class, which is person class
		this.position = position;
		this.employeeID = employeeID;
	}
	
	
//	create getters and setters
	
	
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	
	public int getemployeeID() {
		return employeeID;
	}
	public void setemployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	
//	create toString()
	public String toString() {
		return "Employee [" + super.toString() + ", position: " + position + ", EpmloyeeID: " + employeeID + "]";
	
	}

}
