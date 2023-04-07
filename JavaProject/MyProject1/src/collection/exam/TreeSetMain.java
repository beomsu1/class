package collection.exam;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
		
		// 나의 팀을 구성하고 싶다 -> 선수들을 저장할 수 있는 공간을 생성하고 선수들을 저장
		
//		ArrayList<FootballPlayer2> myTeam = new ArrayList<>();
		Set<FootballPlayer2> myTeam = new TreeSet<>();
		myTeam.add(new FootballPlayer2("손흥민", 7, "토트넘", 30));
		myTeam.add(new FootballPlayer2("이강인", 18, "마요르카", 22));
		myTeam.add(new FootballPlayer2("박지성", 13, "맨체스터유나이티드", 41));
		myTeam.add(new FootballPlayer2("손흥민", 17, "토트넘", 30));
		myTeam.add(new FootballPlayer2("루니", 8, "맨유", 40));
		myTeam.add(new FootballPlayer2("호날두", 7, "맨유", 30));
		
		System.out.println("나의 팀 선수 정보");
		for(FootballPlayer2 player : myTeam) {
			player.showInfo();
		}
		
		myTeam.stream().forEach((FootballPlayer2 p)-> p.showInfo());
		myTeam.stream().forEach(System.out::println);
		
	}

}
