package date_07_12_22_ProductsExample;

public class VendingRunner {

	public static void main(String[] args) {
		
		VendingMachine machine1 = new VendingMachine("Serial123-456", 4, 3);
		
		
		System.out.println(machine1);
		
		
		machine1.purchase(0, 0);
		
	}

}
