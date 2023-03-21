package date_30_11_22_OOP;

public class NestedLoopShape {

	public static void main(String[] args) {
		
//		creating a shape
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
//		Reverse of shape
		
		for(int i = 4; i >=0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
	}

}
