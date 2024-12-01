package stringclass;

import java.io.DataOutput;
import java.util.Locale;

public class PRactice_String {

	private static final Locale tr = null;

	public static void main(java.lang.String[] args) {
	
		
		java.lang.String a="Padmaraj";
		
		java.lang.String b="Devyani";
		
		java.lang.String c="Vrunda";
		
		java.lang.String d=" ";

	//	System.out.println(a.toUpperCase());
	//	System.out.println(b.toLowerCase());
	
//	boolean z= a.equalsIgnoreCase(c);
	//	System.out.println(z);
//		System.out.println(a.trim());
		
		for(int i=a.length()-1;i>=0;i--) {
			
			char output=a.charAt(i);
			
	System.out.print(output+d);
			
		}
		
		
		
		
	}

}
