package we3school;

public class Problem2 {

	public static void main(String[] args) {
		
		/*Write a Java program to concatenate a given string to the end of another string.

		Sample Output:

		String 1: PHP Exercises and                                                                                   
		String 2: Python Exercises                                                                                    
		The concatenated string: PHP Exercises and Python Exercises
		*/
		
		
		String String1="PHP Exercises and ";
	      String	String2= "Python Exercises";  
		
		   String String3 = String1.concat(String2);
		
		   System.out.println(String3);
		
	}

}
