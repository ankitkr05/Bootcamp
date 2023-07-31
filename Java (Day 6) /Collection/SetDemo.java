package Bootcamp.Day6.Collection;

import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet();
		hashSet.add("apple");
		hashSet.add("mango");
		hashSet.add("apple");
		hashSet.add("apple");
		hashSet.add("banana");
		
		System.out.println(hashSet);

	}

}
