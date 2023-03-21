package date_29_11_22_ForEach;

public class Recap_date_28 {

	public static void main(String[] args) {
		
//		nested loops
		String [][] cars = {
				{"Toyota", "Benz", "BMW", "Chevy"}, 
				{"SUV", "Van"}, 
				{"2002", "2022", "1991"}
				};
		
		
		System.out.println(cars[0].length);
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < cars[row].length; col++) {
			System.out.print(cars[row][col] + " ");
			
			
		}
		System.out.println();
		
		}
	}

}
