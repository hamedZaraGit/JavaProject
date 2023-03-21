package classPractice;

public class ClassPracticeQuestions {

	public static void main(String[] args) {
		
		
		
		
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
