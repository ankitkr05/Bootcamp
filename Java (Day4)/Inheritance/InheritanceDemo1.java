package Bootcamp.Day4.Inheritance;

class Person {
	
	public Person() {
		System.out.println("Person Constructor");
	}
}

class Employee extends Person {
	
	public Employee() {
		System.out.println("Employee Constructor");
	}
}

public class InheritanceDemo1 {

	public static void main(String[] args) {
		
		Person person = new Person();
		Employee employee = new Employee();
	}

}
