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
		return this.name.charAt(name.length()-1);
	}

	@Override
	public boolean equals(Object obj) {
		
		
		if(obj != null && obj instanceof FootballPlayer) {
			FootballPlayer fbp = (FootballPlayer)obj;
			if(team.equals(fbp.getTeam())&&name.equals(fbp.getName())&&age==fbp.getAge());
			return true;
		}
		
		return false;
		
	}

	@Override
	public String toString() {
		return "선수 정보 [이름 : " + name + " , 등번호 : " + number + "번 , 소속팀 : " + team + " , 나이 : " + age + "]";
	}

	@Override
	public int compareTo(FootballPlayer o) {
		
		int compare = team.compareTo(o.getTeam());
		if(compare == 0) {
			compare = name.compareTo(o.getName());
			if(compare==0) {
				compare = number-o.getNumber();
			}
		}
		
		return compare;
	}



	
	
}
