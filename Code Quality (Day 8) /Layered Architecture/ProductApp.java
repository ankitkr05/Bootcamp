package Bootcamp.Day8.App;

import java.util.ArrayList;
import java.util.Scanner;

import Bootcamp.Day8.Model.Product;
import Bootcamp.Day8.Service.ProductService;

public class ProductApp {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter how many products you want to enter");
		int size = s.nextInt();
		
		ProductService productService = new ProductService();
		
		for(int i=1; i<=size; i++) {
			
			System.out.println("Enter product id");
			int id = s.nextInt();
			
			System.out.println("Enter product name");
			String name = s.next();
			
			System.out.println("Enter product category");
			String category = s.next();
			
			System.out.println("Enter product price");
			int price = s.nextInt();
			
			Product product = new Product(id, name, category, price);
			productService.addProduct(product);
			
		}
		
		ArrayList<Product> products = productService.getAllProducts();
		for(Product product : products) {
			System.out.println(product);
		}
		
		
		

	}

}
