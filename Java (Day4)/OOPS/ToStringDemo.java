package Bootcamp.Day4.OOPS;

class Employee {
	
	int id;
	String name;
	String dept;
	
	public Employee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	@Override
	public String toString() {
		
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
	
	
}
public class ToStringDemo {

	public static void main(String[] args) {
		
		int salary = 45000;
		Employee employee = new Employee(1001, "Kapa", "GNT");
		System.out.println(salary);
		System.out.println(employee);

	}

}
