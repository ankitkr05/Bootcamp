package Bootcamp.Day5.StaticDemo;

class Parent{
	
	int id;
	public Parent(int id) {
		System.out.println("Parent constructor " + id);
	}
	
	public Parent() {
		System.out.println("Default Parent constructor");
	}
}

class Child extends Parent{
	
	public Child() {
		super();
		System.out.println("Child constructor");
	}
	
}

public class Inheritance {

	public static void main(String[] args) {
		
		Child child = new Child();
		

	}

}
