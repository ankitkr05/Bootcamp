package Bootcamp.Day7.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(7);
		nums.add(23);
		nums.add(13);
		nums.add(4);
		nums.add(13);
		
		System.out.println("Before sorting = " + nums);
		
		Collections.sort(nums);
		
		System.out.println("After sorting = " + nums);
		
		Collections.reverse(nums);
		
		System.out.println("After reverse : " + nums);
		
		System.out.println("min : " + Collections.min(nums));
		System.out.println("max : " + Collections.max(nums));

	}

}
