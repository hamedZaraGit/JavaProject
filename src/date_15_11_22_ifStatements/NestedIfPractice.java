package date_15_11_22_ifStatements;

public class NestedIfPractice {

	public static void main(String[] args) {

		// Guess the answers

		// change the values for practice
		// Guess how many if statements we have, for practice
		int a = 150;
		int b = 200;
		int c = 115;
		boolean x = true;
		boolean y = false;
		boolean z = false;

		if (x == true && z == false) {
			if (y == true) {
				if (z == true && x == false || y == true) {
					System.out.println("17");
				}
				System.out.println("1");
			} else {
				System.out.println("2");
			}
			System.out.println("3");
		} else if (y == false) {
			System.out.println("4");
			if (b > c) {
				if (z == true && z == false) {
					System.out.println("15");
				} else {
					System.out.println("16");
				}
				System.out.println("12");
				if (a > b || z == true || x == false) {
					System.out.println("5");
				}
				System.out.println("6");
				System.out.println("13");
			} else if (c > a) {
				System.out.println("7");
			}
		} else {
			if (a > b || z == true) {
				System.out.println("8");
				if (y == false || x == true) {
					System.out.println("9");
				} else {
					System.out.println("10");
				}
				System.out.println("11");
			} else {
				System.out.println("7");
			}
		}

	}
}
