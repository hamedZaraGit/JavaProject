package date_12_12_22_Encapsulation;

public class BankAccountRunner {

	public static void main(String[] args) {
		
		BankAccount user1 = new BankAccount("Daniel", "Smith", 27, "acc1234", 4999.54);
		
		System.out.println(user1.getFirstName()); // I am using get method to get my value for the first name
												  // Since its a private class I have to use get method to return the value
												  // If I don't, I can not call for the variable and can not access it
		
		// We can also change our current value of variables using setters
		user1.setFirstName("David");
		System.out.println(user1.getFirstName()); // So at this point our first name changed from "Daniel" to "David"
												  // Because we changed the value using the setter method
		
	}

}
