package date_15_11_22_ifStatements;

public class ConditionalOperatorExample {

	public static void main(String[] args) {

		
		
		// conditional operator  
		// (conditions) ? true : false;
		// after question mark, the values data type should match what you
		// have before the equal sign
		// conditions must always result into a boolean

		double grade = 98;
		String res = grade > 60 ? "Pass" : "Fail";
		System.out.println(res);

		
		boolean x = false;
		System.out.println(!x || grade > 50 ? "yes" : "no");

		
		
		
		System.out.println("\n" + "---------------------------------------------------------------" + "\n");
		
		
		System.out.println("Example 1: ");
		
//		steps
//		Declare below variables and assign values to them. (Choose proper datatype)
//		firstNumber = 30;
//		secondNumber = 7.5;
//		thirdNumber = 5.5;
//		forthNumber= 11.5;
//		fifthNumber = 5.5;

		int firstNumber = 30;
		double secondNumber = 7.5;
		double thirdNumber = 5.5;
		double forthNumber = 11.5;
		double fifthNumber = 5.5;

//		Find sum of below variables.
//		secondNumber
//		thirdNumber
//		forthNumber
//		fifthNumber

		double sum = secondNumber + thirdNumber + forthNumber + fifthNumber;
//		System.out.println(sum);

//		check sum of step 2 is equal to firstNumber and print the result.
//		check sum of step 2 is less than firstNumber and print the result.
//		check sum of step 2 is greater than firstNumber and print the result.

		System.out.println(sum == firstNumber ? "true" : "false");
		System.out.println(sum < firstNumber ? "true" : "false");
		System.out.println(sum > firstNumber ? "true" : "false");

//		Expected Output
//		true
//		false
//		false
		
		System.out.println("\n" + "---------------------------------------------------------------" + "\n");

		System.out.println("Example 2: ");


		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
