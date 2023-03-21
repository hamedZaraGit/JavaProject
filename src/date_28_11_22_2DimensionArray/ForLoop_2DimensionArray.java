package date_28_11_22_2DimensionArray;

public class ForLoop_2DimensionArray {

	public static void main(String[] args) {
		
//		Example two dimension array
//		On how we can store values in 2 dimension array
		
//		int [][] numbers = new int [5][4];
		
		
/*
 * 
 * store the values in you array indexes
 * 
 * 	43 54 23 12
	12 43 232 942
	244 111 94 13
	9000 12 32 44
	123 84 75 64
 * 		
 */
		
		int [][] numbers = {
				{43, 54, 23, 12}, 
				{12, 43, 232, 942}, 
				{244, 111, 94, 13}, 
				{9000, 12, 32, 44}, 
				{123, 84, 75, 64}
		};
	
		
		
		System.out.println("row " + numbers.length); // In here, if we want to know how many indexes we have in our array
		System.out.println("colum " + numbers[0].length); // In here, if we want to know how many elements we have inside of each index
		
		
		
		
		
//		In here we are using this nested for loop to assign values to our rows and columns
		
		for(int row = 0; row < numbers.length; row++) {
			for (int column = 0; column < numbers[row].length; column++) {
//				System.out.println("Row " + row + " " + "Column "+ column + " = " + numbers[row][column]);
//				Above is commented out, its just an example if you want to know how for loop helps assign our values in rows and columns
				
				System.out.print(numbers[row][column] + " ");
			}
			
//			We are putting a "Sysout" so after each loop, it starts a new line
			System.out.println();
			
		}
		
	
		
		System.out.println("\n" + "---------------------------" + "\n");
		
		System.out.println("Using break and continue keyword in loop" + "\n");
		
		
//		Using break and continue keyword in for loop
		
//		break: means stop the loop / get out of the loop
//		continue: means go to next iteration / do not run the remaining part of this iteration / escape that iteration
		
		
//		Example:
		
		System.out.println("break example: " + "\n");
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i == 5) { 
				break; // so in here we are saying that once the iteration reaches 5. Stop!
			}
		}
		
		
		System.out.println("\n" + "---------------------------------" + "\n");
		
		System.out.println("continue example: " + "\n");
		
		for(int j = 0; j < 10; j++) {
			if(j == 5) {
				continue; // so in here we are saying that once it reaches 5, escape that and move to next iteration. which is 6.
			}
			System.out.println(j);
		}
		
		
		System.out.println("\n" + "---------------------------------" + "\n");
		
		System.out.println("using labels example: " + "\n");
		
//		x:
		
		
	}

}
