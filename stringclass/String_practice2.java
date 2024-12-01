package stringclass;

import java.util.Scanner;

public class String_practice2 {

	public static void main(java.lang.String[] args) {
		
		//create array of int datatype of lenth 4, check number 34 is present in array or not and find indexing of that number.
		
		java.lang.String e= "Padmaraj";

		java.lang.String output= "";
		
		for(int i=e.length()-1;i>=0;i--) {
			
			char a= e.charAt(i);
			
		output= output+" "+ a;
		
		}
	//	System.out.println(output);
	
	int[] age =new int[4];

		age[0]=15;
		age[1]=18;
		age[2]=25;
		age[3]=30;
		
		int input=30;
		
		Scanner myinput=new Scanner(System.in);
		
	int a= myinput.nextInt();
		
		for(int i=0;i<=age.length-1;i++) {
			
			if(a==age[i] ) {
				System.out.println("Yes is is present at=" + i);
			}
		
			
		}
		
		
		
	}

}
