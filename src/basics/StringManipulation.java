package basics;

public class StringManipulation {

	public static void main(String[] args) {
		
		String firstName = "John";
        String lastName = "Smith";
        
        // Returns the length of the String
        int nameLength = firstName.length();
        
        
        
        
        
        
        // Concatenation Examples:
        
        System.out.println("Concatenation Examples:");
        
        
        
        // Appends two string.
        String fullName = firstName.concat(lastName);
        System.out.println(fullName);
        
        
        
        
        
        
//		SubString Examples
        
        
        System.out.println("SubString Examples: ");
        System.out.println("\n");
        
        // Gets a portion of the String defined by starting index all the way to the end
        String fullnameSub = fullName.substring(5);
        System.out.println(fullnameSub);
        
        // Gets a portion of the String in a range
        String fullnameSub2 = fullName.substring(5, 7);
        System.out.println(fullnameSub2);
        
				//		Steps
				//		store this value as String "Welcome To Tekschool"
		String str = "Welcome To Tekschool";

				//		change all sentence to upper case
		System.out.println(str.toUpperCase());

				//		change all sentence to lower case
		System.out.println(str.toLowerCase());

				//		change only "tekschool" to uppercase
		System.out.println(str.substring(0, 10) + " " + str.substring(11, 20).toUpperCase());

				//		expected output
				//		WELCOME TO TEKSCHOOL
				//
				//		welcome to tekschool
				//
				//		Welcome To TEKSCHOOL
		
        System.out.println("\n" + "--------------------------------------------------------------------------------" + "\n");

        
        // charAt return character of given index
        char oneCharacter = fullName.charAt(2);
//        System.out.println(oneCharacter);
        
        // Returns the index of given char
        int indexNumber = fullName.indexOf("J");
//        System.out.println(indexNumber);

        // Checks to see if the String contains the value given
        boolean itIncludes = firstName.contains("Joh");
//        System.out.println(itIncludes);
        
        // Checks to see if the String starts with the given String
        boolean startingWith = firstName.startsWith(fullnameSub2);
//        System.out.println(startingWith);
        
        // Checks to see if the String ends with the given String
        boolean endingWith = firstName.endsWith("n");
//        System.out.println(endingWith);
        
        // Checks to see the value of the two given Strings are equal
        boolean hasSameValues = firstName.equals(lastName);
//        System.out.println(hasSameValues);
        
        // Checks to see if the value of the two given Strings are equal ignoring the cases
        boolean hasSameValueIgnoreCase = firstName.equalsIgnoreCase(lastName);
//        System.out.println(hasSameValueIgnoreCase);
        

        // Replaces the first instance on the first argument to the second argument
        String newFirstName = firstName.replace("o", "a");
//        System.out.println(newFirstName);
        
        // Replaces all of the instances of the first argument to the second argument
        String newName = firstName.replaceAll("a", "o");
//        System.out.println(newName);
        
        // Splits the given String to multiple based on the regex provided, returns an array of String
        String[] nameSegments = firstName.split(" ");
//        System.out.println(nameSegments);
        
        // Return an array of characters of all of the chars in the given String
        char[] characters = firstName.toCharArray();
//        System.out.println(characters);
        
        // Returns String of the given String in lower case
        String firstNameLower = firstName.toLowerCase();
//        System.out.println(firstNameLower);

        // Returns String of the given String in upper case
        String firstNameUpper = firstName.toUpperCase();
//        System.out.println(firstNameUpper);
        
        // Converts the given value to String and returns that String
        String boolValue = String.valueOf(false);
//        System.out.println(boolValue);
    
		
	}

}
