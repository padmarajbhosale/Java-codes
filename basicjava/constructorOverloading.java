package basicjava;

public class constructorOverloading {
	
	private int c;


	constructorOverloading (){
		
		System.out.println("This is non parameterised constructor");
		
	}
	
	constructorOverloading(int a)
	{	

		int c=a+9;
		System.out.println(c);
	}
	
	
	constructorOverloading(boolean b){
		
	System.out.println(b);
		
	}
	
	constructorOverloading(String z){
		
		z="this is string";
		
		System.out.println(z);
	}
	
	constructorOverloading(char x){
		
		x='L';
		
		System.out.println(x);
	}
	
	
	public static void main(String[] args) {
		
		new constructorOverloading();
		
		new constructorOverloading(15);
		
		new constructorOverloading(true);
		
		new constructorOverloading("ok");
		
		new constructorOverloading('l');
	}
	
	
	
}
