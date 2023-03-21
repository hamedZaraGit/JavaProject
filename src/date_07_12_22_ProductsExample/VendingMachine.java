package date_07_12_22_ProductsExample;

public class VendingMachine {

	
		
		Product[][] items;
		String machineID;
		
		
//		default constructor
		
		public VendingMachine() {
			this.machineID = "";
			this.items = new Product[3][3];
		
			for (int row = 0; row < items.length; row++) {
				for (int col = 0; col < items[row].length; col++) {
					items[row][col] = new Product();
				}
				
			}
			
		}
		
		
//		parameterized constructor
		
		public VendingMachine(String machineID, int rowCount, int colCount) {
			this.machineID = machineID;
			this.items = new Product[rowCount][colCount];
			
			for (int row = 0; row < items.length; row++) {
				for (int col = 0; col < items[row].length; col++) {
					items[row][col] = new Product();
				}
				
			}
				
		}
		
		
		
		
//		other methods
		
//		method purchase() is going to take int row, int col
//		this method should check and see if the item is available
//		if so, drop the item, reduce the quantity
//		returns a boolean, if item is sold, return true, false otherwise
		
		
		public boolean purchase(int row, int col) {
			if(items[row][col].quantity > 0 ) {
				// we have availability
				items[row][col].quantity--;
				System.out.println("item " + items[row][col] + " dropped");
				return true;
				
			} else {
				// we do not have items in stock
				System.out.println("item " + items[row][col] + " is out of stock");
				return false;
			}
		}
		
		
		
//		addItem method()
//		should take a new product, row and col
//		and add that product to the address
//		should return a boolean true, if added successfully
		
		public boolean addItem(Product item, int row, int col) {
			if(items[row][col].quantity > 0) {
//				there is an item already in this location
				System.out.println("There is an item at this location");
			} else {
				items[row][col] = item;
				System.out.println("item: " + item + " successfuly added to the location " + row + ", "+ col );
				return true;
			}
			
			
			
			
			return false;
		}
		
		
		
		
		
//		toStrong() method
		
		public String toString() {
			String temp = "MachineID: " + machineID + "\n";
			
			for (int row = 0; row < items.length; row++) {
				temp += row + "\t|\t";
				for (int col = 0; col < items[row].length; col++) {
					temp += items[row][col] + "\t|\t";
					
				}
				temp += "\n";
				
			}
			temp+= "---------------------------------------------------\n";
			
			return temp;
		}
		
		
		
	

}
