package Bootcamp.Day5.Exception;

public class FinallyBlock {

	public static void main(String[] args) {
		
		try {
			System.out.println(2/2);
		}
		catch(Exception e) {
			System.out.println("Catch block called");
		}
		finally {
			System.out.println("Finally block called");
		}

	}

}
