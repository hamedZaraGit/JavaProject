package date_19_12_22_Specifiers_Non_AccessModifiers;

import java.util.ArrayList;

public class Student {

	private String firstName;
	
	static int count;
	int id;
	
	static ArrayList<Student> allStudents = new ArrayList<Student>();
//	We created this static ArrayList to store all every new student we add to the list
//	By creating a static method by name of addStu, each time we add student, we return the value and add it to the list
//	Remember that this is a static ArrayList, which means a class level.
	
	
	private Student() {
		super();
		this.firstName = "";
		count++; // to keep track of how many time object of our class will be called
		id = 1000 + count;
	}
	
	private Student(String firstName) {
		this();
		this.firstName = firstName;
	}
	
	
	
	
	
	public static Student addStu(String firstName) {
//		This is the method that will return each student we add to our static ArrayList
		Student obj = new Student(firstName);
//		In here its basic object creation, but we do it inside this method so we don't have to create objects of our class in other classes
//		It takes care of creating object of our class
		allStudents.add(obj);
//		In here each time method is called in our Runner class, and value is added, 
//		value of that object will be added in our static ArrayList<Student> allStudent
		return obj;
	}

	
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Student [" + " ID: "+ id +  " ,firstName = " + firstName + " " + ",object of Student: " +  count + "]";
	}
	
	
	
	
	
}
