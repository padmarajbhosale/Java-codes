package stringclass;

import java.util.Arrays;

public class Array_StringQue {

	public static void main(java.lang.String[] args) {
		
		//given string have how many alphabets and how much numbers
		//need to utilise character class
		
		
		java.lang.String name="padm111094raj";
		
		int numberofchar=0;
		int numberofno=0;
		
		char a1[]=name.toCharArray();
		
	//	System.out.println(Arrays.toString(a1));
		
		for(int i=0;i<a1.length;i++) {
			
			boolean answer1= Character.isAlphabetic(a1[i]);
					
			if(answer1==true) {
				
				numberofchar++;
				
			}
			else {
				
				numberofno++;
				
			}
			
		}
		
		System.out.println("The numner of character = "+numberofchar);
		System.out.println("The numner of numeric = "+numberofno);
		
	}

}
