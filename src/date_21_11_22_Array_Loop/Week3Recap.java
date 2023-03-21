package date_21_11_22_Array_Loop;

import java.util.Random;

public class Week3Recap {

	public static void main(String[] args) {

		
		// Conditional Operator Example
		
		System.out.println("\n" + "Conditional Operator Example" + "\\n");

		
		int a = 10;
		int b = 5;
		
		boolean x = a > b ? b > 0 ? true : false : true;
		
		System.out.println(x);
		
		
		// Random class Example
		
		System.out.println("\n" + "Random class Example" + "\n");

		
		// By calling this class a random number will be provided each time you run the code
		
		Random rand = new Random();
		
		int z = rand.nextInt(70);
		
		System.out.println(z);
		
		
		// Switch Cases Example
		
		System.out.println("\n" + "Switch Cases Example" + "\n");
		
		String name = "Jack";
		
		
		switch (name) {
		case "Anna":
			System.out.println(1);
			break;
		case "Jack":
			System.out.println(2);
			break;
		case "Smith":
			System.out.println(3);
			break;

		default:
			System.out.println("Name does not exist");
			break;
		}
		
		
		
		
		
		
		
	}

}
