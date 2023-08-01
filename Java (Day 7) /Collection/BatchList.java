package Bootcamp.Day7.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class BatchList {

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
		
		ArrayList<String> batch = new ArrayList<>();
		batch.addAll(batch1);
		
		for(String ele : batch2) {
			if(!batch.contains(ele))
				batch.add(ele);
		}
		
		Collections.sort(batch);
		
		System.out.println("Batch : " + batch);

	}

}
