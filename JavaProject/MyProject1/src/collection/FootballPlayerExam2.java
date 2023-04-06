package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class FootballPlayerExam2 implements Comparable<FootballPlayerExam2> {

	private String name;
	private int number;
	private String team;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public FootballPlayerExam2(String name, int number, String team, int age) {
		super();
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}

	@Override
	public String toString() {
		return "FootballPlayerExam2 [name=" + name + ", number=" + number + ", team=" + team + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return name.charAt((name.length()) - 1);
	}

	@Override
	public boolean equals(Object obj) {

		boolean result = false;

		if (obj != null && obj instanceof FootballPlayerExam2) {
			FootballPlayerExam2 player = (FootballPlayerExam2) obj;
			result = team.equals(player.getTeam()) && name.equals(player.getName()) && age == player.getAge();

		}

		return result;

	}

	public int compareTo(FootballPlayerExam2 f) {

		int compare = team.compareTo(f.getTeam());
		if(compare ==0) { 
			name.compareTo(f.getName());
			if(compare==0) {
				compare = this.number - f.getNumber();
			}
			
		}
		
		
		return compare;
	}

	public static void main(String[] args) {

		Set<FootballPlayerExam2> playerSet = new HashSet<>();
		playerSet.add(new FootballPlayerExam2("이강인", 19, "마요르카", 22));
		playerSet.add(new FootballPlayerExam2("이강인", 17, "마요르카", 22));
		playerSet.add(new FootballPlayerExam2("황희찬", 26, "울버햄튼", 27));
		playerSet.add(new FootballPlayerExam2("황인범", 33, "올림피아코스", 26));

		System.out.println("요소의 개수 : " + playerSet.size());
		for (FootballPlayerExam2 f : playerSet) {
			System.out.println(f);
		}

		System.out.println("--------------3번---------------");
		TreeSet<FootballPlayerExam2> playerTree = new TreeSet<>();
		playerTree.add(new FootballPlayerExam2("이강인", 19, "마요르카", 22));
		playerTree.add(new FootballPlayerExam2("이강인", 17, "마요르카", 22));
		playerTree.add(new FootballPlayerExam2("황희찬", 26, "마요르카", 27));
		playerTree.add(new FootballPlayerExam2("손흥민", 7, "토트넘", 30));
		playerTree.add(new FootballPlayerExam2("황인범", 33, "올림피아코스", 26));

		System.out.println("요소의 개수 : " + playerTree.size());
		for (FootballPlayerExam2 t : playerTree) {
			System.out.println(t);
		}
	}

}
