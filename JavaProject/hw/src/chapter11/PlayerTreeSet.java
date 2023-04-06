package chapter11;

import java.util.TreeSet;

public class PlayerTreeSet {

	public static void main(String[] args) {

		TreeSet<FootballPlayer> treeSet = new TreeSet<>();
		treeSet.add(new FootballPlayer("마운트", 19, "첼시", 24));
		treeSet.add(new FootballPlayer("제임스", 24, "첼시", 23));
		treeSet.add(new FootballPlayer("칠웰", 21, "첼시", 26));
		treeSet.add(new FootballPlayer("엔조", 5, "첼시", 22));
		treeSet.add(new FootballPlayer("하베르츠", 29, "첼시", 23));
		
		for(FootballPlayer player : treeSet) {
			System.out.println(player);
		}
	}

}
