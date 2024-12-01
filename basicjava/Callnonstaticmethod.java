package basicjava;

public class Callnonstaticmethod {
	
	
	public void IamNonstatic()
	{
		
		System.out.println("I am non static method");
		
	}

	public static void main(String[] args) {

		Callnonstaticmethod refvariable=new Callnonstaticmethod();		
		
		refvariable.IamNonstatic();
		
		
	}

}
