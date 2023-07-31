package Bootcamp.Day6.Collection;

import java.util.ArrayList;

public class GenericCollection {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		//nums.add("manish");
		
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("aaple");
		fruits.add("banana");
		fruits.add("mango");
		
		Product p1 = new Product(2, "shirt", 4500, "mens cloth");
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product(1, "laptop", 68000, "electronics"));
		products.add(p1);
		
		for(Product product : products) {
			System.out.println(product);
		}

	}

}
