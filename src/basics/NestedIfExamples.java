package basics;

public class NestedIfExamples {

	public static void main(String[] args) {

		double price = 18;
		double shippingPrice = 0;
		boolean primeMember = true;

		// question 1

		// Non prime members

		if (primeMember == false) {
			// if the price is above 50, the shipping is 10$
			if (price > 50) {
				shippingPrice = 10;
				System.out.println("Price: " + price + "\n" + "Shipping Cost: " + shippingPrice + "\n" + "Total Cost: "
						+ (price + shippingPrice));
			}

			// if the price is between 30-49, shipping is $18
			if (price >= 30 && price <= 49) {
				shippingPrice = 18;
				System.out.println("Price: " + price + "\n" + "Shipping Cost: " + shippingPrice + "\n" + "Total Cost: "
						+ (price + shippingPrice));

			}

			// if the price 1-29, the shipping is $25
			if (price >= 1 && price <= 29) {
				shippingPrice = 25;
				System.out.println("Price: " + price + "\n" + "Shipping Cost: " + shippingPrice + "\n" + "Total Cost: "
						+ (price + shippingPrice));
			}

		}

		// prime members
		else {
			// if the price is more than 20, the shipping is free
			if (price > 20) {
				shippingPrice = 0;
				System.out.println("Price: " + price + "\n" + "Shipping Cost: " + shippingPrice + "\n" + "Total Cost: "
						+ (price + shippingPrice));
			}
			// if the price is 1-19, the shipping is 10% of the price
			if (price >= 1 && price <= 19) {
				shippingPrice = price * 0.1;
				System.out.println("Price: " + price + "\n" + "Shipping Cost: " + shippingPrice + "\n" + "Total Cost: "
						+ (price + shippingPrice));
			}

		}

		
		
		
		// question 2
		// create int a b c
		// a = 10
		// b = 5
		// c = 15
		int a = 10;
		int b = 5;
		int c = 15;
		// then create a boolean doubleIt = false
		boolean doubleIt = true;

		// check to see
		// if a > b, a is bigger than b
		if (a > b) {
			System.out.println("a is bigger than b");
		}
		// if b > c, b is bigger than c
		if (b > c) {
			System.out.println("b is bigger than c");
		}
		// if c > a, c is bigger than a
		if (c > a) {
			System.out.println("c is bigger than a");
		}
		// if boolean doubleIt = true
		if (doubleIt == true) {
			// double the first value compare
			// if ax2 > b, a double is bigger
			if ((a * 2) > b) {
				System.out.println("a double is bigger");
			// if bx2 > c, b double is bigger
			if ((b * 2) > c) {
				System.out.println("b double is bigger");
				}
			// if cx2 > a, c double is bigger
			if ((c * 2) > a) {
				System.out.println("c double is bigger");
				}

			}
		}

	}

}
