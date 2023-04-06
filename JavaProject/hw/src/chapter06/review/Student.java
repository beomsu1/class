package chapter06.review;

public class Student {
	
	private String name;
	private int korScore;
	private int engScore;
	private int mathScore;
	
	public Student(String name, int korScore, int engScore, int mathScore) {
		super();
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorScore() {
		return korScore;
	}
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	@Override
	public String toString() {
		return result();
	}

	private int sum() {
		return korScore + engScore + mathScore;
	}
	
	private float avg() {
		return sum() / 3f;
	}
	
	private String result() {
		return (name+"\t"+korScore+"\t"+engScore+"\t"+mathScore+"\t"+sum()+"\t"+avg());
	}
	
	public static void main(String[] args) {
		
		Student[] s = new Student[10];
		
		s[0] = new Student("김민재",100,90,80);
		s[1] = new Student("김재민",70,80,80);
		s[2] = new Student("김민지",50,70,40);
		s[3] = new Student("김지민",20,40,40);
		s[4] = new Student("김주민",30,60,50);
		s[5] = new Student("김민주",20,90,88);
		s[6] = new Student("김재칙",80,40,40);
		s[7] = new Student("김칙재",70,30,20);
		s[8] = new Student("김친재",20,20,30);
		s[9] = new Student("김재친",20,10,40);
		
		System.out.println("이름\t국어성적\t영어성적\t수학성적\t총점\t평균");
		for(int i =0; i<s.length ; i++) {
			System.out.println(s[i]);
		}
	} 	
}
