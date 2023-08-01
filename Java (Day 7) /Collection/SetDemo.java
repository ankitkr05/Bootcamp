package Bootcamp.Day7.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		// Own order
		HashSet<String> fruits = new HashSet<>();
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("mango");
		fruits.add("apple");
		fruits.add("pineapple");
		fruits.add("apple");
		System.out.println("fruits : " + fruits);
		
		// Insertion order
		LinkedHashSet<String> fruits2 = new LinkedHashSet<>();
		fruits2.add("mango");
		fruits2.add("banana");
		fruits2.add("mango");
		fruits2.add("apple");
		fruits2.add("pineapple");
		fruits2.add("apple");
		System.out.println("fruits2 : " + fruits2);
		
		// Sorted order
		
		TreeSet<String> fruits3 = new TreeSet<>();
		fruits3.add("mango");
		fruits3.add("banana");
		fruits3.add("mango");
		fruits3.add("apple");
		fruits3.add("pineapple");
		fruits3.add("apple");
		System.out.println("fruits3 : " + fruits3);

	}

}
