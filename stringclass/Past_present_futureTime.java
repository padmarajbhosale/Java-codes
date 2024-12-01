package stringclass;

import java.util.Date;

public class Past_present_futureTime {

	public static void main(java.lang.String[] args) {
		
	//Current Time
		
		Date d1=new Date();
		
		long d2= d1.getTime();
		
	//	System.out.println(d2);                  // time in Epoch
		
		Date d3=new Date(d1.getTime());          // Human understandable time
		
	//System.out.println(d3);
	
	Date d8=new Date();
//	System.out.println(d8);                       // Human understandable time 
		
		
	
	//Future Time
	
	Date d4=new Date(d1.getTime()+1000*60*60*24*1);
	
	//System.out.println(d4);
	
	//Past time
Date d5=new Date(d1.getTime()+1000*60*60*24*1);
	
//	System.out.println(d5);
	

	
	
	}

}
