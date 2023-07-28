package Bootcamp.Day5.StaticDemo;

public class StaticDemo {
	
	static {
		
		System.out.println("This is static block 1");
		
	}

	public static void main(String[] args) {
		
		System.out.println("This is main block");

	}
	
	// Static is used for memory management
	// Static property is called using class reference
	// Whenever we want to share common property to all the object, then we declare as static
	
	static {
		
		System.out.println("This is static block 2");
		
	}

}
