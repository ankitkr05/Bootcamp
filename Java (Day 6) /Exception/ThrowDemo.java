package Bootcamp.Day6.Exception;

import java.io.IOException;

class User{
	
	// Throwing unchecked (runtime) exception
	public void checkEligibility(int age) {
		
		if(age >= 18)
			System.out.println("You are eligible to vote");
		else
			throw new ArithmeticException("You are not eligible to vote");
	}
	
	// Throwing checked (compile time) exception
	public void checkEligibility2(int age) throws IOException {
		
		if(age >= 18)
			System.out.println("You are eligible to vote");
		else
			throw new IOException("You are not eligible to vote");
		
	}
}

public class ThrowDemo {

	public static void main(String[] args) throws IOException {
		
		User user = new User();
		try {
			user.checkEligibility(21);
			user.checkEligibility2(14);
		}
		catch (Exception e) {
			System.out.println("Something went wrong");
		}
		

	}

}
