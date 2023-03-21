package basics;

import java.util.Scanner;

public class CalculatorBasic {

	public static void main(String[] args) {
		
		
		
		// Calculator Example
		// Please enter 2 numbers
		// And choose Operator + - % / *
		// Print result
		
		double num1 = 0;
		double num2 = 0;
		
		String operators = "";
		
		double result = 0;
		
		// 1.  Create object of Scanner class and other variables
		Scanner scn = new Scanner(System.in);
		
		// 2. print the lines you want to show in the console
		System.out.println("Enter your Number");
		
		
		// 3. wait for the value you want to expect, take and store it.
		num1 = scn.nextDouble();

		
		// 4. ask the user to choose the operator
		System.out.println("Please choose operator (+ - * / %)");
		System.out.println("+");
		System.out.println("-");
		System.out.println("*");
		System.out.println("/");
		System.out.println("%");

		
		// 5. expect and catch the operator as a String
		operators = scn.next();

		
		
		System.out.println("Enter your next Number");
		num2 = scn.nextDouble();
		
		
		
		// 6. go through the selection to find which operator was selected
		if(operators.equals("+")) {
			result = (num1 + num2);
		} else if(operators.equals("-")) {
			result = (num1 - num2);
		} else if(operators.equals("*")) {
			result = (num1 * num2);
		} else if(operators.equals("/")) {
			result = (num1 / num2);
		} else if(operators.equals("%")) {
			result = (num1 + num2);
		}
		// 7. perform the operation in the selection to find and form and result
		
		// 8. print the result
		System.out.println(num1 + " " + operators + " " + num2 + " = " + result);
		
		
		
	}

}
