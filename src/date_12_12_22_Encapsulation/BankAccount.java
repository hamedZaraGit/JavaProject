package date_12_12_22_Encapsulation;

public class BankAccount {
	
	
	// Practicing accessing private variables and how we can access it using getters/setters
	
	private String firstName;
	private String lastName;
	private int age;
	
	private String accountNumber;
	private double balance;
	
	public BankAccount() {
		this.firstName = "";
		this.lastName = "";
		this.age = 0;
		this.accountNumber = "";
		this.balance = 0;
	}
	
	public BankAccount(String firstName, String lastName, int age, String accountNumber, double balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	
	
	
	
	

}
