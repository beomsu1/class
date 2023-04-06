package chapter11;

import java.util.HashMap;

public class PlayerMap {
	
	public static void main(String[] args) {
		
		HashMap<String, FootballPlayer> hashMap = new HashMap<>();
		
		hashMap.put("첼", new FootballPlayer("칠웰", 21 , "첼시", 26));
		hashMap.put("시", new FootballPlayer("제임스", 24, "첼시", 23));
		
		System.out.println(hashMap.get("첼"));
		System.out.println(hashMap.get("시"));
		
		
	}
}
