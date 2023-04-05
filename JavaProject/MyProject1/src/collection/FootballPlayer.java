package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
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
		//  축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다. 
		ArrayList<FootballPlayer> players = new ArrayList<FootballPlayer>();
		players.add(new FootballPlayer("이강인" , 19 , "마요르카" , 22));
		players.add(new FootballPlayer("황희찬" , 26 , "울버햄튼" , 27));
		players.add(new FootballPlayer("김민재" , 3 , "나폴리" , 26));
		players.add(new FootballPlayer("황인범" , 33 , "올림피아코스" , 26));
		
		Iterator<FootballPlayer> itr = players.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		
		System.out.println("----------------");
		
		
		// 축구선수의 인스턴스가 팀과 이름 그리고 나이가 같으면 같은 선수라 판단하고 
		// 입력이 되지 않도록 Set<E> 컬렉션을 이용해서 축구선수 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.
		Set<FootballPlayer> players1 = new HashSet<>();
			players1.add(new FootballPlayer("이강인" , 19 , "마요르카" , 22));
			players1.add(new FootballPlayer("황희찬" , 26 , "울버햄튼" , 27));
			players1.add(new FootballPlayer("김민재" , 3 , "나폴리" , 26));
			players1.add(new FootballPlayer("황인범" , 33 , "올림피아코스" , 26));
			players1.add(new FootballPlayer("황희찬" , 26 , "울버햄튼" , 27));

			for()

		System.out.println();
		
		// TreeSet<E>을 이용해서 팀 이름순으로 정렬하고, 
		// 같은 팀의 선수들은 이름 순으로 정렬하고, 같은 이름의 선수는 번호 순으로
		// 저장하는 프로그램을 만들어 봅시다
		
		TreeSet<FootballPlayer> players2 = new TreeSet<FootballPlayer>();
		
	}

}
