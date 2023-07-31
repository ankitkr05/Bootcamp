package Bootcamp.Telstra.app;

import Bootcamp.Telstra.model.Employee;

public class LombokDemo {

	public static void main(String[] args) {
		
		Employee employee = new Employee(1, "Adarsha", "Data");
		Employee employee2 = new Employee();
		employee2.setId(2);
		employee2.setName("Kapa");
		employee2.setDept("GNT");
		
		System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getDept());
		System.out.println(employee2.getId() + " " + employee2.getName() + " " + employee2.getDept());
		System.out.println(employee);

	}

}
