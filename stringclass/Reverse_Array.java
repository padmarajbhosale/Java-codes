package stringclass;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Reverse_Array {
public static void main(java.lang.String[] args) {
	
	
	
	//declaring array
	
	int[] age= {10,12,15,18,16};
	
	//System.out.println(age.length);
	
	int k=0;
	
	int[] reversearray= new int [age.length];
	
	for(int i=age.length-1;i>=0;i--) {
		
		
		reversearray[k]=age[i];
		
		k++;
	
		
	}
	System.out.println(Arrays.toString(reversearray));
	
	// To char array

	java.lang.String name="padmaraj";
	
	char[] a1= name.toCharArray();
	
	System.out.println(Arrays.toString(a1));
	
	
	java.lang.String name1="devyani";
	
	 char a2[]= name1.toCharArray();
	
	 System.out.println(Arrays.toString(a2));
	 
	 //sort array
	 
	 Arrays.sort(age);
	 
	 System.out.println(Arrays.toString(age));
	 
	 
	 
	 //Given two string are angaram of eact other(two string are made of equal characters)(come,omce)
	 //if two strings are anagram then lenght is same// sort array //then check if equals 
	 
	 //Mon, Man check if these are anagram of eact other or not
	 
	 java.lang.String m1 = "cosmos";
	 java.lang.String m2 = "moscos";

	 if(m1.length()!=m2.length()) {
		 
		 System.out.println("it is not as anagram");
		 
	 }
	
	 else {
		 
		 char c1[]=m1.toCharArray();
		 char c2[]=m2.toCharArray();
		 
		 Arrays.sort(c1);
		 Arrays.sort(c2);
		 
		 if(Arrays.equals(c1, c2)) {
			 
			 System.out.println("Yes it is an anagram");
			 
		 }
		 else {
			 System.out.println("It is not an anagram");
			 
		 }
		 
		 
		 
	 }
	
	 
	 
	 
	 
}

	    
	
	
}
