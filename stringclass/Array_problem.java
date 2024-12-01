package stringclass;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_problem {

	public static void main(java.lang.String[] args) {
		
		//Create 2array check if those are equals or not
		
		
		java.lang.String array1[]=new java.lang.String[6];
		
		java.lang.String array2[]=new java.lang.String[array1.length];
		
		array1[0]="Padmaraj";
		array1[1]="Devyani";
		array1[2]="Vrunda";
		array1[3]="Guddi";
		array1[4]="Pratibha";
		array1[5]="Satish";
		
		for(int i=0;i<Array.getLength(array1);i++) {
			
			array2[i]=array1[i];
			
			
		}
		
		System.out.println(Arrays.toString(array2));
		
		

	}

}
