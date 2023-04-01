package date_19_12_22_Specifiers_Non_AccessModifiers;

public class CostumerStaticPractice {
		
		private String firstName; // These 3 variables are dynamic, which means we can change its value for each object
		private String lastName;
		private String email;
		
		static int x = 0; // This variable is static, which means we can change the value, but the value would be the same for all objects
						  // Because its  a class level value, and it will export that value to all its objects
		
		
		static int count = 0; 
		
//		Now the first thing you should be asking when creating an object of the class
//		Is that, is it going to be changing for each object of the class
//		If Yes - you should not make it static - firstName, lastName, email can always change for each object of class. so we don't need static
//		If No - then you can make it static - which will hold to one value for all objects
	
		
		
		public CostumerStaticPractice() {
			super();
			this.firstName = "";
			this.lastName = "";
			this.email = "";
			count++; // By doing this we can keep track of object created of this class, by each time the constructor is called
		}
		
		
		public CostumerStaticPractice(String firstName, String lastName, String email) {
			this(); 
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
		}


		public String getFirstName() {
			return firstName;
		}


		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}


		public String getLastName() {
			return lastName;
		}


		public void setLastName(String lastName) {
			this.lastName = lastName;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		@Override
		public String toString() {
			return "CostumerStaticPractice [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
					+ "]";
		}
		
		
		
		
		public static void  takeScreenShot(){
			System.out.println("Screenshot has been taken");
		}
		
		
		
	

}
