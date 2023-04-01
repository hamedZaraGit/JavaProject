package date_13_12_22_Inheritance;

public class Person {
	
	// to create inheritance relation between classes, use keyword extends
	// one class can have one parent class, and many child classes
	// you inherit all of the variables and methods of the parent class
	// you do not get the constructors, but you can call them if needed
	// By default every class will have hidden constructor, but as soon as you create constructor. you no longer have access to default one
	
	// class Object is the parent of all of the classes
	// if you do not specify any extends for you class, it automatically extends class object
	// object class by default is parent class of all of the classes
	
	// this keyword = refers to the scope of current class
	// super keyword = refers to the scope of the parent class
	
	
	private String firstName;
	private String lastName;
	private String email;
	private String gender;
	private int age;

	public Person() {
		this.firstName = "";
		this.lastName = "";
		this.email = "";
		this.gender = "";
		this.age = 0;
	}

	public Person(String firstName, String lastName, String email, String gender, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// toString will give you a String representation of the object
	@Override
	public String toString() {
		return "firstName: " + firstName + ", lastName: " + lastName + ", email: " + email + ", gender: " + gender + ", age: " + age;

	}

}
