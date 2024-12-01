package we3school;

public class Problem3 {

	public static void main(String[] args) {
	
		
		/* Write a Java program to test if a given string contains the specified sequence of char values.

		 Sample Output:

		 Original String: PHP Exercises and Python Exercises                                                           
		 Specified sequence of char values: and                                                                        
		 true 
		*/
		
	String	 OriginalString= "PHP Exercises and Python Exercises"    ; 
		String  Specifiedsequenceofcharvalues=  "and";
		
	     System.out.println(OriginalString);  
	     System.out.println(Specifiedsequenceofcharvalues);
	
		System.out.println(OriginalString.contains(Specifiedsequenceofcharvalues));
		
		
		
	}

}
