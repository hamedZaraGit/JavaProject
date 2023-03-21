package date_05_12_22_Constructors;

public class Runner {

	public static void main(String[] args) {
		
		
//		How to call your class and create object of it
		
//		data-type identifier = new data-type(args);
		
		
//		calling default constructor: 
//		we use it we we want to create an empty object of the class
//		this is better if you dont have your data at hand and use it later on
		
		Student obj1 = new Student(); 
		
		System.out.println(obj1.firstName);
		
		
//		calling parameterized constructor: 
//		we use parameterized when we the data at the time we create our object
//		this is better if you have your data at hand
		
		Student obj2 = new Student("Jack"); // In here we are passing String ("Jack") as our (argument)
											// because we have defined in our Student class String as an argument for our constructor
		
		System.out.println(obj2.firstName);
		
		
		
		System.out.println("\n" + "------------BOOK Example----------------" + "\n");
		
//		default construcot example for class book.
		Book b1 = new Book();
		
		System.out.println(b1.numberOfPages); // In here it will print us 0, 
//												 because we have not provided any value in our default constructor
		
		
		
		System.out.println("\n" + "-------Parameterized--------" + "\n");
		
//		parameterized constructors example for class Book
//		Example 1:
		
		System.out.println("Example 1: " + "\n");
		
		Book b2 = new Book("Harry Potter", 24.99);
	
		System.out.println(b2.title + " " + b2.price);
		
		
		System.out.println();
		
		
		
		System.out.println("-----------------------------");
		System.out.println("Example 2: " + "\n");
		
		Book b3 = new Book("The Alchemist", "Paulo", "Novel", "May/12/1995", 1.3, "123-41411-223", 24.99, "Penguin", 247);
		
		System.out.println(b3.title + "\n" +b3.author + "\n" +b3.genre + "\n" +b3.issueDate + "\n" +b3.version + "\n" +b3.ISBN + "\n" +b3.price + "\n" +b3.publisher + "\n" +b3.numberOfPages);
		
		
		System.out.println("---------------------------");
		
		b3.printBookInfo(); // In here we have already defined in our method to print the info when we call on it.
							// Thats why we only call have to call it
		
		
		
//		This is for generating dash function example 
		System.out.println(b3.generateDashes(50));
		
		
		
//		toString()
		Student object1 = new Student();
		
		System.out.println(object1); // in here the toString does not need you to call a function for your object variable
									// since it already defined in your toString() method in your Student class.
		
		
		
		
		
		
		
	}

}
