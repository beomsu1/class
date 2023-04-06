package chapter11;

import java.util.ArrayList;
import java.util.List;

public class PlayerList {
	
	public static void main(String[] args) {
		
		List<FootballPlayer> list = new ArrayList<>();
		list.add(new FootballPlayer("마운트", 19 , "첼시", 24));
		list.add(new FootballPlayer("제임스", 24 , "첼시", 23));
		list.add(new FootballPlayer("칠웰", 21 , "첼시", 26));
		list.add(new FootballPlayer("엔조", 5 , "첼시", 22));
		
		for(FootballPlayer player: list) {
			System.out.println(player);
		}
	}
	
}
