package basicjava;

public class StringProblems {
	static String givenstring= "padmaraj Satish bhosale @1994";
	

	//find out special character index
static void specialcharacternumber() {
	
	for(int i=0;i<givenstring.length();i++) {
		
		char currentchar=givenstring.charAt(i);
		
		if(!Character.isAlphabetic(currentchar)&& !Character.isDigit(currentchar)&& !Character.isSpace(currentchar)) {
			
			System.out.println("Index of given Special Character "+ currentchar+ " is ="+ i);
		}		
	}	
}

//find out index of alphabet
	static void indexodalphabet(){
		
		int count = 0;
		
		for (int i=0; i<givenstring.length();i++) {
			
		char currentchar =	givenstring.charAt(i);
		
		
			
			if(currentchar=='a') {
				
				count++;
				
				
				if(count==3) {
				
					System.out.println("index of 3rd 'a' ="+ i);
					
					break;
				}
				
			}			
		}
		
			}
			
	
	
	
	 static void replacealpha() {
		//replace all a with b
		String newstring1= givenstring.replace('a', 'b');
				
		 System.out.println(newstring1);
		 
		 //replace 9 with 4
		 String newstring2=givenstring.replace('9', '4');
		 System.out.println(newstring2);
		 
		//remove last le
		 String newstring3= givenstring.replace("le", "");
		 System.out.println(newstring3);
		 
			 }
	 
	      
		
	public static void main(String[] args) {
		StringProblems a=new StringProblems();
		
		a.specialcharacternumber();
	
		a.indexodalphabet();
		
		a.replacealpha();
	
		

	}

}
