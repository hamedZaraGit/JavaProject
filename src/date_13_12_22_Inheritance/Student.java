package date_13_12_22_Inheritance;

public class Student extends Person{
	
    private double gpa;
    private String major;
    
    
    // constructors
    
    public Student() {
    	this.gpa = 0;
    	this.major = "";
    }
    
    public Student(double gpa, String major) {
    	this.gpa = gpa;
    	this.major = major;
    }
    
    
    // getters & setters
    
    public double getGpa() {
    	return gpa;
    }
    public void setGpa(double gpa) {
    	this.gpa = gpa;
    }
    
    public String getMajor() {
    	return major;
    }
    public void setMajor(String major) {
    	this.major = major;
    }
    
    
    // toString
    
    @Override
    public String toString() {
		return "Gpa: " + gpa + ", Major: " + major;
    	
    }
}
