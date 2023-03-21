package date_05_12_22_Constructors;

public class BankAccount {

//	Step 1: Create variables
	
	String firstName;
	String lastName;
	String phone;
	String email;
	
	String accountNumber;
	double balance;
	
	
	
	
	
//	Step2: Create constructors
//	default constructor
	
	public BankAccount() {
		firstName = "";
		lastName = "";
		phone = "";
		email = "";
		accountNumber = "";
		balance = 0;
		
		
	}
	
	
	
	
//	this keyword
//	this: will refer to the scope of current class
	
//	parameterized
	
	public BankAccount(String firstName, String lastName, String phone, String email, String accountNumber, double balance) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.accountNumber = accountNumber;
		this.balance = balance;
		
		
	}
	
	
	
	
//	Step 3: Create other methods/functions
	
//	Checking balance method
	
//	it should print a message with account info
//	it should return the balance value
	public double checkBalance() {
		
		System.out.println("Account#: " + accountNumber 
				+ "\n" + "Full Name: " + firstName + " " +lastName 
				+ "\n" + "Current Balance: $" + balance);
		
		return balance;
	}
	
	
	
	
//	Deposit method
	
//	This function should accept a double value and add it to the balance
//	This function should print a confirmation message
//	it should return current balance on the account
	
	public double depositAccount(double add) {
		
		balance += balance + add;
		
		System.out.println("An amount of: $" + add + " had been added succesfuly!" +  "\n" + "Your Current Balance is: $" + balance);
		return balance;
	}
	
	
	
	
	
//	withdraw method
	
//	This function should accept amount, it should then check the balance
//	if the amount requested <= balance
//	return the amount withdrawn, print the confirmation message
//	reduce the balance by the amount withdrawn
	
	
//	if the amount requested is not <= balance
//	print a message that says "Insufficient Balance!"
//	return 0
	
	public double withdraw(double amount) {
		
		if(amount <= balance) {
			balance = balance - amount;
			System.out.println("A total of: $" + amount + " has been succesfuly withdrawn from your account.");
			System.out.println("Your current balance is: $" + balance);
			return amount;
		} else {
			System.out.println("Insufficient Balance!");
			return 0;
		}
		
	}
	
	
	
	
//	transfer method
	
//	this function should accept double amount, and it should check the balance
//	if the amount requested <= balance
//	it should let you transfer amount form one user to another user, and print confirmation message of the transfer
//	it should reduce current balance by the amount transfered
	
//	if the amount requested to transfer is not <= balance
//	print a message that says "Insufficient Balance!"
//	return 0
	
	
//	public double transfer(double amount) {
//		
//		if(amount <= balance) {
//			balance = balance - amount;
//			
//			
//			System.out.println("A total of: $" + amount + " has been transfered to: ");
//			
//			
//		} else {
//			System.out.println("Insufficient Balance!");
//			return 0;
//		}
//		
//		
//		return balance;
//	}
	
	
	
	
	
	
	
}
