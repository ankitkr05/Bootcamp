package Bootcamp.Day5.StaticDemo;


class Emp{
	
	int id;
	String name;
	static String dept;
	
}

public class Employee {

	public static void main(String[] args) {
		
		Emp.dept = "Developer";
		
		Emp e1 = new Emp();
		e1.id = 1;
		e1.name = "Pratyush";
		e1.dept = "dept1";
		
		Emp e2 = new Emp();
		e2.id = 2;
		e2.name = "Gaurav";
		e2.dept = "dept2";
		
		Emp e3 = new Emp();
		e3.id = 3;
		e3.name = "Preetam";
		e3.dept = "dept3";
		
		System.out.println(e1.id + " " + e1.name + " " + e1.dept);
		System.out.println(e2.id + " " + e2.name + " " + e2.dept);
		System.out.println(e3.id + " " + e3.name + " " + e3.dept);

	}

}
