package classPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Practice {
	public static void main(String[] args) {

		
		System.out.println(powerQuestion(17));
		
		
		

	}
	
	
	public static boolean powerQuestion(int input) {
		
		
	    int a = 1;
	    
	    while(a != input){
	      a*=2;
	      if(a > input) {
	    	  System.out.println(input);
	    	  return false;
	    	  
	      }
	      
	     
	    }
	    
	    System.out.println(input);
	    
		return true;
		
	}
	
	
	
}
