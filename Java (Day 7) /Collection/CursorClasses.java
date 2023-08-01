package Bootcamp.Day7.Collection;

import java.util.ArrayList;

import java.util.Iterator;

public class CursorClasses {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		System.out.println("nums = " + nums);
		
		Iterator<Integer> itr = nums.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
