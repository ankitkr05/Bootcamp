package Bootcamp.Day8.Service;

import java.util.ArrayList;

import Bootcamp.Day8.Model.Product;
import Bootcamp.Day8.Util.AppConstant;

public class ProductService {
	
	// Data will be store in this arraylist
	private ArrayList<Product> products = new ArrayList();
	
	public String addProduct(Product product) {
		
		products.add(product);
		return AppConstant.INSERTED_INFO;
		
	}
	
	public ArrayList<Product> getAllProducts(){
		return products;
	}
	
	public void getProductByCategory(String category){
		
		for(Product product : products) {
			if(product.getCategory().equalsIgnoreCase(category))
				System.out.println(product);
		}
	}
	
	

}
