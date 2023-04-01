package date_19_12_22_Specifiers_Non_AccessModifiers;

public class StaticKeyword {

	public static void main(String[] args) {
		
//		Static
//		Static member non access modifiers belong to class and not to object of the class
//		static members are called class-level, and other members are called object-level
//		You can not use the keyword (this) in static methods
		
//		Static members are called class level
//		Non-Static members are called object level

//		You do not need to have an object of the class to call a static member
//		If you change a value of a static member, it changes for the class and all of the objects at the same time
		
//		How to call a static member =>  name-Of-The-Class.name-of-the-static-member
		
		
		int x = 10;
		int y = 15;
		
//		Any function you call on the class level will be static
		Math.max(x, y);
//		In here Math. is the className and max() is name of the static member
//		static members in Eclipse will be shown in italic format
		
//		So you don't have to create an object of the class to call static members of the class
//		you call the name of the class and the name of the member in that class
		
//		Any function you call on the object level will be dynamic
		String str = "This is for test";
		System.out.println(str.length());
//		In here str is name of our object and .length function of our object which is dynamic
		
		
//		In here we have created object of our class and changed the values for each of our object, which means its dynamic
		CostumerStaticPractice obj1 = new CostumerStaticPractice("Jack", "Smith", "Jack@gmail.com");
		CostumerStaticPractice obj2 = new CostumerStaticPractice("Daniel", "Smith", "daniel@gmail.com");
		CostumerStaticPractice obj3 = new CostumerStaticPractice("Claire", "Smith", "claire@gmail.com");
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
//		In here we have called our static variable, which means we don't change it with each object of our class
//		the variable x does not belong to object of our class, but to class itself
		System.out.println("CostumerStaticPractice.x " + CostumerStaticPractice.x); // This is correct way of calling class level variable.
		
//		Even if we do change it with one of our object, the value would be the same for all our object, because its a class level member
//		So whatever value we assign to x, all our objects will get that value
		obj1.x = 1; // This is not a correct way of calling our class level variable, but then it works but gives you caution to lookout.
		
		System.out.println("obj1.x " + obj1.x); // In here the value that you will get from x for all your objects will be 1
		System.out.println("obj2.x " + obj2.x); // You can not have different values for x for each of your object
		System.out.println("obj3.x " + obj3.x); // because x variable is class level variable and its static
		
		
		
		
		System.out.println("Number of times object of our class was created: " + CostumerStaticPractice.count);
		
		
		
	}

}
