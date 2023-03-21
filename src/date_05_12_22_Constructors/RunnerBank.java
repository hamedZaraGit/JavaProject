package date_05_12_22_Constructors;


public class RunnerBank {

	public static void main(String[] args) {
				
		
		BankAccount user1 = new BankAccount();
		
		System.out.println(user1.balance);
		
		
		
		
		BankAccount user2 = new BankAccount("Anna", "Taylor", "123-456-879", "annaTaylor@gmail.com", "A123456789", 430.48);
	
		System.out.println(user2.firstName);
		System.out.println(user2.lastName);
		
		
		System.out.println("-------------------------");
		
		
		user2.checkBalance();
		
		user2.depositAccount(500);
		
		
		System.out.println("----------------");
		
		user2.withdraw(300.12);
		
		
		System.out.println("--------------------");
		
		
		
		Bank branch1 = new Bank("Falls Church", "Jack Ma");
		
		
		branch1.addCustomer(user2);
		branch1.addCustomer(user2);
		branch1.addCustomer(user2);
		branch1.addCustomer(user2);
		branch1.addCustomer(user2);
		branch1.addCustomer(user2);
		branch1.addCustomer(user2);
		branch1.addCustomer(user2);
		branch1.addCustomer(user2);
		branch1.addCustomer(user2);
		branch1.addCustomer(user2);
		branch1.addCustomer(user2);
		branch1.addCustomer(user2);
		
		branch1.printBankInfo();
		
		
		
		
		
		
		
	}

}
