package Bootcamp.Day6.Exception;

class UserInvalidAgeException extends Exception {
	
	String msg;

	public UserInvalidAgeException(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}
	
}

class Customer2{
	
	public void checkEligibility(int age) throws UserInvalidAgeException {
		
		if(age >= 18)
			System.out.println("Eligible to vote");
		else
			throw new UserInvalidAgeException("Age is not valid");
		
	}
}

public class UserDefinedCheckedException {

	public static void main(String[] args) {
		
		Customer2 customer2 = new Customer2();
		
		try {
			customer2.checkEligibility(27);
		}
		catch (UserInvalidAgeException e) {
			System.out.println(e.getMsg());
		}

	}

}
