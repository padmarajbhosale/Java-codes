package stringclass;

import java.util.Arrays;
import java.util.Scanner;

public class Array_class {

	
	public static void main(java.lang.String[] args) {
		
	int[] rollno=new int[4];
	
		rollno[0]=45;
		rollno[1]=25;
		rollno[2]=65;
		rollno[3]=54;
		
		
		System.out.println(Arrays.toString(rollno));
		
		//How to take value to array from scanner class?
		
		
		int[] age=new int[4];
		
		Scanner s1=new Scanner(System.in);
		
		for(int i=0;i<=3;i++) {
		age[i]= s1.nextInt();
	
		}
		System.out.println(Arrays.toString(age));
		
		System.out.println(Arrays.toString(age));
		
		//reverse string horizontal:=
		java.lang.String e="P a d m a r a j";
		
		for(int i=e.length()-1;i>=0;i--) {
			
			char output=e.charAt(i);
			System.out.print(output);
		
		
		
	}
	
		
}}
