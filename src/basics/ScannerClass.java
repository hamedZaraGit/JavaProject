package basics;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		// Scanner Syntax

		System.out.println("Scanner Sytax: " + "\n");

		System.out.println(
				"this is the Scanner Syntax of crating an object: Scanner sc = new Scanner (System.in);" + "\n");
		Scanner sc = new Scanner(System.in);

	
		
		System.out.println("------------------------------------------------------------------------------------------------" + "\n");

		
		
		
		// LogIn Example
		System.out.println("LogIn Example" + "\n");

		// values
		String userName = "hzara";
		String password = "zara123";

		// User name data input

		System.out.println("Please Enter username: ");

		String userNameInput = sc.next(); // for String input we use .next() to execute.

		if (userName.equals(userNameInput)) {
			System.out.println("Username correct"); // String userName = "hzara"; / if our input in the console matches
													// the user name value
													// / it should print "Username correct"

			// By keeping our password input inside the userNameInput block
			// which is called nested block
			// it maintains the flow,
			// if the user name is correct,
			// it then executes the password input for us
			// if the user name is not correct,
			// it will not execute the password input for us

			System.out.println("\n" + "Enter your password: ");

			String passwordInput = sc.next();

			if (password.equals(passwordInput)) {
				System.out.println("Password correct");
			} else {
				System.out.println("Password Incorrect");
			}

		} else {
			System.out.println("Incorrect Username");
		}

		
		
		System.out.println("\n" + "--------------------------------------------------------------------------" + "\n");

		
		
		
		// Number Input & Sum Example
		System.out.println("Number Input & Sum Example" + "\n");

		Scanner sc1 = new Scanner(System.in);

		double firstDecimalNum = 20;
		double secondDecimalNum = 50;
		double thirdDecimalNum = 10;

		double sum = firstDecimalNum + secondDecimalNum + thirdDecimalNum;
//		follow steps

//		print in console "Enter your first decimal number?"

		System.out.println("Enter your first decimal number?");

		double firstInput = sc1.nextDouble(); // for integer data type you can use the function the .nextDouble() to
												// execute integer input.

		
		
		
		
		// I commented this below section code because its condition based.
		// meaning I have to write the designated value that I have assigned in the console.
		// only then the program will go forward
		// else if wrong value is placed in the console, the program will not proceed forward
		// assigned valued as a condition example that I have put is the values that I have assigned in firstDecimalNum, secondDecimalNum, and thirdDecimalNum.
		
		
//		if (firstDecimalNum == firstInput) {
//			System.out.println("First input is: " + firstInput);
//
////			print in console "Enter your second decimal number?"
//
//			System.out.println("Enter your second decimal number?");
//
			double secondInput = sc1.nextDouble();
//
//			if (secondDecimalNum == secondInput) {
//				System.out.println("Second input is: " + secondInput);
//
////				print in console "Enter your third decimal number?"
//
//				System.out.println("Enter your third decimal number?");
//
				double thirdInput = sc1.nextDouble();
//
//				if (thirdDecimalNum == thirdInput) {
//					System.out.println("Third input is: " + thirdInput);
//
////					print the of sum this 3 number
////					if sum of the numbers is more than 100 print "sum of the numbers is greater than 100"
////					else print "sum of the numbers is less than 100"
//
//					System.out.println("Sum of all three numbers: " + sum);
//					if (sum > 100) {
//						System.out.println("sum of the numbers is greater than 100");
//					} else {
//						System.out.println("sum of the numbers is less than 100");
//					}
//				} else {
//					System.out.println("Wrong Input");
//				}
//			} else {
//				System.out.println("Wrong Input");
//			}
//
//		} else {
//			System.out.println("Wrong Input");
//		}

				
				
				
				// In this section I have not assigned any condition or any certain number for my program to check if it matches my assigned values.
				// meaning I can put any number in the console and then check if my total sum is larger or less than hundred.
				
				
		double sum3 = firstInput + secondInput + thirdInput;
		if (firstInput + secondInput + thirdInput > 100) {
					System.out.println("Sum off of all three numbers: " + sum3 + "\n" + "Sum of all three numbers is larger than 100");
				} else {
					System.out.println("Sum off of all three numbers: " + sum3 + "\n" + "Sum of all three numbers is less than 100");
				}
		
		
		System.out.println("\n" + "--------------------------------------------------------------------------" + "\n");


	
		
		System.out.println("Input & length Example" + "\n");

		
		// Problem 1
		System.out.println("\n" +"Example 1: " + "\n");
		
		// write a program that finds out which name is longer in length
		// first name = Jack
		// Last Name = Davidson
		
		String firstName = "Jack";
		String lastName = "jackson";
		
		System.out.println("first name characters: " + firstName.length());
		System.out.println("second name characters: " + lastName.length());
		System.out.println("\n");
		
		if(firstName.length() > lastName.length()) {
			System.out.println("first name: " + firstName + " with " + firstName.length() + " characters is longer than last name: " + lastName + " with " + lastName.length() + " Characters");
		}
		if(firstName.length() == lastName.length()) {
			System.out.println("first name: " + firstName + " with " + firstName.length() + " characters is longer than last name: " + lastName + " with " + lastName.length() + " Characters equal");
		}
		
		else {
			System.out.println("last name: " + lastName + " with " + lastName.length() + " characters is longer than first name: " + firstName + " with " + firstName.length() + " Characters");
		}

		
		
		System.out.println("\n" + "---------------------------------------------------------------------------------------" + "\n");
	
		
		
		
		
		// Problem 2
		System.out.println("Example 2: " + "\n");
		
		// write a program that takes two input in the console and checks the length of each
		// it will then tell you which one is bigger
		
		
		String firstInput1 = "";
		String secondInput2 = "";
		
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("please enter your input: ");
		String input1 = scn.next();
		firstInput1 = input1;
		System.out.println(firstInput1);
		
		System.out.println("Please enter your input: ");
		String input2 = scn.next();
		secondInput2 = input2;
		System.out.println(secondInput2);
		
//		check the length of each input it takes then tell you which one is bigger

		
		int temp1 = firstInput1.length();
		int temp2 = secondInput2.length();
		
		if(temp1 > temp2) {
			System.out.println("first input: " + firstInput1 + " with " + firstInput1.length() + " characters is bigger" );
		}
		if (temp1 == temp2) {
			System.out.println("first input: " + firstInput1 + " and " + secondInput2 + " are equal in length");
		}
		else {
			System.out.println("second input: " + secondInput2 + " with " + secondInput2.length() + " characters is bigger");
		}
	
		
		
		
		System.out.println("\n" + "-----------------------------------------------------------------------------------------------" + "\n");

		// Problem 3
		System.out.println("Example 3:" + "\n");
		
		// write a program that takes your input in the console
		// and print that in proper format
		
		
		
		
	}

}
