package Bootcamp.Day5.Polymorphism;

class Flipkart{
	
	void filter() {
		System.out.println("Default Search");
	}
	
	void filter(int price) {
		System.out.println("Filter by price");
	}
	
	void filter(String brand) {
		System.out.println("Filter by brand");
	}
	
	void filter(String brand, int price) {
		System.out.println("Filter by brand and price");
	}
	
}

public class OverloadingDemo {

	public static void main(String[] args) {
		
		Flipkart flipkart = new Flipkart();
		flipkart.filter("Skechers", 7000);
		
	}

}
