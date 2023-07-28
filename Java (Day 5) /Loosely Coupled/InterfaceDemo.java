package Bootcamp.Day5.Looselycoupling;

interface Bank{
	
	int salary = 5000;
	
	void greet();
}

interface RBI extends Bank{
	
	void greet();
	
}

class Axis implements RBI{
	
	public void greet() {
		System.out.println("Welcome all ...");
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		
		Axis axis = new Axis();
		axis.greet();
		
		Bank bank = new Axis();
		bank.greet();

	}

}
