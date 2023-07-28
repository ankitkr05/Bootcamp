package Bootcamp.Day5.Exception;

import java.util.Scanner;

public class TryCatchDemo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int res;
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println("b must be non-zero");
		}
		finally {
			System.out.println("Finally block executed");
		}
		

	}

}
