package Bootcamp.Day4.OOPS;

class Car{
	
	int modelNo;
	String brandName;
	int kilometerDriven;
	
	String checkCarStatus() {
		
		if(kilometerDriven <= 5000)
			return "It is a New Car";
		else if(kilometerDriven > 5000 && kilometerDriven <= 20000)
			return "Car is in good condition";
		return "Car is old";
	}
	
	void displayCarDetails() {
		
		System.out.println("modelNo : " + modelNo);
		System.out.println("brandName : " + brandName);
		
	}
}



public class CarApp {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.modelNo = 2022;
		car.brandName = "Honda";
		car.kilometerDriven = 12000;
		
		Car car2 = new Car();
		car2.modelNo = 2019;
		car2.brandName = "Nexa";
		car2.kilometerDriven = 4000;
		
		System.out.println(car2.checkCarStatus());
		
		car.displayCarDetails();
		
	}

}
