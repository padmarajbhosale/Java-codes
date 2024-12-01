package we3school;

public class Problem1 {

	public static void main(String[] args) {
		
		/*1. Write a Java program to get the character at the given index within the string.

		Sample Output:

		Original String = Java Exercises!                                                                             
		The character at position 0 is J                                                                              
		The character at position 10 is i */
		
		
		String givenstring="Java Exercises!";
		int index=-1;
		
		for(int i=0;i<givenstring.length();i++) {
			index++;
			char currentchar=givenstring.charAt(i);
			
			System.out.println("The character at position "+index+" is "+currentchar);
			
			
		}
		
		
		
		
		
	}

}
