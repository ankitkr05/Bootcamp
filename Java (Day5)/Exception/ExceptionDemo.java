package Bootcamp.Day5.Exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		System.out.println("Get ready");
		try {
			System.out.println(2/0);
		}
		catch(Exception e){
			System.out.println("Something went wrong");
		}
		System.out.println("Have breakfast");
		System.out.println("Drive for 10 kms");
		System.out.println("Login and start your day");

	}

}
