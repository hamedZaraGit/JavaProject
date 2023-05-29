package classPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.lang.*;

public class Mock {

	public static void main(String[] args) {

		
		System.out.println("\n" + "--------------Number Pyramid-----------" + "\n");
		
//		I.. User has 5 rows.
//		II. After getting the user input, print the pyramid of numbers for entered number of rows.

//		System.out.println("    1\n   2 2\n  3 3 3\n 4 4 4 4\n5 5 5 5 5");

//		Expected Output
//		How many rows you want in your Pyramids?

//		    1  
//		   2 2  
//		  3 3 3  
//		 4 4 4 4  
//		5 5 5 5 5

//		2 week
//		10 days
//		3 days

		int temp = 0;
		boolean trigger = false;
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= 1; j--) {
				System.out.print(" ");
				if (j == i || trigger) {
					trigger = true;
					System.out.print(i);
				}
			}
			System.out.println();
			trigger = false;
		}
		
		
		System.out.println("\n" + "-------------------------------" + "\n");
		
		System.out.println("\n" + "----------------Reverse String--------------" + "\n");
		

//		Q1: Reverse the String

		String str = "12 AB";
//		21 BA

		System.out.println(reverseString(str));

		System.out.println(revStringBuilder(str));

		System.out.println(reverseEachWord(str));
		
		
		System.out.println("\n" + "-------------------------------" + "\n");

		System.out.println("\n" + "---------------Spliting lowercase, Uppercase, special characters, numbers in a string---------------" + "\n");

		
//		Q1
//		Create for functions
//		1st one returns lowercase characters
//		2nd one returns uppercase characters
//		numbers
//		special characters
		
		
		String str1 = "TekSchool 01 ##$1 919101^^^^^";
		
		System.out.println("LoweCases: " + lowerCase(str1));
		System.out.println("UpperCases: " + upperCase(str1));
		System.out.println("numbers: " + numbers(str1));
		System.out.println("specialCharacters: " + specialCharacters(str1));
		
		
		
		System.out.println("\n" + "-------------------------------" + "\n");

		System.out.println("\n" + "----------------Finding out vowel characters---------------" + "\n");

		
//		Q2
//		Count of the vowel characters
//		the vowel characters
		
		
		String obj = "This is sample";
		
		System.out.println(vowelCharacters(obj));
		System.out.println(vowelCount(obj));

		
		System.out.println("\n" + "-------------------------------" + "\n");

		System.out.println("\n" + "---------------Finding out Anagram----------------" + "\n");

		
//		Q3
		
//		anagram
//		anagram mean when we rearrange the word but they are the same
//		their length should be the same as well

			String obj3 = "Anagram";
			String target = "nagaram";

			System.out.println(isAnagram(obj3, target));
			
			
			System.out.println("\n" + "-------------------------------" + "\n");
			System.out.println("\n" + "----------------Finding out duplicates and counting them---------------" + "\n");

			
//		Q4
			
			//text = 2, for = 2
			String input = "This is a sample text text for for question question";
			System.out.println(findDuplicates(input));

		
		
		

	}

	

//	one way of reversing using loop

	public static String reverseString(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

		return reverse;
	}

//	way of reversing using string builder

	public static String revStringBuilder(String str) {
		StringBuilder strBuilderMethod = new StringBuilder(str);
		strBuilderMethod.reverse();
		return String.valueOf(strBuilderMethod);
	}

//	reversing each word

	public static String reverseEachWord(String input) {
		String reversed = "";

		String[] temp = input.split(" ");

		for (int i = 0; i < temp.length; i++) {
			reversed += reverseString(temp[i]);
			if (i + 1 < temp.length) {
				reversed += " ";
			}
		}

		return reversed;

	}
	
	
	
	
//	Q1
	public static String lowerCase(String input) {
		return input.replaceAll("[^a-z]", "");
	}
	
	
	public static String upperCase(String input) {
		return input.replaceAll("[^A-Z]", "");
	}
	
	public static String numbers(String input) {
		return input.replaceAll("[^0-9]", "");
	}
	
	public static String specialCharacters(String input) {
		return input.replaceAll("[^a-zA-Z0-9]", "");
	}
	
	
	
//	Q2
	public static String vowelCharacters(String input) {
		return input.replaceAll("[^AEIOUaeiou]", "");
	}
	
	public static int vowelCount(String input) {
		return vowelCharacters(input).length();
	}
	
	
	
//	Q3
//	Anagram
	
public static boolean isAnagram(String input, String target) {
		
		if(input == null || target == null) {
			return false;
		}
		
		
		if(input.length() != target.length()) {
			return false;
		}
		
		char[] tempInput = input.toCharArray();
		char[] tempTarget = input.toCharArray();
		Arrays.sort(tempInput);
		Arrays.sort(tempTarget);
		
		
		
		return Arrays.equals(tempInput, tempTarget);
	}





//		Q4
//		Finding out duplicates with their count
		//text = 2, for = 2


	public static Map<String, Integer> findDuplicates(String str) {
		HashMap<String, Integer> res = new HashMap<>();
		HashMap<String, Integer> result = new HashMap<>();
		String[] words = str.split(" ");
		for (String s : words) {
			if (res.containsKey(s)) {
				res.put(s, res.get(s) + 1);
				result.put(s, res.get(s));
			} else {
				res.put(s, 1);
			}
		}
		return result;
	}



	
	
	
}
