package basicjava;

public class We3school {

	public static void main(String[] args) {
	
		
		
	/*	 Write a Java program to get the character at the given index within the string.

		 Sample Output:

		 Original String = Java Exercises!                                                                             
		 The character at position 0 is J                                                                              
		 The character at position 10 is i */
		
		String givenstring= "Java Exercises";
		
		int position = 0;
		
		for(int i=0;i<givenstring.length();i++) {
		
			
			char currentchar=givenstring.charAt(i);
			
			System.out.println(currentchar + "=" + i );
			
			if(i==0||i==10)
			{
				System.out.println(" The character at position "+i+" is "+ currentchar );
			}
		}
		
String givenstring2 = "Java Exercise1";
		
       int result=givenstring.compareTo(givenstring2);
       
       if(result==0) {
    	   System.out.println("Equal");
    	   
       }
       else if(result>0) {
    	   
    	   System.out.println("givenstring is greter than givenstring2");
    	   
       }
       else if(result<0) {
    	   
    	   System.out.println("givenstring2 is greter than givenstring1");
    	   
       }

	}

	

}
