package PolymorphismAndEncapulation;



class auth{
	
	private String username="padmaraj@gmail.com";
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	private String password="Psb@123";
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}




public class Polimorphism_class {

	public static void main(String[] args) {
		//same action but in multiple ways
		//an object showing different behaviur at the different stages of life cycle
		//2types: 
		//1.compile time polymorphism: an object showing different behaviour at the different stages of lifecycle during compile time based on the arguments that we passed
		   //this can be achieved at the time of method overloading
        //2.Run time polymorphism: an object showing different behaviour at the different stages of lifecycle during during runtime based on the object that we create
		  //(method overriding concept)
		
		
/*	Encapulation: Restricing the direct access of any variable or data member using axis specifier is called as encapsulation 
		but giving the indirect access using getter and setter
		
		procedure:
		1. the most sensitive informtion has axis specifier "Private"
		2. they should seperate 2 method getter and setter with axis specifier called public.
		Getter method can be user to get value and setter method can be used to set the value  */
		
      auth a1= new auth();
		
		a1.setUsername("devyani");
		System.out.println(a1.getUsername());
		
	       a1.setPassword("VPB@123");
	   System.out.println(a1.getPassword());
		
		
		
		
		
		
		
		
		
		
		
		 
		
	}

}
