package date_12_12_22_Encapsulation;

import java.util.ArrayList;

public class IQ_FibNumbers {

		
		// Create a function that creates n number of fib numbers
		
		// fib numbers rule - we start with 1, 1, then every next number is the sum of two previous number.
		
		
		// create a method that returns an ArrayList of Integer = result
		// the function will take one int as input
		
		public ArrayList<Integer> fibNumsGenerator(int n){
			// i will create an ArrayList of numbers
			ArrayList<Integer> numbers = new ArrayList<>();
			
			// one way of doing it
			
			if(n == 0) {
				return numbers;
			}
			else if(n == 1) {
				numbers.add(1);
			}
			else{
				numbers.add(1);
				numbers.add(1);
			}
			
			
			
			
//			This is another way of doing it: 
			
			// i will add 1 and 1 to it
//			numbers.add(1);
//			numbers.add(1);
			// i will loop through for n-2 times
			for (int i = 2; i < n; i++) {
				int x = numbers.get(i-1) + numbers.get(i-2);
				numbers.add(x);
			}
			// n=5 means n = [1, 1, 2, 3, 5]
			return numbers;
		}
		// i will start at index 2
		// on each iteration, i will add two previous indexes
		// i will return the ArrayList of int's
		
		
		
		
		
		
		
		public static void main (String[] args) {
			IQ_FibNumbers temp = new IQ_FibNumbers();
			System.out.println(temp.fibNumsGenerator(10));
		}
		
		
		
		
		
	

}
