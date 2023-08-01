package Bootcamp.Day7.Collection;

import java.util.ArrayList;
import java.util.Collections;

import Bootcamp.Day6.Collection.Product;

public class SortingDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(5);
		nums.add(2);
		nums.add(4);
		nums.add(6);
		
		Collections.sort(nums);
		
		ArrayList<Product> products = new ArrayList<>();
		products.add(new Product(1, "laptop", 65000, "electronics"));
		products.add(new Product(2, "shirt", 4000, "men clothing"));
		products.add(new Product(3, "mobile", 39000, "electronics"));
		
		//Collections.sort(products);
		
		

	}

}
