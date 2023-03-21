package date_16_11_22_Conditional_Switch;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		System.out.println("switch case examples" + "\n");

		System.out.println("Example 1: " + "\n");

//		Question1
		System.out.println("Question 1" + "\n");

		/*
		 * switch(key){
		 * 
		 * case "sat":
		 * 
		 * 
		 * }
		 * 
		 * Logic of switch cases: if the key matches a case, we will start executing
		 * from there and we will go all the way to the end
		 * 
		 * 
		 * break will stop and get out of switch
		 * 
		 * default block works exactly like else
		 * 
		 */
		String day = "wed";

		switch (day) {
		case "sat":
			System.out.println("The day is Saturday");
			break;
		case "sun":
			System.out.println("The day is Sunday");
			break; // if I do not have the break keyword mentioned in here,
					// the flow of execution will continue until it reaches the end or break keyword
		case "mon":
			System.out.println("The day is Monday");
			break;
		case "tue":
			System.out.println("The day is Tuesday");
			break;
		case "wed":
			System.out.println("The day is Wednesday");
			// I have not included break at this point and until the end of code lines
			// so if my value in the key day = "wed",
			// it will execute the case "wed" and print out all the cases until the end.
		case "thur":
			System.out.println("The day is Thursday");

		case "fri":
			System.out.println("The day is Friday");

		default:
			System.out.println("The day is not valid");
			break;

		}

		System.out.println(
				"\n" + "--------------------------------------------------------------------------------" + "\n");

		System.out.println("Example 2: " + "\n");

//		Question 2
		System.out.println("Question 2" + "\n");

		int x = 1;

		switch (x) {

		case 1:
			System.out.println("The number is 1");
			break;

		case 2:
			System.out.println("The number is 2");
			break;

		default:
			System.out.println("The number is out of the key range cases written");

		}

		System.out.println(
				"\n" + "--------------------------------------------------------------------------------" + "\n");

		System.out.println("Example 3: " + "\n");

		// Question 3
		System.out.println("Question 3" + "\n");

//		Follow Steps
//		We have below student in the class

		String student = "John";

//		"Joe" , "Smith" "Benjamin" , "Emily" , "Oscar" , "Emma" , "Heidi"
//		write switch statement to check student names
//		check if "John" is student of the class

		switch (student) {
		case "Joe":
			System.out.println("Joe is student of this class");
			break;
		case "Smith":
			System.out.println("Smith is student of this class");
			break;
		case "Benjamin":
			System.out.println("Benjamin is student of this class");
			break;
		case "Emily":
			System.out.println("Emily is student of this class");
			break;
		case "Oscar":
			System.out.println("Oscar is student of this class");
			break;
		case "Emma":
			System.out.println("Emma is student of this class");
			break;
		case "Heidi":
			System.out.println("Heidi is student of this class");
			break;

//		if he is not student, print below message
//		"John is not student of this class"
		default:
			System.out.println(student + " is not student of this class");

			System.out.println(
					"\n" + "--------------------------------------------------------------------------------" + "\n");

			System.out.println("Example 4: " + "\n");

			System.out.println("switch case with scanner example" + "\n");

			// Question 4
			System.out.println("Question 4" + "\n");

//		Steps
//		we have 12 month per year

			int inputMonth = 0;

			Scanner scn = new Scanner(System.in);

			System.out.println("Please enter your month:");
			inputMonth = scn.nextInt();

//		write switch control statement for showed month 9 name

			switch (inputMonth) {
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("February");
				break;
			case 3:
				System.out.println("March");
				break;
			case 4:
				System.out.println("April");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("June");
				break;
			case 7:
				System.out.println("July");
				break;
			case 8:
				System.out.println("August");
				break;
			case 9:
				System.out.println("September");
				break;
			case 10:
				System.out.println("October");
				break;
			case 11:
				System.out.println("November");
				break;
			case 12:
				System.out.println("December");
				break;
//		add default at the end if user input invalid number "Your month number should be between 1 to 12"
			default:
				System.out.println("Your month number should be between 1 to 12");
			}

			System.out.println(
					"\n" + "--------------------------------------------------------------------------------" + "\n");

			System.out.println("switch case with scanner (Menu) example" + "\n");

			System.out.println("Question 5" + "\n");

			// Question 5

			// menu
			// 1. Login
			// 2. Create Account

			// you select option
			// 1. Login
			// User Name:
			// Password:
			// Give a message

			// you select an option
			// 2. Create an account
			// Email:
			// First Name:
			// Last Name:
			// Password:
			// Confirm password:

			Scanner scn4 = new Scanner(System.in);

			String login = "Login";
			String account = "Create and account";
			String userName = "hzara";
			String pass1 = "1234";

			String email = "";
			String firstName = "";
			String lastName = "";
			String pass2 = "";

			String emailInput = "";
			String firstInput = "";
			String lastInput = "";
			String pass2Input = "";
			String conPassInput = "";

			String userInput = "";
			String passInput = "";

			System.out.println("Choose your option: " + "\n" + "1. " + login + "\n" + "2. " + account);
			String menu = scn4.nextLine();

			switch (menu) {

			// you select option
			// 1. Login

			// User Name:
			// Password:
			// Give a message

			case "Login":
				System.out.println("Please enter your User Name: ");
				userInput = scn4.nextLine();
				if (userInput.equals(userName)) {
					System.out.println(userName);
					System.out.println("Please enter your password: ");
					passInput = scn4.nextLine();
					if (passInput.equals(pass1)) {
						System.out.println("continue");
					} else {
						System.out.println("Wrong Password");
					}

				} else {
					System.out.println("Wrong User Name");
				}

				break;

			// you select an option
			// 2. Create an account

			// Email:
			// First Name:
			// Last Name:
			// Password:
			// Confirm password:

			case "Create an account":
				// Email:
				System.out.println("Please enter your email: ");
				emailInput = scn4.nextLine();
				email = emailInput;
//			System.out.println(email);
//			
//			// First Name:
				System.out.println("Please enter your First Name: ");
				firstInput = scn4.nextLine();
				firstName = firstInput;
//			System.out.println(firstName);
//			
//			// Last Name:
				System.out.println("Please enter your Last Name: ");
				lastInput = scn4.nextLine();
				lastName = lastInput;
//			System.out.println(lastName);

				// Password:
				System.out.println("Please enter your password: ");
				pass2Input = scn4.nextLine();
				pass2 = pass2Input;
//			System.out.println(pass2);

				// Confirm password:
				System.out.println("Please enter your password to confirm: ");
				conPassInput = scn4.nextLine();

				if (conPassInput.equals(pass2Input)) {
					System.out.println("Password matches");
					System.out.println("");
					System.out.println("Email: " + email);
					System.out.println("First Name: " + firstName);
					System.out.println("Last Name : " + lastName);
					System.out.println("Password: " + pass2);
					System.out.println("Confirm Password: " + conPassInput);
				} else {
					System.out.println("Password not matching");
				}

				break;

			default:
				System.out.println("Wrong Input");
				break;
			}

		}

	}

}
