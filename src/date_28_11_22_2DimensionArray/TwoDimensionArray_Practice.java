package date_28_11_22_2DimensionArray;

public class TwoDimensionArray_Practice {

	public static void main(String[] args) {
		
		System.out.println("\n" + "------------------------------------------" + "\n");
		System.out.println("Example 1: " + "\n");
		
//		Create a 2 dimension array of int and assign the  following values
		
		/*
		 * Values
		 
		 83 12 72
		 54 88 51
		 61 90 32
		 14 49 26
		 39 76 84
		 41 42 5
		 
		 */
		
		
//		{{}                             }
		
		
		
		int [][] numbers = {{83, 12, 72}, {54, 88, 51}, {61, 90, 32}, {14, 49,26}, {39, 76, 84}, {41, 42, 5}};
		
		System.out.println("Count: " + numbers.length); // In here count is 6, because we are only counting the row
		
		int sum = 0;
		int count = 0;
		double avg = 0;
		
//		Loop through store, and print the values
		
		
		for(int row = 0; row < numbers.length; row++) {
			
//			System.out.print(numbers[0][row] + " ");
			for(int column = 0; column < numbers[row].length; column++) {
				System.out.print(numbers[row][column] + " ");
				
				
			sum = sum + numbers[row][column];
			

			}
			count += numbers[row].length;
			System.out.println();
			
		}
		
		
//		Optional:
//		Find the sum of all the values in the array
//		Find the sum of each row
//		Find the average of all of the values in the array
		
		
		System.out.println("Sum of all values: " + sum);
		System.out.println("Count: " + count); // In here, count is 18 because we also counted all of the values stored in columns
//		Average = Sum of Values/Number of Values
		avg = (double) sum / count;
		System.out.println("Average: " + avg);
		
		
		
		System.out.println("\n" + "------------------------------------------" + "\n");
		System.out.println("Example 2: " + "\n");
		
		/*
		 * Example 2
		 * 
		 * Q1
		 * Create an int with the name n and assign value 1
		 * write a loop that runs 3 times
		 * in each iteration of that, write a loop that runs for 4 times
		 * on every iteration of inner loop, print n++ and space on the same line
		 * Go to the next line after each cycle of the inner loop
		 * 
		 * Optional:
		 * if the number is one digit, print a zero before that
		 * otherwise don't print anything
		 * 
		 */
		System.out.println("Q1: " + "\n");
		
		
		int n = 1;
		
		
		for(int q1A = 0; q1A < 3; q1A++) {
//			System.out.print(q1A);
			for(int q1B = 0; q1B < 4; q1B++) {
				if(n < 10) {
					System.out.print("0");
					}
				System.out.print(n++ + "\t");
			}
		
			System.out.println();
		}
		 
		 
		 
		 
		 /* 
		 * Q2
		 * write a loop that runs for 5 times
		 * In each iteration of that, write another loop that runs for 3 times
		 * In each iteration of that 3 time, check and see
		 * if the sum of the counter of outer and inner loop is even or odd
		 * 
		 * print your findings accordingly
		 */
		

		
		for(int outer = 0; outer < 5; outer++) {
			
			for(int inner = 0; inner < 3; inner++) {
				if((outer + inner)%2 == 0) {
					System.out.println((outer + inner) + " is Even");
				} else {
					System.out.println((outer + inner) + " is Odd");
				}
			}

		}
		
		
		
		
		
		
		
		
		
		
	}

}
