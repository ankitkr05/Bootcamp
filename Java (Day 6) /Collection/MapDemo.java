package Bootcamp.Day6.Collection;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<String, String> hm = new HashMap<>();
		hm.put("sachin", "batsman");
		hm.put("dhoni", "wicketkeeper");
		hm.put("bumrah", "bowler");
		hm.put("dhoni", "captain");
		
		System.out.println(hm);

	}

}
