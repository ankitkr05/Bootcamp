package Bootcamp.Day6.Collection;

import java.util.ArrayList;

public class IterateElements {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		
		for(Integer num : nums) {
			System.out.println(num);
		}

	}

}
