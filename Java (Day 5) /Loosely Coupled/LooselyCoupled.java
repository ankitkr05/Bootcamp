package Bootcamp.Day5.Looselycoupling;

interface Breakfast{
	
	void eat();
	void make();
	
}

class Idly implements Breakfast{

	public void eat() {
		System.out.println("Eating Idly");
	}

	public void make() {
		System.out.println("Give steam for 10 mins in the cooker");
	}
	
}

class Dosa implements Breakfast{

	public void eat() {
		System.out.println("Eating Dosa");
	}

	public void make() {
		System.out.println("Cook in pan for 2 mins");
	}
	
}

public class LooselyCoupled {

	public static void main(String[] args) {
		
		Breakfast breakfast = new Idly();
		breakfast.make();
		breakfast.eat();
	}

}
