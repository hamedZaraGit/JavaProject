package date_29_11_22_ForEach;

public class IterationPractice {

	public static void main(String[] args) {
		
		
//		nested loops
		String [][] cars = {
				{"Toyota", "Benz", "BMW", "Chevy"}, 
				{"SUV", "Van"}, 
				{"2002", "2022", "1991"}
				};
		
		
//		System.out.println(cars[0].length);
//		for(int row = 0; row < 3; row++) {
//			for(int col = 0; col < cars[row].length; col++) {
//			System.out.print(cars[row][col] + " ");
//			
//			
//		}
//		System.out.println();
//		
//		}
		
		
		
//		For loop method:
		
		int [] nums = {15, 8, 1548, 23, 124, 12};
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println("For loop method: " + nums[i]);
		}
		
		System.out.println("------------------------------------------------");
		
//		For each Loop method:
		
//		is designed to go through the entire collection
		
//		Syntax for each loop:
		
//		for(int num: nums){body};
		
		for(int num: nums) {
			System.out.println("For each loop method: " + num);
		}
		
		
		
		
		System.out.println("------------------------------------------------");

		
		
		
//		Question
//		create a 2d array of int values and assign some values
//		go through the values in rows and columns and sum the values
//		print the sum
//		then sum the odd and even numbers separately
//		print a message that says which category is larger
		
		
		int[][] temp = { 
				{ 15, 1568, 15, 23, 5, 21 }, 
				{ 15, 8, 56, 4, 87, 7, 9 }, 
				{ 95, 84, 7, 23, 6, 4 } };
		int sumAll = 0;
		int sumOdd = 0;
		int sumEven = 0;

		for (int[] row : temp) {
			for (int num : row) {
				if (num % 2 == 0) {
					sumEven += num;
				} else {
					sumOdd += num;
				}
				// in a row
				System.out.println("SumEven " + sumEven + ", SumOdd "+ sumOdd);
			}
			// after each row is completed
			System.out.println("End of Row Result - SumEven " + sumEven + ", SumOdd "+ sumOdd);
			
		}
		sumAll = sumEven + sumOdd;

		System.out.println("sumAll " + sumAll);
		System.out.println("sumEven " + sumEven);
		System.out.println("sumOdd " + sumOdd);
		System.out.println(sumEven > sumOdd ? "Sum Even is larger" : "Sum Odd is Larger");
		
	}

}
