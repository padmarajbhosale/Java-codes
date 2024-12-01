package assert_keyword_and_objectclass;


class Upcasting{
	
	void add() {
		System.out.println("upcasted in child class");
	}
	
}


public class Object_oriented_type extends Upcasting  {                    

	public static void main(String[] args) {
		
		/* what is object oriented progaramming launguage:
		 * any laungugage shows behaviour  class,object,Abstraction,polymorphism,inheritance,encapsulation
		 * class: where we write the programme
		 * 
		 * 
		 *What is Type casting
		 */
		
	//Upasting: converting type cast object to super class object	
		
		 Upcasting a1=  new Object_oriented_type();  //typecasting implicit way
		   Upcasting a2= (Upcasting) new Object_oriented_type();  //typecasting explicit way
		 a1.add();   //this is called as upcasting, we can only access property of the super class only.
		
}
	void abc() {
		
	}
void sub() {
	        
	                        
}
}
