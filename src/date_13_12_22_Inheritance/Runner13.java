package date_13_12_22_Inheritance;


public class Runner13 {

	public static void main(String[] args) {
		
		Employee obj1 = new Employee("Jack", "Ma", "jackMa@domain.com", "M", 35, "Admin", 123);
		
		System.out.println(obj1);
		
		Instructor obj2 = new Instructor("Anna", "Davidson", "Anna@Domain.com", "F", 27);
		obj2.addSubject("Java");
		obj2.addSubject("Python"); // this method adds subject
		obj2.addSubject("JS");
		obj2.addSubject("C++");
		obj2.addSubject("C#");
		System.out.println(obj2);
		
		
		Student obj3 = new Student("David", "Jackson", "David@gmail.com", "M", 35, "Admin", 456, 3.8, "Computer Science");
		System.out.println(obj3);
		
	}

}
