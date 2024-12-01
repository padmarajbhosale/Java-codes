package we3school;

public class Problem4 {

	public static void main(String[] args) {
		/* Write a Java program to compare a given string to the specified character sequence.

		 Sample Output:

		 Comparing example.com and example.com: true                                                                   
		 Comparing Example.com and example.com: false  */
		
		
		String s1="example.com";
		String s2="example.com";
		String s3="Example.com";
		
		System.out.println(" Comparing example.com and example.com: " +s1.equals(s2));
		System.out.println(" Comparing Example.com and example.com: "+s3.equals(s2));

	}

}
