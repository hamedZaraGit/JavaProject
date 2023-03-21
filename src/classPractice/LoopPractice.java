package classPractice;

public class LoopPractice {

	public static void main(String[] args) {
		
//		Q1
//		Lets create an array of String, add values in it
//		create a loop to go through all of the names and print them
//		use for loop, the use for each loop
		
		String [][] names = {{"Jack", "Joe", "Katie", "Daniel"}, {"Zara", "Haris", "Hanan"}, {"Zabi", "Zuhaib", "Adel"}};
		
		for(int row = 0; row < names.length; row++) {
			for(int col = 0; col <names[row].length; col++) {
				System.out.println(names[row][col] + " ");
			}
		}
		System.out.println();
		
		
		
		
		
	}

}
