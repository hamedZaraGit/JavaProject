package date_21_12_22_Polymorphism;

import java.util.ArrayList;

import date_13_12_22_Inheritance.Student;

public class PolyExample {

	public static void main(String[] args) {
		
		
//		Polymorphism
//		The Idea of your code being able to take different shape is called polymorphism
//		It has two kind
		
//		Static Polymorphism:-
//		Is also called Method Overloading
//		Happens during Compile time
//		Method Overloading: concept of having multiple versions of the same method in the same class
//		Example: having a default and parameterized constructor in the same class can be called polymorphism
		
		
//		Dynamic Polymorphism:-
//		Happens during Run time
//		Method Overriding is one kind of Dynamic polymorphism
//		Method overriding is The idea of changing the implementation of the method that we are inheriting
//		To override you have to: 
//		1. Inherit from another class.  
//		2. You have to match the definition of the method you are trying to override exactly
		
//		Upcasting and Downcasting
//		Are type of Dynamic polymorphism
//		Upcasting:- is the idea of declaring a parent class variable and initializing an object of any of the subclasses/child classes
//		Downcasting:- is the opposite of upcasting
		
		Integer i = 120;
		Double d = 213.123;
		Float f = 234.234f;
//		These are all part of wrapper class, which in turn is sub class of Object class
//		Object class is parent class of all classes by default
		
		
		ArrayList<Object> temp = new ArrayList<Object>();
		temp.add(10);
		temp.add(12.5);
		temp.add(false);
		temp.add(1.1);
		temp.add('a');
		temp.add("test");
		temp.add(new Student());
		
		
		Object obj = 10;
		Object obj2 = 15.515f;
		Object obj3 = new Student();
		
//		The idea in here is that one way or another, all of the classes above(Wrapper or other) are subclasses/child class of class object
//		That is what we call upcasting
		
		
		
		
		
		
	}
	
	
}
