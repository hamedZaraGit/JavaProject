package date_30_11_22_OOP;

public class Runner {

	public static void main(String[] args) {
		
		String str = new String("test");

		StudentExample stu = new StudentExample();
		stu.firstname = "jack";
		stu.lastName = "ma";
		stu.age = 48;

		StudentExample st2 = new StudentExample("David", "Jackson", 25);

		
		System.out.println("This is useing parameterized constructor:  " + st2.firstname + " " + st2.lastName + " " + st2.age);
		
		
		System.out.println("-----------------------------------");
		System.out.println(stu.firstname.length());
		System.out.println(stu.lastName);
		System.out.println(stu.age);

		System.out.println("-----------------------------------");
		stu.printStudInfo();
		st2.printStudInfo();
		
	}

}
