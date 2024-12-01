package stringclass;

import java.util.Date;

public class Date_format {

	public static void main(java.lang.String[] args) {
		
		
		Date d1=new Date();
		
		d1.getTime();
		System.out.println(d1);
		
		
	
		java.lang.String time= d1.toString();
		
		java.lang.String date=time.substring(8, 10);
		java.lang.String month= time.substring(4, 7);
		java.lang.String year= time.substring(24, 28);
		
		java.lang.String timeformat= date.concat("/").concat(month).concat("/").concat(year);
		
		System.out.println(timeformat);
		
		
//System.out.println(time.length());
		
		
	}
	
	
	
	
}
