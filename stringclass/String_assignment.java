package stringclass;

public class String_assignment {

	public static void main(java.lang.String[] args) {
		 //how to check if string contains only digits
         //factorial of number 9
		//try to swap 2 values with help of 3rd variable
        //swap 2 values without 3rd variable
		
		
		//1
		
		java.lang.String m1= "4844154111";
		java.lang.String m2="111094";
		
		int numberofdigit=0;
		int numberofalpha=0;
		
	char[] a1=	m1.toCharArray();
		char a2[]=m2.toCharArray();
		
      for(int i=0;i<a1.length;i++) {
  
    	  boolean answer =Character.isAlphabetic(a1[i]);
    	  
    	  if(answer==true) {
    		  
    		  numberofalpha++;
    		  
    	  }
    	  else {
    		  numberofdigit++;
    	  }
    	 
      }
     //System.out.println(numberofdigit);
	//if(numberofdigit=0) {
		System.out.println(numberofdigit);
		
		if( numberofalpha==0) {
			
			System.out.println("It have only digit");
			
		}
		else {
			System.out.println("It dont have only digit");
		}
		
		//factorial of number 9
		
	
		
		
		int[] a11 = new int[1];
		
		a11[0]=9;    
		int result =0;
		java.lang.String b1=a11.toString();
		
		for (int i=0;i<b1.length();i++) {
			
		
			
			
			
		}
		
	}
		
    	
		
}
	