package Bootcamp.Day7.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class BatchList3 {

	public static void main(String[] args) {
		
		ArrayList<String> batch1 = new ArrayList<>();
		batch1.add("Rohit");
		batch1.add("John");
		batch1.add("Ankit");
		batch1.add("Sourab");
		batch1.add("Rahul");
		
		ArrayList<String> batch2 = new ArrayList<>();
		batch2.add("Anil");
		batch2.add("Manas");
		batch2.add("Rohit");
		batch2.add("Rahul");
		batch2.add("Karan");
		
		System.out.println("Batch1 : " + batch1);
		System.out.println("Batch2 : " + batch2);
		
		batch2.removeAll(batch1);
		System.out.println("Batch2 : " + batch2);
		
		batch2.addAll(batch1);
		System.out.println("Batch2 : " + batch2);
		
		Collections.sort(batch2);
		System.out.println("Final Batch : " + batch2);
		

	}

}
