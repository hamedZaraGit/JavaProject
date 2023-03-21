package date_21_11_22_Array_Loop;

import java.util.Random;

public class ArraysExamples {

	public static void main(String[] args) {

		// arrays are a contiguous block of memory that fixed in size
		
		// Array Syntax
		
		// data-type [] name-of-array = new data-type [array-size];
		
		
		
		System.out.println("\n" + "-------------------------------------------------" + "\n");
		
		
		System.out.println("Question 1" + "\n");
		
		// Question 1
		
		// Create an array of String with size 10
		
		
		String [] name = new String[10];
		
		
		// To call a certain index or assign a value for a certain index Syntax
		// name-of-array [index number] = value;
		
		name [0] = "Emily";
		name [1] = "Jack";
		name [2] = "Smith";
		name [3] = "Abdul";
		name [4] = "Chris";
		name [5] = "Ahmad";
		name [6] = "Tyler";
		name [7] = "Mohammad";
		name [8] = "Jackson";
		name [9] = "Haris";
		
		
		System.out.println(name[3]);
		
		
		
		System.out.println("\n" + "-------------------------------------------------" + "\n");
		
		
		System.out.println("Question 2" + "\n");
		
		// Question 2
		
		// Create an array of double and name it grades
		// Size of this array should be 15
		
		double[] grades = new double [15];
		
		
		// Assign the values
		
		// 1.66
		// 12.45
		// 1258.12
		// 0.44
		// 223.54
		// 1.66
		// 12.45
		// 1258.12
		// 1234.22
		// 122.1
		// 32.12
		// 798.1
		// 3.23
		// 12.11
		// 43.2
		
		grades [0] = 1.66;
		grades [1] = 12.45;
		grades [2] = 1258.12;
		grades [3] = 0.44;
		grades [4] = 223.54;
		grades [5] = 1.66;
		grades [6] = 12.45;
		grades [7] = 1258.12;
		grades [8] = 1234.22;
		grades [9] = 122.1;
		grades [10] = 32.12;
		grades [11] = 798.1;
		grades [12] = 3.23;
		grades [13] = 12.11;
		grades [14] = 43.2;
		
		System.out.println(grades[5]);
				
		
		
		
		System.out.println("\n" + "-------------------------------------------------" + "\n");
		
		
		System.out.println("Question 3" + "\n");
		// Question 3
		
		// Create an Array of String and name it names and size 10
		// assign 10 name and print all 10
		
		String [] names = new String[10];
		
		names [0] = "George";
		names [1] = "Abdul";
		names [2] = "Ahmad";
		names [3] = "Claire";
		names [4] = "Tyler";
		names [5] = "Haris";
		names [6] = "Hanan";
		names [7] = "John";
		names [8] = "Cecil";
		names [9] = "Omer";
		
		System.out.println( names[0] + "\n" +
							names[1] + "\n" +
							names[2] + "\n" +
							names[3] + "\n" +
							names[4] + "\n" +
							names[5] + "\n" +
							names[6] + "\n" +
							names[7] + "\n" +
							names[8] + "\n" +
							names[9] + "\n");
					
		// Create an Array of ints and name it numbers with size 5
		// assign random values to all indexes / I am using Random class for this example to give me random numbers for the indexes.
		// Print all indexes
		
		int [] numbers = new int [5];
		
		Random rand = new Random();
		
		
		
		
		numbers [0] = rand.nextInt(50); // I am using Random class for this example to give me random numbers for the indexes every time.
		numbers [1] = rand.nextInt(50);
		numbers [2] = rand.nextInt(50);
		numbers [3] = rand.nextInt(50);
		numbers [4] = rand.nextInt(50);
		
		
		// sum index 0 and 1
		
		int sum1 = (numbers [0] + numbers [1]);
		System.out.println(sum1);
//		// sum index 2 and 3
		int sum2 = (numbers [2] + numbers [3]);
		System.out.println(sum2);
//		// First sum divide by index 4, times the second sum 
		int result = ((sum1 / numbers[4]) * sum2);
		System.out.println(result);
		
		
		
		
		

		
		
	}

}
