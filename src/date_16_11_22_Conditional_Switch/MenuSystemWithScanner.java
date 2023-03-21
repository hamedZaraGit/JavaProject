package date_16_11_22_Conditional_Switch;

import java.util.Scanner;

public class MenuSystemWithScanner {

	public static void main(String[] args) {

		// Step 1. Create your variables

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
//
			// Password:
			System.out.println("Please enter your password: ");
			pass2Input = scn4.nextLine();
			pass2 = pass2Input;
//			System.out.println(pass2);

			// Confirm password:
			System.out.println("Please enter your password to confirm: ");
			conPassInput = scn4.nextLine();

			if (conPassInput.equals(pass2)) {
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
			System.out.println("Option not available");
			break;
		}

	}

}
