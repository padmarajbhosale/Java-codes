package stringclass;

public class String {

	public static void main(java.lang.String[] args) {
	
java.lang.String name ="Ram";
	
	int a= name.length();
	
	char b= name.charAt(0);
	
	int c= name.indexOf('m');
	
	java.lang.String name1=" Is my friend";
	
	java.lang.String d = name.concat(name1);
	
	java.lang.String e="Padmaraj";
	
	for(int i=0;i<8;i++) {
		
		char output=e.charAt(i);
		System.out.println(output);
		 
	}
	
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println("Padmaraj".concat(" ").concat("Bhosale"));
	
	System.out.println(name.toUpperCase());
	System.out.println(name.toLowerCase());
	
	System.out.println(name.equals(e));
	System.out.println(name.equalsIgnoreCase(e));
	System.out.println(name.substring(1));
	System.out.println(e.substring(2, 6));
	
	int age[]=new int [5]; 
	
	java.lang.String reverse="Devyani";
			
		System.out.println(reverse.indexOf('i'));
		
		for(int i=reverse.length()-1;i>=0;i--) {
		
			char output = reverse.charAt(i);
		//	System.out.print(output);
			
			
			java.lang.String dev="Shri Swami Samarth";
			
			
			
			for(int i1=01;i1<=108;i1++) {
				
				
				
				java.lang.String formattedNumber = java.lang.String.format("%0d", i1);
				int a1=i1;
				
				
				System.out.println(formattedNumber+". "+dev);
				
			}    
			
			break;
			
			
		}

	
	
	
	
		}
}