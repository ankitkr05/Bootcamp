package Bootcamp.Day6.Collection;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList obj = new ArrayList();
		System.out.println("Size of arraylist before adding " + obj.size());
		System.out.println("Elements of the list before adding: " + obj);
		obj.add(1);
		obj.add("hello");
		obj.add(12.45);
		obj.add("hi");
		obj.add("hi");
		System.out.println("Size of arraylist after adding " + obj.size());
		System.out.println("Elements of the list: " + obj);
		
		obj.set(2,  "java");
		System.out.println("Elements of the list: " + obj);
		
		obj.remove(2);
		System.out.println("Elements of the list: " + obj);
		
		//obj.remove(1);    // Removes the index 1
		obj.remove(Integer.valueOf(1));    // Removes the object
		System.out.println("Elements of the list: " + obj);
		
		System.out.println("Element contains: " + obj.contains("hello"));
		
		obj.clear();
		System.out.println("After clear: " + obj);

	}

}
