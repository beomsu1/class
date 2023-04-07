package collection.exam;

import java.util.HashMap;

public class HashMapMain {

	public static void main(String[] args) {

		// 나의 팀을 구성하고 싶다 -> 선수들을 저장할 수 있는 공간을 생성하고 선수들을 저장

		HashMap<Integer, FootballPlayer2> myTeam = new HashMap<>();
		myTeam.put(7, new FootballPlayer2("손흥민", 7, "토트넘", 30));
		myTeam.put(18, new FootballPlayer2("이강인", 18, "마요르카", 22));
		myTeam.put(13, new FootballPlayer2("박지성", 13, "맨체스터유나이티드", 41));

		System.out.println(myTeam.get(7));
		System.out.println(myTeam.get(18));
		System.out.println(myTeam.get(13));

	}

}
