package basics;

public class Selection_IfStatements {

	public static void main(String[] args) {

		// short circuit operators
		// && and
		// || or
		// ! not
		// ^ xor // if both sides are different it results in true.

		System.out.println("Sytax/Structure of selection method" + "\n");

		System.out.println(
				"if (condition) {\n" + "your argument/True Block" + "		}" + "\n" +  "else " + "{" + "false block" + "\n" +"}");

		
		System.out.println("\n");
		
		
		boolean condition1 = true;
		boolean condition2 = false;
		
		if (condition1) {
			System.out.println("the value condition1 is ture"); // this block always checks if your condition is true.
											 // if true, it executes the block.
											 // if false, it jumps to false block.
		}
		else {
			System.out.println("the value condition1 is false"); // this is false block
		}
		
		
		System.out.println("\n");
		System.out.println("-------------------------------------------" + "\n");

		
		
		
		
		System.out.println("Simple (if statements) example" + "\n");

		int a = 5;
		int b = 15;

		// write a program to check the value
		// your program should print which in is bigger

		if (a > b) {
			System.out.println(" \"a\" is bigger.");
		} else if (a < b) {
			System.out.println(" \"b\" is bigger.");
		}

		System.out.println("\n");
		
		System.out.println("Example 2: Finding largest value" + 
		"\n");
		
		
	// Largest
		// write a program to check the value
		// which value is the largest

		int b1 = 500;
		int b2 = 1000;
		int b3 = 150;
		int b4 = 200;
		int b5 = 130;
		

		int largest = b1;


		// Finding largest
		// To check if different values are correct. you can just add more (if statements) to check.
		// not (else if statement), because else if statement continues your current (if statement).
		
		if (b2 > largest) {
			largest = b2;
		}
		if (b3 > largest) {
			largest = b3;
		}
		if (b4 > largest) {
			largest = b4;
		}
		if (b5 > largest) {
			largest = b5;
		}
		
		System.out.println("The largest value found is: " + largest);
		
		
		

		System.out.println("----------------------------------------------------" + "\n");

		
		
		
		
		System.out.println("Grade Excersise" + "\n");
		// values
		double grade = 75;

		// write a code to check this number and print A
		// if the number is more than 90
		// if the grade is in the following ranges print ranges
		// 90 - 100 A
		// 80 - 89 B
		// 70 - 79 C
		// 60 - 69 D
		// F

		if (grade >= 90 && grade <= 100) {
			System.out.println("A");
		} else if (grade >= 80) {
			System.out.println("B");
		} else if (grade >= 70) {
			System.out.println("C");
		} else if (grade >= 60) {
			System.out.println("D");
		} else if (grade <= 59.99) {
			System.out.println("F");
		} else {
			System.out.println("Grade is not a valid number");
		}

		
		
		
		System.out.println("---------------------------------------------------" + "\n");

		
		
		
		
		System.out.println("Price & Shipping Excercise" + "\n");

		// values
		double amount = 25;
		double shipping = 0;

		// write a program that checks to see if the total amount is more than 30
		// if so shipping is free
		// if the amount is less than 30
		// then shipping is 10$
		// once your program is done, print the shipping cost and the amount

		if (amount > 30) {
			shipping = 0;
		} else if (amount < 30) {
			shipping = 10;
		}

		System.out.println("Amount: " + amount + "$");
		System.out.println("Shipping Cost: " + shipping + "$");
		System.out.println("Total Amount: " + (amount + shipping) + "$");
		
		
		
		

		System.out.println("-----------------------------------------------------------" + "\n");

		
		
		
		
		System.out.println("Percentage adding example to the shipping");

		boolean c = false;
		// if the amount is less than 30, and boolean is false
		// then shipping is 5% of the amount + a 5$ of fixed amount
		// if c is true, the shipping is just 7% of the amount

		if (amount < 30 && c == false) {
			// 5% and 5$
			shipping = 0.05 * amount + 5;
//			System.out.println(shipping);
		} else if (amount < 30 && c == true) {
			// 7%
			shipping = 0.07 * amount;
//			System.out.println(shipping);
		}

		System.out.println("Amount is: " + amount + "$");
		System.out.println("Percentage added on shipping: " + (shipping) + "$");
		System.out.println("Total cost is: " + (amount + shipping) + "$");

		
		
		
		
		System.out.println("------------------------------------------------------------" + "\n");

	
		
		
		
		
		System.out.println("Insurance Practice" + "\n");

		// Values
		double age = 48;
		boolean insurance = true;
		double cost = 10589.95;
		double payOutOfPocket = 0;
		double insuranceCoverage = 0;

		// check conditions below
		// if the age is between 35-50
		// and patient has insurance
		// pay out of pocket should be 10% of total cost

		if (age > 35 && age < 50 && insurance == true) {
			payOutOfPocket = cost * 0.1;
//			System.out.println(payOutOfPocket);  // I am just printing in this section to check my code, if its doing what its supposed to do.
			// Which is to figure out 10% of the cost.
		}

		// if the age is in range 35-50
		// patient does not have insurance
		// pay out of pocket should be 85% of total cost

		else if (age > 35 && age < 50 && insurance == false) {
			payOutOfPocket = cost * 0.85;
//			System.out.println(payOutOfPocket);
		}

		// if the age is between 18-25
		// and patient has insurance
		// pay out of pocket should be 35% of total cost

		else if (age > 18 && age < 25 && insurance == true) {
			payOutOfPocket = cost * 0.35; // 0.35 means 35 divided 100
//			System.out.println(payOutOfPocket);
		}

		// if the age is in range 18-25
		// patient does not have insurance
		// pay out of pocket should be 95% of total cost

		else if (age > 18 && age < 25 && insurance == false) {
			payOutOfPocket = cost * 0.95;
//			System.out.println(payOutOfPocket);
		}

		// any other condition, then patient should pay full price

		else {
			payOutOfPocket = cost;
//			System.out.println(cost);
		}

		// print a descriptive text to show the patient information and balance

		insuranceCoverage = (cost - payOutOfPocket);

		System.out.println("Patient age: " + age);
		System.out.println("Insurance: " + insurance);
		System.out.println("Cost: " + cost + "$");
		System.out.println("Pay out of Pocket: " + payOutOfPocket + "$");
		System.out.println("Insurance Coverage/Discounted Amount: " + (insuranceCoverage) + "$");

		
		
		
		
		
		System.out.println("\n" + "---------------------------------------------------------" + "\n");

		
		
		
		
		
		System.out.println("Insurance Practice with nested block method" + "\n");

		// Having if statements inside the if statements are called nested block method.

		// values

		double age2 = 48;
		boolean insurance2 = true;
		double cost2 = 10589.95;
		double payOutOfPocket2 = 0;
		double insuranceCoverage2 = 0;

		// Conditions are the same, but we do it in a nested block.
		// Insurance = true
		// age 35 - 50, pay out of pocket 10%
		// age 18 - 25, pay out of pocket 35%

		if (insurance2 == true) {
			if (age > 35 && age < 50) // in here we have stored an if statement inside the if statement, which we will
										// call it nested block.
				payOutOfPocket2 = cost2 * 0.1;
			else if (age > 18 && age < 25)
				payOutOfPocket2 = cost2 * 0.35;
			System.out.println(payOutOfPocket2);
		}

		// Insurance = false
		// age 35 - 50, pay out of pocket 85%
		// age 18 - 25, pay out of pocket 95%

		else if (insurance2 == false) {
			if (age > 35 && age < 50)
				payOutOfPocket2 = cost * 0.85;
			else if (age > 18 && age < 25)
				payOutOfPocket2 = cost2 * 0.95;
			System.out.println(payOutOfPocket2);
		}

		// any other condition, then patient should pay full price

		else {
			payOutOfPocket2 = cost2;
		}

		insuranceCoverage2 = cost2 - payOutOfPocket2;

		System.out.println("Patient age: " + age2);
		System.out.println("Insurance: " + insurance2);
		System.out.println("Cost: " + cost2 + "$");
		System.out.println("Pay out of Pocket: " + payOutOfPocket2 + "$");
		System.out.println("Insurance Coverage/Discounted Amount: " + (insuranceCoverage2) + "$");
	}

}
