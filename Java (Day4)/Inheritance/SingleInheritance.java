package Bootcamp.Day4.Inheritance;

class Parent{
	
	void mothertongue() {
		System.out.println("Hindi");
	}
}

class Child extends Parent{
	
	void mothertongue() {
		super.mothertongue();
		System.out.println("English");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		
		Child child = new Child();
		child.mothertongue();

	}

}
