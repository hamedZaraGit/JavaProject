package date_14_12_22_Inheritance_carExample;

public class Runner14 {

	public static void main(String[] args) {


		Vehicle obj1 =new Vehicle();
		Vehicle obj2 =new Vehicle(250, "Toyota", "Corrola XLE", 2024);		
		
		Car obj3 = new Car(180, "Toyota", "Highlander", 2005, 4, 4, "SUV", false);
		System.out.println(obj2);
		System.out.println("-----------------------------------------------------------------");

		System.out.println(obj3);
		
	}

}
