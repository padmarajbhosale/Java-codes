package stringclass;

import java.util.Arrays;

public class Array_Final_Problems {

	public static void main(java.lang.String[] args) {
		
		
		//suppose String is "Padmaraj Bhosale @1994"
        //finout index of special characters
		// character.    is digit: is alpha: is space
		//check if given string contains only numeric value
		//in String replace all A with N
		//in given String remove all N
		//replace surname with other name
		//replace all the lower cases letter
		//remove all the capital letters
		
		//N contains
		
		java.lang.String givenstring="Padmaraj Satish bhosale @19994";
		
	
		
		for(int i=0; i<givenstring.length();i++) {
			
			   char currentstring= givenstring.charAt(i);
			   
			   if(!Character.isAlphabetic(currentstring)&&!Character.isDigit(currentstring)&& !Character.isSpace(currentstring)) {
				   
				   
				 System.out.println("Index of special character "+ currentstring +" = "+i);  
				   
				   
				   
			   }
			   
			   else {
				   
				   System.out.println("Given String dont have any special character");
			   }
			   
			   
			
		}
	        
	
	
	}
	 
	

	}


		
	
	
	
	

