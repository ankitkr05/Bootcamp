package Bootcamp.Day7;

public class Calculation {

	public int addition(int a, int b) {
		return a + b;
	}
	
	public int subtraction(int a, int b) {
		return a - b;
	}
	
	public boolean checkEligibility(int age) {
		if(age <= 18)
			return false;
		return true;
	}

}
