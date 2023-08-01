package Bootcamp.Day7.Collection;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<String, String> hm = new HashMap<>();
		hm.put("sachin", "batsman");
		hm.put("dhoni", "wicketkeeper");
		hm.put("bumrah", "bowler");
		hm.put("dhoni", "captain");
		System.out.println(hm);
		System.out.println(hm.get("sachin"));
		System.out.println(hm.get("dhoni"));
		
		System.out.println("Get all values : " + hm.values());
		System.out.println("Get all key : " + hm.keySet());
		
		for(String key : hm.keySet()) {
			System.out.println("Key : " + key + " Value : " + hm.get(key));
		}

	}

}
