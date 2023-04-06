package date_05_12_22_Constructors;

public class Book {

//	Steps to create constructors
	
	
//	Step 1: Create variables
	
	String title;
	String author;
	String genre;
	String issueDate;
	double version;
	String ISBN;
	double price;
	String publisher;
	int numberOfPages;
	
//	Until this step no space in the memory is taken
	
	
//	Step 2: Create constructor
	
//	default constructor example / Means when you don't have any parameters or arguments.
//								/ when the values are default
//								/ If you want to have values printed in the your runner class
//								/ you have provide your values in here
	public Book() {
		
		title = " ";
		author = " ";
		genre = " ";
		issueDate = " ";
		version = 0;
		ISBN = " ";
		price = 0;
		publisher = " ";
		numberOfPages = 0;
		
		
	}
	
//	parameterized constructor Book / Means we have arguments and parameters for it
	
	public Book(String newTitle, double newPrice) {
		
		this.title = newTitle;
		
		this.price = newPrice;
		
	}
	


	public Book(String newTitle, String newAuthor, String newGenre,String newIssueDate, 
			double newVersion, String newISBN,  double newPrice, 
			String newPublisher, int newNumberOfPages) {
		title = newTitle;
		author = newAuthor;
		genre = newGenre;
		issueDate = newIssueDate;
		version = newVersion;
		ISBN = newISBN;
		price = newPrice;
		publisher = newPublisher;
		numberOfPages = newNumberOfPages;
	}
	
	
	
	


	public void printBookInfo() {
		
		String line1 = "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Price: " + price;
		String line2 = "Genre: " + genre + ", Issued: " + issueDate + ", Version: " + version;
		String line3 = "Publisher: " + publisher + ", Pages: " + numberOfPages;
		System.out.println(generateDashes(findTheLongest(line1, line2, line3))); 
		System.out.println(line1);
		System.out.println(line2);
		System.out.println(line3);
		System.out.println(generateDashes(findTheLongest(line1, line2, line3))); 

		
	}
	
	
	
	
//	Create a function
//	that returns n number of -
//	Given 5 results: -----
	
	
	public String generateDashes(int n) {
		String res = ""; 
		
		for(int i = 0; i < n; i++) {
			res += "-";
		}
		
		return res; 
	}
	
	
	
//	Find the longest length among the 3 given strings
	
	public int findTheLongest(String s1, String s2, String s3) {

		int res = s1.length();

		if (s2.length() > s1.length()) {
			res = s2.length();
		}

		if (s3.length() > res) {
			res = s3.length();
		}

		return res;

	}
	
	

	
	
	
	
}
