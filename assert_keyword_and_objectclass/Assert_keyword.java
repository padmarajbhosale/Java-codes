package assert_keyword_and_objectclass;

import java.util.Scanner;

public class Assert_keyword {

	public static void main(String[] args) {
	//It checks the expectation is actual or not. it gives exception aasertionerror
		
		//need to awake asser> run as>run configuration>arguments>vm argument>type>-ea>run
		
		
		Scanner s1= new Scanner(System.in);
	int input =	s1.nextInt()	;
		assert input>10: "Value need to be more than 10";
		
		System.out.println("Used assert keyword");
	
	
	
	
	
	}

}
