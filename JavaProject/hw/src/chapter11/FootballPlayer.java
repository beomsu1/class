package chapter11;

public class FootballPlayer implements Comparable<FootballPlayer>{

	private String name;
	private int number;
	private String team;
	private int age;
	
	public FootballPlayer(String name, int number, String team, int age) {
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
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
		return name.charAt(name.length()-1); // 유니코드로 비교하기 위해서 사용
	}

	@Override
	public boolean equals(Object obj) {
		
		
		if(obj != null && obj instanceof FootballPlayer) {
			FootballPlayer fbp = (FootballPlayer)obj; // 강제 형 변환
			if(team.equals(fbp.getTeam())&&name.equals(fbp.getName())&&age==fbp.getAge()); // 정수비교는 ==
			return true;
		}
		
		return false;
		
	}

	@Override
	public String toString() {
		return "선수 정보 [이름 : " + name + " , 등번호 : " + number + "번 , 소속팀 : " + team + " , 나이 : " + age + "]";
	}

	@Override
	public int compareTo(FootballPlayer f) { 
		
		int compare = team.compareTo(f.getTeam());
		if(compare == 0) {
			compare = name.compareTo(f.getName());
			if(compare==0) {
				compare = number-f.getNumber();
			}
		}
		
		return compare;
	}



	
	
}
