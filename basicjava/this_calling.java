package basicjava;

public class this_calling {

	
	 this_calling(){
		this(8);
		 
		 System.out.println("1");
		
	}
	 
	 this_calling(int age){
		
		 System.out.println(age);
		 
	 }
	
	
	public static void main(String[] args) {
		
		
		
		new this_calling();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
