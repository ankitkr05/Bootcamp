package Bootcamp.Day5.Practice;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int i=1; i<=10; i++) {
			System.out.println(t + "*" + i + " = " + t*i);
		}

	}

}
