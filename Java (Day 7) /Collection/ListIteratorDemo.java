package Bootcamp.Day7.Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		System.out.println("nums = " + nums);
		
		ListIterator<Integer> listItr = nums.listIterator();
		
		System.out.println("Backward direction");
		while(listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
		
		System.out.println("Forward direction");
		while(listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		
		System.out.println("Backward direction");
		while(listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
		

	}

}
