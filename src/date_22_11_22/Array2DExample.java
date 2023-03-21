package date_22_11_22;

public class Array2DExample {

	public static void main(String[] args) {
		
		
		int [][] numbers = new int [3][2];
		
		
//		To visualize it, the above declaration looks something like this
//				int [row][column] numbers = new int [3][2];

//		[row/3][column/2]
		
//			Column
//		Row []	[]
//		Row []	[]
//		Row []	[]
		
		
//		now lets try to assign some values to our rows and columns
//		assign value 4, to row 3 and column 1
//		and value 8, to row 3 column 2
		
		numbers [2][0] = 4;
		numbers [2][1] = 8;
//		Visualizing the above example
//		[][]
//		[][]
//		[4][8]
		
		System.out.println(numbers [2][0] = 4);
		System.out.println(numbers [2][1] = 8);
		
		
		
//		Assigning values in each of our array indexes
//		int [row][column] numbers = new int [3][2];

		
		numbers [0][0] = 1;
		numbers [0][1] = 2;
		
		numbers [1][0] = 3; // In here we are saying, go to 2nd row, 1st column. and assign value 3 in that index.
		numbers [1][1] = 4;
		
		numbers [2][0] = 5;
		numbers [2][1] = 6;
		
		
		
		
		
		
		
	}

}
