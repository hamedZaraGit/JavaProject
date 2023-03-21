package date_13_12_22_Inheritance;

public class Employee extends Person{

//  create a class to store employees information
//  chose 5 variables/ attributes that you want to store 
//  encapsulate your class
//  create 2 constructors
//  create getters and setters
//  create a toString
    private String position;
    private int emploeeID;
    // constructors
    // used when creating object of this class
    // initialize variables of the class
    // this keyword - scope of the current class
    // constructor chaining
    // chaining must happen on the first statement of your constructor
    // you have an option to call another constructor of either current or immediate
    // parent class
    // you use the keyword, this or super and then match the signature
    public Employee() {
        super();
        this.position = "";
        this.emploeeID = 0;
    }
    public Employee(String position, int employeeID) {
        super();
        this.position = position;
        this.emploeeID = employeeID;
    }
    public Employee(String position, int employeeID, String firstName, String lastName, String email, String gender,
            int age) {
        super(firstName, lastName, email, gender, age);
        this.position = position;
        this.emploeeID = employeeID;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public int getEmploeeID() {
        return emploeeID;
    }
    public void setEmploeeID(int emploeeID) {
        this.emploeeID = emploeeID;
    }


}
