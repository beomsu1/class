package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FootballPlayer {

	String name;
	int number;
	String team;
	int age;

	public FootballPlayer(String name, int number, String team, int age) {
		super();
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}

	@Override
	public String toString() {
		return "선수 정보 [이름 : " + name + ", 등번호 : " + number + "번 , 소속팀 : " + team + ", 나이 : " + age + "]";
	}

	public static void main(String[] args) {
		// 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.
		List<FootballPlayer> players = new ArrayList<FootballPlayer>();
		players.add(new FootballPlayer("이강인", 19, "마요르카", 22));
		players.add(new FootballPlayer("황희찬", 26, "울버햄튼", 27));
		players.add(new FootballPlayer("김민재", 3, "나폴리", 26));
		players.add(new FootballPlayer("황인범", 33, "올림피아코스", 26));

		Iterator<FootballPlayer> itr = players.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}
}
