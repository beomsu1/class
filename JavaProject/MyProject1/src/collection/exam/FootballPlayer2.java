package collection.exam;


// 축구선수의 정보를 저장하는 클래스 : 축구선수 데이터저장 -> 인스턴스 생성
public class FootballPlayer2 implements Comparable<FootballPlayer2> {

	private String name;
	private int number;
	private String team;
	private int age;

	public FootballPlayer2(String name, int number, String team, int age) {
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}

	public FootballPlayer2() {
		// 기본생성자
	}

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

	@Override
	public int hashCode() {
		return this.age;
	}

	@Override
	public boolean equals(Object obj) {

		boolean result = false;

		if (obj != null && obj instanceof FootballPlayer2) { // null이 아니고 변수를 가지고 있는 클래스로 형변환이 가능한지.
			FootballPlayer2 player = (FootballPlayer2) obj;
			result = this.team.equals(player.getTeam()) && this.name.equals(player.getName())
					&& this.age == player.getAge();
		}

		return result;
	}

	@Override
	public String toString() {
		return "FootballPlayer2 [name=" + name + ", number=" + number + ", team=" + team + ", age=" + age + "]";
	}

	public void showInfo() {
		System.out.printf("[%s] %s(%d, %d)\n", this.team, this.name, this.number, this.age);
	}

	@Override
	public int compareTo(FootballPlayer2 o) {

		int compare = this.team.compareTo(o.getTeam());
		if(compare ==0 ) {
			this.name.compareTo(o.getName());
			if(compare==0) {
				compare = this.number - o.getNumber();
				//compare = Integer.compare(this.number,o.getNumber());
			}
		}
		
		
		return compare;
	}

}
