package Bootcamp.Day7.Collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<Integer> nums = new Stack<>();
		nums.add(1);
		nums.push(2);
		nums.push(3);
		System.out.println("Elements : " + nums);
		nums.pop();
		System.out.println("Elements : " + nums);
		nums.pop();
		System.out.println("Elements : " + nums);

	}

}
