package date_05_12_22_Constructors;

import java.util.ArrayList;

public class Bank {
	
	
	// creating variables
	String address;
	String managerName;
	ArrayList<BankAccount> customers;

	// creating constructors
	public Bank() {
		this.address = "";
		this.managerName = "";
		this.customers = new ArrayList<BankAccount>();

	}

	public Bank(String address, String managerName) {
		this.address = address;
		this.managerName = managerName;
		this.customers = new ArrayList<BankAccount>();
	}

	// printBankInfo
	// print all of the bank information
	// manager name, address
	// list of customers
	public void printBankInfo() {
		System.out.println("Manager: " + managerName);
		System.out.println("Address: " + address);
		System.out.println("********* Cutomer List *********");
		for (int i = 0; i < customers.size(); i++) {
			System.out.println((i + 1) + ". " + customers.get(i).accountNumber + " " + customers.get(i).balance);
		}
	}

	// add customer function
	// should accept an object of BankAccount
	// it should then add it to the list
	public void addCustomer(BankAccount newCusomer) {
		customers.add(newCusomer);
	}
	
	
	
	

}
