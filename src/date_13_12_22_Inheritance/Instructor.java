package date_13_12_22_Inheritance;

import java.util.ArrayList;

public class Instructor extends Person{
	
    private ArrayList<String> subjects;
    
    // constructors
    
    public Instructor() {
    	super();
    	this.subjects = new ArrayList<String>();
    }
    
    public Instructor(String firstName, String lastName, String email, String gender, int age) {
    	super(firstName, lastName, email, gender, age);
    	this.subjects = new ArrayList<String>();
    }
    
    // getters & setters
    
    public ArrayList<String> getSubjects(){
    	return subjects;
    }
    public void setSubjects(ArrayList<String> subjects) {
    	this.subjects = subjects;
    }
    
//    creating method to add subjects
//    it should take a String and add it to the list subjects. returns nothing.
    
    public void addSubject(String subject) { // this method will add subject to our Array list of subjects
    	subjects.add(subject);
    }

    
    // toString
    @Override
    public String toString() {
    	return "Instructor [" + super.toString() + " -  subjects = " + subjects + "]";
    }


}
