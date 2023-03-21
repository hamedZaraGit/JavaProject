package date_07_12_22_ProductsExample;

public class ProductRunner {

	public static void main(String[] args) {
		
		Product p1 = new Product("M&M", 8.99, 8); // In here you have to call which constructor you want./ default or parameterized.
		Product p2 = new Product("Redbull", 5.99, 8);
		Product p3 = new Product("Lays", 1.20, 15);
		Product p4 = new Product("Coke", 5.99, 5);
		Product p5 = new Product("Cheetos", 3.99, 3);
		Product p6 = new Product("Water", 1.99, 8);
		Product p7 = new Product("Monster", 5.99, 4);
		Product p8 = new Product("Hareebos", 2.39, 6);
		Product p9 = new Product("Biscuits", 4.99, 2);
		Product p10 = new Product("Gums", 0.29, 10);
		Product p11 = new Product("Mintos", 0.49, 12);
		Product p12 = new Product("Juice", 7.29, 7);
		
		
		
		
		
		
		System.out.println(p1.name + " " + p1.price + " " +  p1.quantity); // in here we are printing calling our parameterized constructor
		
		System.out.println(p1); // in here we are just calling our toString() method.
									  // so you dont need to call your variables.
									  // you just define them in your class, on how you want them to be printed.
		
		
		
		Product product2 = new Product("Redbull", 4.99, 5);
		
		System.out.println(product2); // it will automatically print using toString() method, because we have defined it in our class
									  // if we had not, it would have printed a reference address for us.
		
		
		
		
		
		VendingMachine machine1 = new VendingMachine("Serial123-456", 4, 3);
		
		
		System.out.println(machine1);
		
		
		machine1.purchase(0, 0);
		
		machine1.addItem(p1, 0, 0);
		machine1.addItem(p2, 0, 1);
		machine1.addItem(p3, 0, 2);
		
		machine1.addItem(p4, 1, 0);
		machine1.addItem(p5, 1, 1);
		machine1.addItem(p6, 1, 2);
		
		machine1.addItem(p7, 2, 0);
		machine1.addItem(p8, 2, 1);
		machine1.addItem(p9, 2, 2);
		
		machine1.addItem(p10, 3, 0);
		machine1.addItem(p11, 3, 1);
		machine1.addItem(p12, 3, 2);
		
		
		
		
		System.out.println(machine1);		
		
	}

}
