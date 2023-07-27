package Bootcamp.Day4.Encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
//		employee.id = 1;          -----> Directly we cannot access itn  
//		employee.name = "Gaurav";
		employee.setId(1);
		employee.setName("Gaurav");
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		

	}

}
