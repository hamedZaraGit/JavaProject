package date_21_11_22_Array_Loop;

import java.util.Random;
import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {

		// While Loop Syntax
		// while (Condition) {
//		
//									}

		System.out.println("While loop Syntax" + "\n");
		System.out.println("while (Condition) {      };");
		System.out.println("Example 1" + "\n");

		int i = 0;

		while (i < 10) { // What we are doing here is that, we are defining condition that as long as i
							// which is 0
							// i which is 0 is less than 10,
							// print each time i until it reaches 10
			System.out.println(i++); // and by (i++) we are defining that print i first
										// then add 1 to i and print again until it reaches 10
		}

		System.out.println("\n" + "-------------------------------------" + "\n");

		System.out.println("Example 2" + "\n");

		System.out.println("Using loops with Arrays" + "\n");

		String[] names = { "Jack", "Jill", "Ahmad", "Abdul", "Haris", "Hanan", "Tyler" }; // this is another way of
																							// initializing
																							// your multiple arrays at
																							// once

		System.out.println("This is the length of your array: " + names.length); // to find the length of your array
		System.out.println("");
		int index = 0;

		while (index < names.length) { 
			// In here what we are saying is
			// as long as index is less than our array length
			// loop through it and print until it reaches mets the condition

			System.out.print(names[index++]);
			// By doing this (names[index++])
			// we are saying each time you loop
			// print that index and assign the array value in that index

			if (index == names.length) {

			} else {
				System.out.print(", ");
			}
		}


		System.out.println();
		
		

		index = names.length - 1; 
		// In here what we are doing is, we are assigning the length of our array length
		// to index

		while (index >= 0) { 
			// and then we are reversing the whole process by doing this
			// meaning we start from the last index and come down from there

			System.out.print(names[index--]);
			if (index >= 0) {
				System.out.print(", ");
			} else {

			}
		}
		
		
		
		
		
		System.out.println("\n"+ "-------------------------------------" + "\n");

		System.out.println("Example 4" + "\n");
		
		// Event Controlled Loop
		// There is a value for password
		// Create an Scanner object and ask user to enter pass
		// keep asking for as long as the pass does not match

		String password = "pass123";

		Scanner scn = new Scanner(System.in);

		System.out.println("Please enter your Password: ");

		String passInput = scn.nextLine();

		while (passInput.equals(password) == false) {
			System.out.println("invalid, please enter your password again: ");
			passInput = scn.nextLine();

		}
		System.out.println("Password valid");
		
		
		
		
		
		
		System.out.println("\n"+ "-------------------------------------" + "\n");

		System.out.println("Example 5" + "\n");
		
		
		
		// Create a random number within a range
		// ask the user to guess the number
		// if the guess value is larger than random number, say = go down
		// if the guess value is lower than random number, say = go up
		
		Scanner scn1 = new Scanner(System.in);
		Random rand = new Random();
		
		
		// Create a random number within a range

		
		int number = rand.nextInt(100);
		
		boolean guess = false;
		System.out.println(number);
		System.out.println("Guess the number ranging from 0 - 100");
		
		// ask the user to guess the number

		while(guess == false) {
			int userInput = scn1.nextInt();
			
			if(userInput > number) {
				System.out.println("go down");
				
			} else if (userInput < number) {
				System.out.println("go up");
				
			} else {
				System.out.println("you found the number: " + number);
				break;
			}

		}

	}

}
