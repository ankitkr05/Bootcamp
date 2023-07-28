package Bootcamp.Day5.Polymorphism;

class RBI{
	
	void holiday() {
		System.out.println("2nd and 4th week holiday");
	}
	
	void dailylimit() {
		System.out.println("1 Lakh");
	}
	
}

class SBI extends RBI{
	
	void dailylimit() {
		System.out.println("2 Lakh");
	}
	
	void sbirule() {
		System.out.println("All day working");
	}
	
}

class Axis extends RBI{
	
	
}

public class OverridingDemo {

	public static void main(String[] args) {
		
		SBI sbi = new SBI();
		sbi.dailylimit();
		sbi.holiday();
		sbi.sbirule();
		
		RBI sbi2 = new SBI();
		sbi2.dailylimit();
		sbi2.holiday();

	}

}
