package Bootcamp.Day4.Inheritance;

class Bank{
	
	int amount = 1;  // Global

}

class Axis extends Bank{
	
	int amount = 2;  // Global
	void test() {
		int amount = 3;   // Local
		System.out.println(super.amount);
		System.out.println(this.amount);
		System.out.println(amount);
		
	}
}

public class SuperDemo {

	public static void main(String[] args) {
		
		Axis axis = new Axis();
		axis.test();

	}

}
