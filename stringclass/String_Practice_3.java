package stringclass;

public class String_Practice_3 {

	public static void main(java.lang.String[] args) {
	
java.lang.String name="Level";

java.lang.String e="";

for(int i=name.length()-1;i>=0;i--) {
	
	char name1 = name.charAt(i);
	
	e=e+name1;
	

	
}
System.out.println(e);

if(e.equalsIgnoreCase(name))
		
	System.out.println("It is Palindrome");
	
	}

}
