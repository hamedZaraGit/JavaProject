package date_22_11_22;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		
		
		System.out.println("Example 1: " + "\n");

		
//		Generate a Random number
//		Goal: to learn how to generate a random number within a given range
		
		Random rand = new Random();
		
		int start = 10;
		int end = 20;
		
		System.out.println(rand.nextInt(end - start +1) + start); // In this scenario we are stating
																  // that it should stay between range of 10 - 20
																  // not less than 10, not more than 20
		
		System.out.println(rand.nextInt(10)); // In here we are bounding the number to no exceed 10.
		
		
		
		
		System.out.println("\n" + "----------------------------------------------" + "\n");
		
		System.out.println("Example 2: " + "\n");
		
//		Finding odd number in a range of given numbers
//		you are given a range 
//		you are given expectedAmount, which is a number of odd values that is requested of you
		
//		10 - 100
//		expectedAmount = 20 
//		meaning give me 20 odd numbers from 10 - 100.
		
//		10 - 100
		start = 10;
		end = 100;
		int expectedAmount = 20;
		int count = 0;
		
		
		while(count < expectedAmount) {
			int r = rand.nextInt(end - start +1) + start;
			if(r % 2 != 0) {
				// odd
				System.out.println((count + 1) + ". " + r);
				count++;
			}
		}
		
		
		
		
		
	}

}
