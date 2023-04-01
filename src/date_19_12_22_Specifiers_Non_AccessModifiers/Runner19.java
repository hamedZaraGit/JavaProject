package date_19_12_22_Specifiers_Non_AccessModifiers;

import static date_19_12_22_Specifiers_Non_AccessModifiers.CostumerStaticPractice.takeScreenShot;
// This is called static import
// what it will do is, it will import the method so you don't have call the class every time you call the method
// So now you can just call the method, and it will execute
// You do this when you know the function is going to be used often in this class
// By importing the function we reduce the redundancy and save memory being efficient

public class Runner19 {

	public static void main(String[] args) {
		
		
		CostumerStaticPractice.takeScreenShot(); // In here we have called our static method
												 // It will execute the method
		
		
		takeScreenShot(); // This happens because we have imported the class method in this class
						  // So you don't need to call the class if you import it
		
		
		
		
//		Static members are called class level
//		Non-Static members are called object level

//		You do not need to have an object of the class to call a static member
//		If you change a value of a static member, it changes for the class and all of the objects at the same time
		
		
		Student obj1 = Student.addStu("Jack"); // In here we have created objects of our class, but by calling the addStu method
		Student obj2 = Student.addStu("Ahmad");
		Student obj3 = Student.addStu("Anna");
		Student obj4 = Student.addStu("David");
		
		System.out.println(Student.allStudents); // In here 
		
		
		for(Student s : Student.allStudents) {
			System.out.println(s);
		}
		
		
		
	}

}
