package date_12_12_22_Encapsulation;

public class Runner12 {

	public static void main(String[] args) {
		
		
		Product_Encapsulation obj1 = new Product_Encapsulation();
		
		System.out.println(obj1.name); // This will print in console, 
									   // but will not print any value it will be blank space
									   // because we haven't assigned any values to it in our Product class
		
		obj1.name = "This is name input we just added"; // In here we assigned value to our Product class object/copy
		
		System.out.println(obj1.name); // So now with the value just added in code line above,
									   // ُThe console will print the value we assigned to it "This is name input we just added"
		
		
		
		System.out.println(obj1.getLastName()); // We are calling on getter method in here because the variable we want to access is private
												// But it will return blank space since we have not yet set or have any values set for it right now
		obj1.setLastName("Zara"); // same happens here, we are calling our setter method because we want to set or change our private variable value
		System.out.println(obj1.getLastName()); // Now this will return the value we have set up for our private variable
		
		
	}
	
	
		

}
