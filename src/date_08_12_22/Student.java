package date_08_12_22;

public class Student {

	int age;
	String firstName;
	String lastName;
	String address;
	
	public Student() {
		
		this.age = 0;
		this.firstName = "";
		this.lastName = "";
		this.address = "";
	}
	
	public Student(int age, String firstName, String lastName, String address) {
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [age=" + age + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ "]";
	}
	
	
}
