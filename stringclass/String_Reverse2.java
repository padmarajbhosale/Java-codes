package stringclass;


import java.util.Arrays;
import java.util.Date;

public class String_Reverse2 {

	public static void main(java.lang.String[] args) {
		
java.lang.String name="Devyani";
java.lang.String space=" ";

for (int i=name.length()-1;i>=0;i--) {
	
	char n1=name.charAt(i);
	 
	java.lang.String reverse=n1+space;
	
System.out.print(reverse);
System.out.println();
	
}

int [] age= new int[4];
age[0]=12;
age[1]=13;
age[2]=14;
age[3]=15;

System.out.println(Arrays.toString(age));

int[] age1=new int[age.length];

for(int i=0;i<4;i++) {
	
	age1[i]=age[i];
}

System.out.println(Arrays.toString(age1));


Date d1= new Date();

java.lang.String time=d1.toString();

System.out.println(time);

System.out.println(time.length());


java.lang.String date= time.substring(8,10);
java.lang.String month= time.substring(4,7);
java.lang.String year= time.substring(24,28);

System.out.println(date);
System.out.println(month);
System.out.println(year);

java.lang.String dateformat=date.concat(space).concat(month).concat(space).concat(year);

System.out.println(dateformat);
System.out.println(age1[3]);

	

}}
