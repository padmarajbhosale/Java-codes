package stringclass;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_copy {

	public static void main(java.lang.String[] args) {
		

		//copy one array to another array using iteration.(for loop)
		
		int array1[]=new int[4];
		int array2[]=new int[array1.length];
		
		array1[0]=15;
		array1[1]=16;
		array1[2]=17;
		array1[3]=18;
		
		for(int i=0;i<Array.getLength(array1);i++) {
			
	      array2[i]=array1[i];
			
		
	     
		}
		java.lang.String a2=Arrays.toString(array2);
		 System.out.println(a2);
		
	}

}
