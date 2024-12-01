package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Collection_class {

	public static void main(String[] args) {

    ArrayList name= new ArrayList();
    
		name.add("Devyani");
		name.add("Padmaraj");
		name.add("Vrunda");
		name.add("Bhosale");
		name.add(40);
	
		try {
		Collections.sort(name);
		}
		catch(ClassCastException e){
			
			System.out.println("Exception: " + e.getMessage());
			String a1=e.getMessage();
			char[] a3=a1.toCharArray();
			
			int h=a3.length;
			System.out.println(Arrays.toString(a3));
			System.out.println(a3[50]);
			Arrays.toString(a3);
			System.out.println(a3);
			System.out.println(h);
		}
	
		//Collections.sort(name);
		
		System.out.println(name);
		System.out.println(name.size());
		name.remove(4);
		System.out.println(name);
		
		String target="Vrunda";
	int a=	name.indexOf(target);
	System.out.println("Index of "+target+"="+a);
	
	
	HashSet h1=new HashSet();
	h1.add(target);
	h1.add(target);
	h1.add("devyani");
System.out.println(h1.size());	
boolean z=h1.contains("devyani");
System.out.println(z);
	System.out.println(h1);
	
		}

}