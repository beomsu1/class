package chapter11;

import java.util.HashSet;
import java.util.Set;

public class PlayerHashSet {
	
	public static void main(String[] args) {
		
		Set<FootballPlayer> hashSet = new HashSet<>();
		hashSet.add(new FootballPlayer("마운트", 19 , "첼시", 24));
		hashSet.add(new FootballPlayer("마운트", 19 , "첼시", 24));
		hashSet.add(new FootballPlayer("제임스", 24 , "첼시", 23));
		hashSet.add(new FootballPlayer("제임스", 24 , "첼시", 23));
		hashSet.add(new FootballPlayer("칠웰", 21 , "첼시", 26));
		hashSet.add(new FootballPlayer("엔조", 5 , "첼시", 22));
		hashSet.add(new FootballPlayer("하베르츠", 29 , "첼시", 23));
		
		for(FootballPlayer player : hashSet) {
			System.out.println(player);
		}
	}
}
