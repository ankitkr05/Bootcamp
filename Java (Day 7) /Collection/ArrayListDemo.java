package Bootcamp.Day7.Collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>(100);
		names.add("anil");
		names.add("ankit");
		names.add("saurav");
		
		System.out.println(names.get(20));

	}

}
