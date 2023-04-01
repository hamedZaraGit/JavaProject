package date_15_11_22_ifStatements;

public class GradeToLetterPractice {

	public static void main(String[] args) {

		
		double grade = 86;
		String res = "";
		
		// 95 - 100 A+
		// 90 - 94 A-
		// 85 - 89 B+
		// 80 - 84 B-
		// 75 - 79 C+
		// 70 - 74 C-
		// 65 - 69 D+
		// 60 - 64 D-
		// 00 - 59 F
	
		
		System.out.println("This is one way of writing your code to get your result: ");
		
		if(grade >=90) {
			//A
			res = "A"; 
			if (grade >= 95) {
				res += "+";
			}
			else {
				res += "-";
			}
	
		} else if (grade >= 80) {
			//B			
			res = "B";
			if(grade >= 85) {
				res += "+";
			} 
			else {
				res += "-";
			}
	
		} else if (grade >= 70) {
			//C
			res = "C";
			if(grade >=75) {
				res += "+";
			}
			else {
				res += "-";
			}
		
		} else if (grade >= 60) {
			//D
			res = "D";
			if(grade >= 65) {
				res += "+";
			}
			else {
				res += "-";
			}
		
		} else {
			//F
			res = "F";
		}
		
		System.out.println(res);
		
		System.out.println("\n" + "This is another way of writing your code to get your result, using Conditional Operator method: ");
		
		
		if(grade >=90) {
			res = grade >= 95 ? "A+" : "A-";
		} else if (grade >=80) {
			res = grade >= 85 ? "B+" : "B-";
		} else if (grade>=70) {
			res = grade >= 75 ? "C+" : "C-";
		} else if (grade >= 60) {
			res = grade >= 65 ? "D+" : "D-";
		} else {
			res = "F";
		}
		System.out.println(res);
		
		System.out.println("\n" + "This is another way of writing your code to get your result, using the regular if statement: ");

		
		
		
		
	}

}
