package Bootcamp.Day6.Exception;

class InvalidAgeException extends RuntimeException {
	
	String msg;

	public InvalidAgeException(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}
	
}

class Customer{
	
	public void checkEligibility(int age) {
		
		if(age >= 18)
			System.out.println("Eligible to vote");
		else
			throw new InvalidAgeException("Age is less, Minimum should be 18");
		
	}
}

public class UserDefinedException {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		
		try {
			customer.checkEligibility(13);
		}
		catch (InvalidAgeException e) {
			System.out.println(e.getMsg());
		}
		
	}

}
